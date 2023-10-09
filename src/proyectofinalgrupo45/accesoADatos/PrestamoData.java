package proyectofinalgrupo45.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalgrupo45.entidades.Ejemplar;
import proyectofinalgrupo45.entidades.Lector;
import proyectofinalgrupo45.entidades.Libros;
import proyectofinalgrupo45.entidades.Prestamo;

public class PrestamoData {

    private Connection con = null;
    private LectorData l;
    private EjemplarData ed;
    private Prestamo p;
    private LibroData ld;
    private Lector lt;

    public PrestamoData() {

        p = new Prestamo();
        ld = new LibroData();
        l = new LectorData();
        ed = new EjemplarData();
        lt = new Lector();

        con = Conexion.getConexion();
    }

    public void solicitarLibro(Prestamo p) {

        String sql = "INSERT INTO prestamo (idLector, idEjemplar, fechap, fechad, estado) VALUES (?, ?, ?, ?, ?)";
        String sql2 = "UPDATE ejemplar SET cantidad = cantidad - 1 WHERE idEjemplar = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, p.getLector().getIdLector());
            ps.setInt(2, p.getEjemplar().getIdEjemplar());
            ps.setDate(3, Date.valueOf(p.getFechaInicio()));
            ps.setDate(4, Date.valueOf(p.getFechaFin()));
            ps.setBoolean(5, p.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                p.setIdPrestamo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Prestamo Guardado: " + p.toString());

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el prestamo");
            }

            ps.close();

            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, p.getEjemplar().getIdEjemplar());
            ps2.executeUpdate();
            ps2.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo: " + ex.getMessage());
        }
    }

    public void devolverLibro(int idLector, int idEjemplar) {

        String sql = "DELETE FROM prestamo WHERE idLector = ? AND idEjemplar = ?";
        String sql2 = "UPDATE ejemplar SET cantidad = cantidad + 1 WHERE idEjemplar = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLector);
            ps.setInt(2, idEjemplar);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {

                PreparedStatement ps2 = con.prepareStatement(sql2);
                ps2.setInt(1, idEjemplar);
                ps2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Prestamo eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró una prestamo para eliminar");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo: " + ex.getMessage());
        }
    }

    public List<Prestamo> listarLectoresYLibros() {
        String sql = "SELECT l.nombre AS nombre_lector, lb.nombre AS nombre_libro "
                + "FROM prestamo p JOIN lector l ON p.idLector = l.idLector "
                + "JOIN ejemplar e ON p.idEjemplar = e.idEjemplar "
                + "JOIN libro lb ON e.idLibro = lb.idLibro "
                + "WHERE p.estado = 1;";

        List<Prestamo> prestamos = new ArrayList<>();

        try (PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                int ie = rs.getInt("idEjemplar");
                p.setEjemplar((Ejemplar) ed.buscarEjemplar(ie));
                int il = rs.getInt("idLector");
                p.setLector(l.buscarlector(il));
                p.setEstado(true);

                prestamos.add(p);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tablas");
            ex.printStackTrace();
        }

        return prestamos;
    }

    public List<Lector> listarLectores() {
        String sql = "SELECT l.nombre FROM prestamo p JOIN lector l ON p.idLector = l.idLector "
                + "WHERE p.estado = 1 and l.estado = 1";

        List<Lector> lector = new ArrayList<>();

        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); 

            while (rs.next()) {
             Lector lec = new Lector();
                lec.setNombre(rs.getString("nombre"));
                lec.setEstado(true);
                lector.add(lt);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tablas");
            ex.printStackTrace();
        }

        return lector;
    }

}

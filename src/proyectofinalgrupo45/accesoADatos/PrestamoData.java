package proyectofinalgrupo45.accesoADatos;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalgrupo45.entidades.Ejemplar;
import proyectofinalgrupo45.entidades.Prestamo;

public class PrestamoData {

    private Connection con = null;

    public PrestamoData() {

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

        String sql = "SELECT * FROM prestamo WHERE estado = 1 ";

        List<Prestamo> prestamo = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Prestamo p = new Prestamo();
                LectorData l = new LectorData();
                EjemplarData ed = new EjemplarData();
               
                p.setIdPrestamo(rs.getInt("idPrestamo"));

                int il = rs.getInt("idLector");
                p.setLector(l.buscarlector(il));

                int ie = rs.getInt("idEjemplar");
                p.setEjemplar((Ejemplar) ed.buscarEjemplar(ie));

                p.setFechaInicio(rs.getDate("fechap").toLocalDate());
                p.setFechaFin(rs.getDate("fechad").toLocalDate());
                p.setEstado(true);
                prestamo.add(p);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tabla prestamo " + ex.getMessage());
            ex.printStackTrace();
        }

        return prestamo;
    }
    
    public List<Prestamo> obtenerLectoresPrestamoVencido(){
        
        String sql = "SELECT * FROM prestamo WHERE NOW() > fechad AND estado = 1 ";

        List<Prestamo> prestamo = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Prestamo p = new Prestamo();
                LectorData l = new LectorData();
               
                p.setIdPrestamo(rs.getInt("idPrestamo"));

                int il = rs.getInt("idLector");
                p.setLector(l.buscarlector(il));

                p.setFechaInicio(rs.getDate("fechap").toLocalDate());
                p.setFechaFin(rs.getDate("fechad").toLocalDate());
                p.setEstado(true);
                prestamo.add(p);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tabla prestamo " + ex.getMessage());
            ex.printStackTrace();
        }

        return prestamo;
    
        
        
    }
    
     public List<Prestamo> obtenerLibrosFechaDeterminada(LocalDate f) {

         List<Prestamo> prestamo = new ArrayList<>();
        String sql = "SELECT * FROM prestamo WHERE fechap = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(f));
            ResultSet rs = ps.executeQuery();
            
             while (rs.next()) {

                Prestamo p = new Prestamo();
                EjemplarData ed = new EjemplarData();
               
                p.setIdPrestamo(rs.getInt("idPrestamo"));

                int ie = rs.getInt("idEjemplar");
                p.setEjemplar((Ejemplar) ed.buscarEjemplar(ie));

                p.setFechaInicio(rs.getDate("fechap").toLocalDate());
                p.setFechaFin(rs.getDate("fechad").toLocalDate());
                p.setEstado(true);
                prestamo.add(p);
          
             }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo: " + ex.getMessage());
        }
        return prestamo;
     }
     
}


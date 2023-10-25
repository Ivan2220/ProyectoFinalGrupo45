package proyectofinalgrupo45.accesoADatos;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalgrupo45.entidades.Ejemplar;
import proyectofinalgrupo45.entidades.Lector;
import proyectofinalgrupo45.entidades.Prestamo;

public class PrestamoData {

    private Connection con = null;

    public PrestamoData() {

        con = Conexion.getConexion();

    }

    public void solicitarLibro(Prestamo p) {

        String sql = "INSERT INTO prestamo (idLector, idEjemplar, fechap, fechad, retraso,diasD) VALUES (?, ?, ?, ?, ?)";
        String sql2 = "UPDATE ejemplar SET cantidad = cantidad - 1 WHERE idEjemplar = ?";
       

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, p.getLector().getIdLector());
            ps.setInt(2, p.getEjemplar().getIdEjemplar());
            ps.setDate(3, Date.valueOf(p.getFechaInicio()));
            ps.setDate(4, Date.valueOf(p.getFechaFin()));
            ps.setInt(5, p.getRetraso());

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

    public List<Ejemplar> listarLibrosPrestados(int id) {

        String sql = "SELECT * "
            + "FROM prestamo e "
            + "JOIN ejemplar j ON e.idEjemplar = j.idEjemplar "
            + "JOIN libro l ON j.idLibro = l.idLibro "
            + "WHERE e.idLector = ? AND j.estado = 1 AND l.estado = 1 ";
       
        List<Ejemplar> ejemplar = new ArrayList<>();
         
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                 Ejemplar ej = new Ejemplar();
                LibroData ls= new LibroData();
                

                ej.setIdEjemplar(rs.getInt("idEjemplar"));
                 int idL = rs.getInt("idLibro");
                 
                
                ej.setLibro(ls.buscarLibroId(idL));
                ej.setCantidad(rs.getInt("cantidad"));
                ej.setEstado(true);

                ejemplar.add(ej);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a los ejemplares prestados " + ex.getMessage());
            ex.printStackTrace();
        }

        return ejemplar;
    }
    
     public List<Ejemplar> listarLibrosNoPrestados(int id) {

        String sql ="SELECT * " +
                 "FROM ejemplar e " +
                 "JOIN libro l ON e.idLibro = l.idLibro " +
                 "WHERE e.estado = 1 AND l.estado = 1 " +
                 "AND e.idEjemplar NOT IN (" +
                 "SELECT idEjemplar FROM prestamo WHERE idLector = ?)";
        
        List<Ejemplar> ejemplar = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                 Ejemplar ej = new Ejemplar();
                LibroData ls= new LibroData();
                

                ej.setIdEjemplar(rs.getInt("idEjemplar"));
                 int idL = rs.getInt("idLibro");
                 
          
                ej.setLibro(ls.buscarLibroId(idL));
                ej.setCantidad(rs.getInt("cantidad"));
                ej.setEstado(true);

                ejemplar.add(ej);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a los ejemplares no prestados " + ex.getMessage());
            ex.printStackTrace();
        }

        return ejemplar;
    }
    
    public List<Prestamo> obtenerLectoresPrestamoVencido(int id){
        
        String sql = "SELECT * FROM prestamo WHERE NOW() > fechad AND idLector = ? ";
        String sql2 = "UPDATE prestamo SET retraso = DATEDIFF(NOW(), fechad) WHERE NOW() > fechad ";;

        List<Prestamo> prestamo = new ArrayList<>();
          
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Prestamo p = new Prestamo();
                LectorData l = new LectorData();
                EjemplarData ed = new EjemplarData();
               
                p.setIdPrestamo(rs.getInt("idPrestamo"));

                int il = rs.getInt("idLector");
                p.setLector(l.buscarLector(il));
                int ie = rs.getInt("idEjemplar");
                p.setEjemplar((Ejemplar) ed.buscarEjemplar(ie));

                p.setFechaInicio(rs.getDate("fechap").toLocalDate());
                p.setFechaFin(rs.getDate("fechad").toLocalDate());
                p.setRetraso(rs.getInt("retraso"));
                prestamo.add(p);

            }
            ps.close();
            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.executeUpdate();
            ps2.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tabla prestamo " + ex.getMessage());
            ex.printStackTrace();
        }

        return prestamo;
    
        
        
    }
    
    public List<Prestamo> obtenerLectoresPrestamoNoVencido(int id){
        
        String sql = "SELECT * FROM prestamo WHERE NOW() > fechap AND NOW() < fechad  AND idLector = ? ";
        String sql2 = "UPDATE prestamo SET diasD = DATEDIFF(fechad, NOW()) WHERE NOW() > fechap AND NOW() < fechad ";;

        List<Prestamo> prestamo = new ArrayList<>();
          
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Prestamo p = new Prestamo();
                LectorData l = new LectorData();
                EjemplarData ed = new EjemplarData();
                p.setIdPrestamo(rs.getInt("idPrestamo"));

                int il = rs.getInt("idLector");
                p.setLector(l.buscarLector(il));
                int ie = rs.getInt("idEjemplar");
                p.setEjemplar((Ejemplar) ed.buscarEjemplar(ie));

                p.setFechaInicio(rs.getDate("fechap").toLocalDate());
                p.setFechaFin(rs.getDate("fechad").toLocalDate());
                p.setRetraso(rs.getInt("retraso"));
                 p.setDiasD(rs.getInt("diasD"));
                
                prestamo.add(p);

            }
            ps.close();
            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.executeUpdate();
            ps2.close();
        
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
                p.setRetraso(rs.getInt("retraso"));
                prestamo.add(p);
          
             }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo: " + ex.getMessage());
        }
        return prestamo;
     }
     
     
     public List<Prestamo> listarPrestamos() {

        String sql = "SELECT * FROM prestamo e JOIN lector l ON e.idLector = l.idLector "
                + "JOIN ejemplar j ON e.idEjemplar = j.idEjemplar "
                + "JOIN libro lb ON j.idLibro = lb.idLibro WHERE l.estado = 1 AND j.estado = 1 AND lb.estado = 1 ";

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
                p.setLector(l.buscarLector(il));

                int ie = rs.getInt("idEjemplar");
                p.setEjemplar((Ejemplar) ed.buscarEjemplar(ie));

                p.setFechaInicio(rs.getDate("fechap").toLocalDate());
                p.setFechaFin(rs.getDate("fechad").toLocalDate());
                 p.setRetraso(rs.getInt("retraso"));
                prestamo.add(p);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tabla prestamo " + ex.getMessage());
            ex.printStackTrace();
        }

        return prestamo;
    }
     
     public Prestamo buscarPrestamoPorLector(int id) {

        String sql = "SELECT * FROM prestamo e "
                + "JOIN lector l ON e.idLector = l.idLector "
                + "JOIN ejemplar j ON e.idEjemplar = j.idEjemplar "
                + "JOIN libro lb ON j.idLibro = lb.idLibro "
                + "WHERE e.idLector = ? AND j.estado = 1 AND lb.estado = 1 ";

        Prestamo p = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                p = new Prestamo();
                LectorData l = new LectorData();
                EjemplarData ed = new EjemplarData();

                p.setIdPrestamo(rs.getInt("idPrestamo"));
                int il = rs.getInt("idLector");
                Lector lt = l.buscarLector(il);
                p.setLector(lt);

                int ie = rs.getInt("idEjemplar");
                p.setEjemplar(ed.buscarEjemplar(ie));

                p.setFechaInicio(rs.getDate("fechap").toLocalDate());
                p.setFechaFin(rs.getDate("fechad").toLocalDate());
                p.setRetraso(rs.getInt("retraso"));
                

            } else {

                JOptionPane.showMessageDialog(null, "No existe ese prestamo");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo");
            ex.printStackTrace();
        }

        return p;
    }
     
}


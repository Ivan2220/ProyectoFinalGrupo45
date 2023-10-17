package proyectofinalgrupo45.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalgrupo45.entidades.Ejemplar;
import proyectofinalgrupo45.entidades.Libros;

public class EjemplarData {

    private Connection con = null;
    private LibroData l;

    public EjemplarData() {
        l = new LibroData();
        con = Conexion.getConexion();
    }

    public Ejemplar buscarEjemplar(int id) {

        String sql = "SELECT idLibro, cantidad FROM ejemplar WHERE idEjemplar = ? AND estado = 1";

        Ejemplar ejemplar = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                ejemplar = new Ejemplar();

                ejemplar.setIdEjemplar(id);

                int idL = rs.getInt("idLibro");

                ejemplar.setLibro(l.buscarLibroId(idL));
               
                ejemplar.setCantidad(rs.getInt("cantidad"));

                ejemplar.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "No existe ese ejemplar");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar");
        }

        return ejemplar;
    }
    public void eliminarEjemplar(int id){
            
            String sql = "UPDATE ejemplar SET estado = 0 WHERE idEjemplar = ?";
            
            
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,id);
            
            int exito = ps.executeUpdate();
            
            if (exito == 1 ){
                
               JOptionPane.showMessageDialog(null, "Ejemplar dado de baja");
                
                
            }
       
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar");
        }
                             
    }
    public void modificarEjemplar(Ejemplar ejemplar){
        
        
        String sql = "UPDATE ejemplar SET idLibro= ?, Cantidad= ?,Estado = ? where idEjemplar=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, ejemplar.getLibro().getIdLibro());
            ps.setInt(2, ejemplar.getCantidad());
            ps.setBoolean(3, ejemplar.isEstado()); 
            ps.setInt(4, ejemplar.getIdEjemplar());
            
            
            
            int exito = ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Ejemplar Modificado");
                
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar");
        }
        
    }
    public void guardarEjemplar(Ejemplar ejemplar) {

        String sql = "INSERT INTO ejemplar (idLibro, cantidad, estado)"
                + "VALUES(?, ?, ?)";

        
           try {
               PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, ejemplar.getLibro().getIdLibro());
                ps.setInt(2, ejemplar.getCantidad());
                ps.setBoolean(3, ejemplar.isEstado());
                ps.executeUpdate();
                
                
                ResultSet rs = ps.getGeneratedKeys();
                
                if (rs.next()) {
                    
                    ejemplar.setIdEjemplar(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Ejemplar Guardado");
                    
               
            }
                ps.close();
            

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar");

        }
    }
    
    public List<Ejemplar> listarEjemplares() {

        String sql = "SELECT * FROM ejemplar WHERE estado = 1 ";

        ArrayList<Ejemplar> ejemplar = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
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
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar");
        }

        return ejemplar;
    }
    }
    
        

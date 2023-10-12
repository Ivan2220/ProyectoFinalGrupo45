package proyectofinalgrupo45.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalgrupo45.entidades.Lector;

public class LectorData {

    private Connection con = null;

    public LectorData() {

        con = Conexion.getConexion();
    }

    public void guardarLector(Lector lector) {

        String sql = "INSERT INTO lector (dni, nombre,domicilio,telefono, estado)"
                + "VALUES(?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, lector.getDni());
            ps.setString(2, lector.getNombre());
            ps.setString(3, lector.getDomicilio());
            ps.setInt(4, lector.getTelefono());
            ps.setBoolean(5, lector.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                lector.setIdLector(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Lector Guardado");

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");

        }
    }

    public void activarlector(int id) {

        String sql = "UPDATE lector SET estado = 1 WHERE idLector = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Lector Activo");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector");
        }

    }

    public void desactivarlector(int id) {

        String sql = "UPDATE lector SET estado = 0 WHERE idLector = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Lector Desactivo");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector");
        }

    }

    public Lector buscarlector(int id) {

        String sql = "SELECT dni, nombre, domicilio, telefono, estado FROM lector WHERE IdLector = ? AND estado = 1";

        Lector lector = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                lector = new Lector();

                lector.setIdLector(id);
                lector.setDni(rs.getInt("dni"));
                lector.setNombre(rs.getString("nombre"));
                lector.setDomicilio(rs.getString("nombre"));
                lector.setTelefono(rs.getInt("telefono"));
                lector.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "No existe ese lector");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla lector");
        }

        return lector;
    }
    
    
    
    
    public Lector buscarLectorDni(int dni){
            
            String sql = "SELECT idLector,dni, nombre, domicilio, telefono, estado FROM Lector WHERE dni = ? AND estado = 1";
       
        Lector lector = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
              lector = new Lector ();  
              
              lector.setIdLector(rs.getInt("idLector"));
              lector.setDni(rs.getInt("dni"));
              lector.setNombre(rs.getString("nombre"));
              lector.setDomicilio(rs.getString("Domicilio"));
              lector.setTelefono(rs.getInt("telefono"));
              lector.setEstado(true);
              
            }else{
                
                JOptionPane.showMessageDialog(null, "No existe ese lector");
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla lector");
        }
        
        return lector;
        }

    
    public void modificarLector(Lector lector){
        
        
        String sql = " UPDATE lector SET dni= ?, nombre= ?, domicilio = ?,telefono= ?, estado = ? "
                + "WHERE idLector= ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, lector.getDni());
            ps.setString(2, lector.getNombre());
            ps.setString(3, lector.getDomicilio());
            ps.setInt(4, lector.getTelefono());
            ps.setBoolean(5,lector.isEstado());
            ps.setInt(6,lector.getIdLector());
            
            int exito = ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, " Lector Modificado");
                
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector");
        }
    
    }
    
     public List<Lector> listarLectores(){
            
            String sql = "SELECT idLector, dni, nombre, domicilio, telefono FROM lector WHERE estado = 1";
       
        ArrayList<Lector> lectores = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
              Lector lector = new Lector ();  
              
              lector.setIdLector(rs.getInt("idLector"));
              lector.setDni(rs.getInt("dni"));
              lector.setNombre(rs.getString("nombre"));
              lector.setTelefono(rs.getInt("telefono"));
              lector.setEstado(true);
             
              lectores.add(lector);
              
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla lector");
        }
        
        return lectores;
        }
        
    
}

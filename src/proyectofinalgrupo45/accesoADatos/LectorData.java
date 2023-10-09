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
            ps.setBoolean(5, lector.isEstado());// ojo no me da la palabra activo
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

}

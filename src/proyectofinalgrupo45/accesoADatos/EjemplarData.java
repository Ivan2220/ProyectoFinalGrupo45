package proyectofinalgrupo45.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

}

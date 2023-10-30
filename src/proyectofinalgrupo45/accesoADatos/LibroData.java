package proyectofinalgrupo45.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalgrupo45.entidades.Libros;

public class LibroData {

    private Connection con = null;

    public LibroData() {

        con = Conexion.getConexion();

    }

    public void guardarLibro(Libros libro) {

        String sql = "INSERT INTO libro (isbn , nombre, tipo, editorial, autor, estado)"
                + "VALUES(?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, libro.getIsbn());
            ps.setString(2, libro.getNombre());
            ps.setString(3, libro.getTipo());
            ps.setString(4, libro.getEditorial());
            ps.setString(5, libro.getAutor());
            ps.setBoolean(6, libro.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                libro.setIdLibro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Libro Guardado");

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro");

        }

    }

    public void modificarLibro(Libros libro) {

        String sql = "UPDATE libro SET isbn= ?, nombre= ?, tipo = ?, "
                + "editorial = ?, autor = ?, estado = ? WHERE idLibro = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, libro.getIsbn());
            ps.setString(2, libro.getNombre());
            ps.setString(3, libro.getTipo());
            ps.setString(4, libro.getEditorial());
            ps.setString(5, libro.getAutor());
            ps.setBoolean(6, libro.isEstado());
            ps.setInt(7, libro.getIdLibro());

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Libro Modificado");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro");
        }
    }

    public void eliminarLibro(int id) {

        String sql = "UPDATE libro SET estado = 0 WHERE idLibro = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Libro dado de baja");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro");
        }

    }

    public Libros buscarLibroPorIsbn(int isbn) {

        String sql = "SELECT idLibro, isbn , nombre, tipo, editorial, autor FROM libro WHERE isbn = ? AND estado = 1";

        Libros libro = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, isbn);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                libro = new Libros();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setNombre(rs.getString("nombre"));
                libro.setTipo(rs.getString("tipo"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setAutor(rs.getString("autor"));
                libro.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "No existe ese libro");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro");
        }

        return libro;
    }

    public List<Libros> listarLibrosAutor(String a) {

        String sql = "SELECT idLibro, isbn , nombre, tipo, editorial, autor FROM libro WHERE estado = 1 AND autor = ?";

        ArrayList<Libros> libros = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, a);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Libros libro = new Libros();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setNombre(rs.getString("nombre"));
                libro.setTipo(rs.getString("tipo"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setAutor(rs.getString("autor"));
                libro.setEstado(true);

                libros.add(libro);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }

        return libros;
    }
    
    public List<Libros> listarLibros() {

        String sql = "SELECT * FROM libro ";

        ArrayList<Libros> libros = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Libros libro = new Libros();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setNombre(rs.getString("nombre"));
                libro.setTipo(rs.getString("tipo"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setAutor(rs.getString("autor"));
                libro.setEstado(true);

                libros.add(libro);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }

        return libros;
    }

    public Libros buscarLibroId(int id) {

        String sql = "SELECT idLibro, isbn , nombre, tipo, editorial, autor FROM libro WHERE idLibro = ? AND estado = 1";

        Libros libro = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                libro = new Libros();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setNombre(rs.getString("nombre"));
                libro.setTipo(rs.getString("tipo"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setAutor(rs.getString("autor"));
                libro.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "No existe ese libro");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro");
        }

        return libro;
    }
    
    public Libros buscarLibroIdNOActivos(int id) {

        String sql = "SELECT idLibro, isbn , nombre, tipo, editorial, autor FROM libro WHERE idLibro = ? AND estado = 0";

        Libros libro = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                libro = new Libros();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setNombre(rs.getString("nombre"));
                libro.setTipo(rs.getString("tipo"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setAutor(rs.getString("autor"));
                libro.setEstado(false);
                

            } else {

                JOptionPane.showMessageDialog(null, "No existe ese libro");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro");
        }

        return libro;
    }
    
     public void activarLibro(String nombre) {

        String sql = "UPDATE libro SET estado = 1 WHERE nombre = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nombre);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Libro Activado");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro");
        }

    }

    
    
}

package proyectofinalgrupo45.entidades;

public class Libros {

    private int idLibro;
    private int isbn;
    private String nombre;
    private String tipo;
    private String editorial;
    private String autor;
    private boolean estado;

    public Libros() {
    }

    public Libros(int idLibro, int isbn, String nombre, String tipo, String editorial, String autor, boolean estado) {
        this.idLibro = idLibro;
        this.isbn = isbn;
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.autor = autor;
        this.estado = estado;
    }

    public Libros(int isbn, String nombre, String tipo, String editorial, String autor, boolean estado) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.autor = autor;
        this.estado = estado;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
       
        return nombre ;
    }

}

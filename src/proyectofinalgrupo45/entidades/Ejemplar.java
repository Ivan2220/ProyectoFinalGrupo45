
package proyectofinalgrupo45.entidades;


public class Ejemplar {
    private int idEjemplar;
    private Libros libro;
    private int cantidad;
    private boolean estado;

    public Ejemplar() {
    }

    public Ejemplar(int idEjemplar, Libros libro, int cantidad, boolean estado) {
        this.idEjemplar = idEjemplar;
        this.libro = libro;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public Ejemplar(Libros libro, int cantidad, boolean estado) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "idEjemplar=" + idEjemplar + ", libro=" + libro + ", cantidad=" + cantidad + '}';
    }

    
}

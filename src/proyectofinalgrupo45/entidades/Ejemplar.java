
package proyectofinalgrupo45.entidades;


public class Ejemplar {
    private int idEjemplar;
    private Lector lector;
    private int cantidad;
    private boolean estado;

    public Ejemplar() {
    }

    public Ejemplar(int idEjemplar, Lector lector, int cantidad, boolean estado) {
        this.idEjemplar = idEjemplar;
        this.lector = lector;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public Ejemplar(Lector lector, int cantidad, boolean estado) {
        this.lector = lector;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
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
        return "Ejemplar{" + "idEjemplar=" + idEjemplar + ", lector=" + lector + ", cantidad=" + cantidad + '}';
    }
    
}

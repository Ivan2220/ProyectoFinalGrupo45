
package proyectofinalgrupo45.entidades;


public class Lector {
    private int idLector;
    private int dni;
    private String nombre;
    private String domicilio;
    private int telefono;
    private boolean estado;

    public Lector() {
    }

    public Lector(int idLector, int dni, String nombre, String domicilio, int telefono, boolean estado) {
        this.idLector = idLector;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Lector(int dni, String nombre, String domicilio, int telefono, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getIdLector() {
        return idLector;
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Lector{" + "idLector=" + idLector + ", dni=" + dni + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
}

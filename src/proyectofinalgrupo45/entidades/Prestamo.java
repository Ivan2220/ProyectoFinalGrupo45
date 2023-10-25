
package proyectofinalgrupo45.entidades;

import java.time.LocalDate;


public class Prestamo {
   private int idPrestamo;
   private Lector lector;
   private Ejemplar ejemplar;
   private LocalDate fechaInicio;
   private LocalDate fechaFin;
   private int retraso;
   private int diasD;

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, Lector lector, Ejemplar ejemplar, LocalDate fechaInicio, LocalDate fechaFin, int retraso, int diasD) {
        this.idPrestamo = idPrestamo;
        this.lector = lector;
        this.ejemplar = ejemplar;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.retraso = retraso;
        this.diasD = diasD;
    }

    public Prestamo(Lector lector, Ejemplar ejemplar, LocalDate fechaInicio, LocalDate fechaFin, int retraso, int diasD) {
        this.lector = lector;
        this.ejemplar = ejemplar;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.retraso = retraso;
        this.diasD = diasD;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getRetraso() {
        return retraso;
    }

    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }

    public int getDiasD() {
        return diasD;
    }

    public void setDiasD(int diasD) {
        this.diasD = diasD;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "idPrestamo=" + idPrestamo + ", lector=" + lector + ", ejemplar=" + ejemplar + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", retraso=" + retraso + ", diasD=" + diasD + '}';
    }

   
}

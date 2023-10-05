package proyectofinalgrupo45;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import proyectofinalgrupo45.accesoADatos.Conexion;
import proyectofinalgrupo45.accesoADatos.EjemplarData;
import proyectofinalgrupo45.accesoADatos.LectorData;
import proyectofinalgrupo45.accesoADatos.LibroData;
import proyectofinalgrupo45.accesoADatos.PrestamoData;
import proyectofinalgrupo45.entidades.Ejemplar;
import proyectofinalgrupo45.entidades.Lector;
import proyectofinalgrupo45.entidades.Libros;
import proyectofinalgrupo45.entidades.Prestamo;

public class ProyectoFinalGrupo45 {

    public static void main(String[] args) {

        Connection con = Conexion.getConexion();

        Libros librito = new Libros(53, 1234569871, "El Señor de los Anillos", "Fantasía", "Editorial STU", "J.R.R. Tolkien", true);
        LibroData l = new LibroData();

        //l.guardarLibro(librito);
        //l.modificarLibro(librito);
        // l.eliminarLibro(53);
//       Libros libroEncontrado= l.buscarLibroPorIsbn(1234567890);
//       if(libroEncontrado!=null){
//        System.out.println("nombre: "+ libroEncontrado.getNombre());
//        System.out.println("tipo: "+ libroEncontrado.getTipo());
//    }
// List<Libros> listaDeLibros = l.listarLibros("Dan Brown");
//
//          
//            for (Libros libro : listaDeLibros) {
//                System.out.println("ID: " + libro.getIdLibro());
//                System.out.println("ISBN: " + libro.getIsbn());
//                System.out.println("Nombre: " + libro.getNombre());
//                System.out.println("Tipo: " + libro.getTipo());
//                System.out.println("Editorial: " + libro.getEditorial());
//                System.out.println("Autor: " + libro.getAutor());
//                System.out.println("Estado: " + libro.isEstado());
//                System.out.println();
//            }
        PrestamoData p = new PrestamoData();
        LectorData lector = new LectorData();
        EjemplarData ejemplar = new EjemplarData();

       
// Lector lc = lector.buscarLector(1);
// 
// Ejemplar ej= ejemplar.buscarEjemplar(1);
//        
//        Prestamo ptm = new Prestamo(lc, ej, LocalDate.of(2023, 10, 05), LocalDate.of(2023, 10, 07),true);
//        p.solicitarLibro(ptm);

//   Libros libroEncontrado= l.buscarLibroId(43);
//       if(libroEncontrado!=null){
//        System.out.println("nombre "+ libroEncontrado.getNombre());
//       }

//p.devolverLibro(1, 1);
ejemplar.eliminarEjemplar(5);

    }

}

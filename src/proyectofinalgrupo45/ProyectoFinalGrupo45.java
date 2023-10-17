package proyectofinalgrupo45;

import java.sql.*;
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

        PrestamoData p = new PrestamoData();
        LectorData lector1 = new LectorData();
        EjemplarData ejemplar = new EjemplarData();
        LibroData l = new LibroData();

// PRUEBAS DE LIBRO ------------------------------------------------------------------------------------------------------------------

//        Libros librito = new Libros(53, 1234569871, "El Señor de los Anillos", "Fantasía", "Editorial STU", "J.R.R. Tolkien", true);
//        
//
//        l.guardarLibro(librito);
//        l.modificarLibro(librito);
//        l.eliminarLibro(53);
//       Libros libroEncontrado= l.buscarLibroPorIsbn(1234567890);
//       if(libroEncontrado!=null){
//        System.out.println("nombre: "+ libroEncontrado.getNombre());
//        System.out.println("tipo: "+ libroEncontrado.getTipo());
//    }
// List<Libros> listaDeLibros = l.listarLibrosAutor("Dan Brown");
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
// Libros libroEncontrado= l.buscarLibroId(43);
//       if(libroEncontrado!=null){
//        System.out.println("nombre: "+ libroEncontrado.getNombre());
//        System.out.println("tipo: "+ libroEncontrado.getTipo());
//    }

//List<Libros> listaDeLibros = l.listarLibros();
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



//

 //PRUEBAS DE Prestamo----------------------------------------------------------------------------------------
// Ejemplar ej= ejemplar.buscarEjemplar(1);
//        
//        Prestamo ptm = new Prestamo(lc, ej, LocalDate.of(2023, 10, 05), LocalDate.of(2023, 10, 07),true);
//        p.solicitarLibro(ptm);
//   Libros libroEncontrado= l.buscarLibroId(43);
//       if(libroEncontrado!=null){
//        System.out.println("nombre "+ libroEncontrado.getNombre());
//       }
        //p.devolverLibro(8, 3);
// Ejemplar ejemplarEncontrado= ejemplar.buscarEjemplar(1);
//       if(ejemplarEncontrado!=null){
//        System.out.println("nombre: "+ ejemplarEncontrado.getLibro().getNombre());
//      
//    }
//Libros lib=l.buscarLibroId(51);
//Ejemplar ej=new Ejemplar( lib, 10, true);
//ejemplar.guardarEjemplar(ej);
//List<Prestamo> lista = p.listarLectoresYLibros();
//
//        for (Prestamo lt : lista) {
//             
//            System.out.println("nombre del lector: "+lt.getLector().getNombre());
//            System.out.println("nombre del libro: "+lt.getEjemplar().getLibro().getNombre());
//            System.out.println();
//       }
//List<Prestamo> lista = p.obtenerLectoresPrestamoVencido();
//
//        for (Prestamo lt : lista) {
//             
//            System.out.println("Lector: "+lt.getLector().getNombre());
//            System.out.println("Fecha Vto: "+lt.getFechaFin());
//            System.out.println("---------------------------");
//            System.out.println();
//          
//        }
//        List<Prestamo> lista = p.obtenerLibrosFechaDeterminada(LocalDate.of(2023, 10, 10));
//
//        for (Prestamo lt : lista) {
//
//            System.out.println("Libro: " + lt.getEjemplar().getLibro().getNombre());
//            System.out.println("---------------------------");
//            System.out.println();
//
//        }
//PRUEBAS DE LECTOR----------------------------------------------------------------------------------------
//     Lector lec = new Lector(96958147, "Ana", "salta",1138800193, true);
//       lector1.guardarLector(lec);
         //lector1.desactivarlector(1);
         //lector1.activarlector(1);
          
 
//       Lector lectorEncontrado = lector1.buscarLectorDni(123456789);
//       if(lectorEncontrado!=null){
//           
//        System.out.println("nombre: "+ lectorEncontrado.getNombre());
//        System.out.println(" Domicilio: "+ lectorEncontrado.getDomicilio());
//    }

//          Lector lec = new Lector( 3,456789123, "Luis González", "Calle Secundaria 789", 5559012, true);
//          lector1.modificarLector(lec);
          
          
//          List<Lector> listaDeLectores = lector1.listarLectores();
////
////          
//            for (Lector lector : listaDeLectores) {
//               System.out.println(" IdLector: " + lector.getIdLector());
//               System.out.println(" DNI: " + lector.getDni());
//               System.out.println(" Nombre: " + lector.getNombre());
//               System.out.println(" Domicilio: " + lector.getDomicilio());
//               System.out.println(" telefono: " + lector.getTelefono());
//               System.out.println("Estado: " + lector.isEstado());
//
//           }

List<Ejemplar> listaE = ejemplar.listarEjemplares();
   
   for(Ejemplar ej : listaE){
        
       System.out.println(" IdEjemplar: " + ej.getIdEjemplar());
       System.out.println(" IdLibro: " + ej.getLibro().getIdLibro());
         System.out.println(" cantidad " + ej.getCantidad());
           System.out.println(" estado " + ej.isEstado());
       
   }
   
    } 
}

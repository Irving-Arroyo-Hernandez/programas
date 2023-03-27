package Main_Biblio;

import Agenda_Servicios.Servicios;
import DTO_Biblioteca.Libro;
import DTO_Biblioteca.Prestamo;
import DTO_Biblioteca.alumno;
import DTO_Biblioteca.profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Local_2 {
 public static void main(String[] args) {
        
     Servicios servicio = new Servicios();
     
     List<alumno>  lista_alumnos = new ArrayList<alumno> ();
     List<Libro>  lista_libros= new ArrayList<> ();
     List<Prestamo>  lista_prestamos= new ArrayList<> ();
     List<profesor>  lista_profesores= new ArrayList<> ();
     
     
     alumno alumno1 = new alumno(0, "", 0, "", "", "");
        alumno1.setId(1);
        alumno1.setNumero(123);
        alumno1.setNombre("Luis");
        alumno1.setApellido_p("Gomez");
        alumno1.setApellido_m("Ruiz");
        alumno1.setSexo("M");
        
        alumno alumno2 = new alumno(0, "", 0, "", "", "");
        alumno2.setId(2);
        alumno2.setNombre("Daniel");
        alumno2.setApellido_p("Hernandez");
        alumno2.setApellido_m("Ruis");
        alumno2.setNumero(12346);
        alumno2.setSexo("M");

     servicio.agregarAlumno(lista_alumnos, alumno1);
     servicio.agregarAlumno(lista_alumnos, alumno2);
     System.out.println(lista_alumnos);
     servicio.BuscarAlumno(lista_alumnos, 1);
     servicio.ELiminarAlumno(lista_alumnos, alumno2);
     System.out.println(lista_alumnos);
     }
}
     
     
    
    


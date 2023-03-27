package Main_Biblio;

import DAO_Biblioteca.DAO_Prestamo;
import DAO_Biblioteca.DAO_alumno;
import DAO_Biblioteca.DAO_libro;
import DAO_Biblioteca.DAO_profesor;
import DTO_Biblioteca.Libro;
import DTO_Biblioteca.Prestamo;
import DTO_Biblioteca.alumno;
import DTO_Biblioteca.profesor;
import java.util.ArrayList;
import java.util.List;

public class Local {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setNombre("Fundamentos de programacion");
        libro1.setCategoria("Programacion");
        libro1.setEditorial("AlfaOmega");
        libro1.setIsbn(1234);
        libro1.setStock(5);

        Libro libro2 = new Libro();
        libro2.setId(2);
        libro2.setNombre("Calculo");
        libro2.setCategoria("Matematicas");
        libro2.setEditorial("AlfaOmega");
        libro2.setIsbn(1235);
        libro2.setStock(4);

        Libro libro3 = new Libro();
        libro3.setId(3);
        libro3.setNombre("Inicios de java");
        libro3.setCategoria("Programacion");
        libro3.setEditorial("AlfaOmega");
        libro3.setIsbn(1236);
        libro3.setStock(5);

        Libro libro4 = new Libro();
        libro4.setId(4);
        libro4.setNombre("Como invertir con un cinco");
        libro4.setCategoria("Economia");
        libro4.setEditorial("AlfaOmega");
        libro4.setIsbn(1237);
        libro4.setStock(8);

        List<Libro> listaLibros1 = new ArrayList<>();

        listaLibros1.add(libro1);

        List<Libro> listaLibros2 = new ArrayList<>();

        listaLibros2.add(libro1);
        listaLibros2.add(libro3);

        List<Libro> listaLibros3 = new ArrayList<>();

        listaLibros3.add(libro4);

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

        alumno alumno3 = new alumno(0, "", 0, "", "", "");
        alumno3.setId(3);
        alumno3.setNombre("Maria");
        alumno3.setApellido_p("Salazar");
        alumno3.setApellido_m("Guayaba");
        alumno3.setNumero(12347);
        alumno3.setSexo("F");

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setId(1);
        prestamo1.setFolio(2343);
        prestamo1.setPersona(alumno1);
        prestamo1.setLibros(listaLibros1);

        System.out.println(prestamo1);

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setId(2);
        prestamo2.setFolio(1343);
        prestamo2.setPersona(alumno2);
        prestamo2.setLibros(listaLibros2);

        System.out.println(prestamo2);

        Prestamo prestamo3 = new Prestamo();
        prestamo3.setId(3);
        prestamo3.setFolio(3343);
        prestamo3.setPersona(alumno3);
        prestamo3.setLibros(listaLibros3);

        System.out.println(prestamo3);
    }

}

package Agenda_Servicios;

import DTO_Biblioteca.Libro;
import DTO_Biblioteca.Prestamo;
import DTO_Biblioteca.alumno;
import DTO_Biblioteca.profesor;
import Facades.Libro_Facade;
import Facades.alumno_Facade;
import Facades.prestamo_Facade;
import Facades.profesor_Facade;
import java.util.ArrayList;
import java.util.List;

public class Servicios {

    alumno_Facade alumno_Facade = new alumno_Facade();
    Libro_Facade libro_facade = new Libro_Facade();
    profesor_Facade profesor_facade = new profesor_Facade();
    prestamo_Facade prestamo_facade = new prestamo_Facade();

    //ALUMNO
    public void agregarAlumno(List<alumno> lista, alumno alumno) {
        alumno_Facade.Crear(lista, alumno);
    }

    public void ActualizarAlumno(List<alumno> lista, alumno alumno) {
        alumno_Facade.actualizar(lista, alumno);
    }

    public void ELiminarAlumno(List<alumno> lista, alumno alumno) {
        alumno_Facade.eliminar(lista, alumno);
    }

    public void BuscarAlumno(List<alumno> lista, int id) {
        alumno_Facade.buscar(lista, id);
    }

    public void MostrarALumno(ArrayList<alumno> lista) {
        alumno_Facade.mostrar(lista);
    }

    //PROFESOR
    public void agregarProfesor(List <profesor> lista ,profesor profesor) {
        profesor_facade.Crear(lista, profesor);
    }

    public void ActualizarProfesor(List <profesor> lista ,profesor profesor) {
        profesor_facade.actualizar(lista, profesor);
    }

    public void ELiminarProfesor(List <profesor> lista ,profesor profesor) {
        profesor_facade.eliminar(lista, profesor);
    }

    public void BuscarProfesor(List <profesor> lista ,int id) {
        profesor_facade.buscar(lista, id);
    }

    public void MostrarProfesor(ArrayList<profesor> lista) {
        profesor_facade.mostrar(lista);
    }

//LIBRO
    public void agregarLibro(List<Libro> lista ,Libro libro) {
        libro_facade.Crear(lista, libro);
    }

    public void ActualizarLibro(List<Libro> lista ,Libro libro) {
        libro_facade.actualizar(lista, libro);
    }

    public void ELiminarLibro(List<Libro> lista ,Libro libro) {
        libro_facade.eliminar(lista, libro);
    }

    public void BuscarLibro(List<Libro> lista , int id) {
        libro_facade.buscar(lista, id);}

    public void MostrarLibro(ArrayList<Libro> lista) {
        libro_facade.mostrar(lista);
    }

//PRESTAMO
    public void agregarPrestamo(List<Prestamo> lista ,Prestamo prestamo) {
        prestamo_facade.Crear(lista, prestamo);
    }

    public void ActualizarPrestamo(List<Prestamo> lista ,Prestamo prestamo) {
        prestamo_facade.actualizar(lista, prestamo);
    }

    public void ELiminarPrestamo(List<Prestamo> lista ,Prestamo prestamo) {
        prestamo_facade.eliminar(lista, prestamo);
    }

    public void BuscarPrestamo(List<Prestamo> lista , int id) {
        prestamo_facade.buscar(lista, id);
    }

    public void MostrarPrestamo(ArrayList<Prestamo> lista) {
        prestamo_facade.mostrar(lista);
    }
}

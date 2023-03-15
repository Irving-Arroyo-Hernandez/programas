package Agenda_Servicios;

import DTO_Biblioteca.Libro;
import Facades.Libro_Facade;
import java.util.ArrayList;

public class libro_Servicios {

Libro_Facade libro_facade = new Libro_Facade();

public void agregarLibro (Libro libro){
    libro_facade.Crear(libro);
}

public void ActualizarLibro (Libro libro){
    libro_facade.actualizar(libro);
}

public void ELiminarLibro (Libro libro){
   libro_facade.eliminar(libro);
}

public void BuscarLibro (Libro libro){
    libro_facade.buscar(libro);
}

public void MostrarLibro (ArrayList<Libro> lista){
    libro_facade.mostrar(lista);
}
}

package Agenda_Servicios;

import DTO_Biblioteca.profesor;
import Facades.profesor_Facade;
import java.util.ArrayList;

public class profesor_Servicios {

profesor_Facade profesor_facade = new profesor_Facade();

public void agregarProfesor (profesor profesor){
    profesor_facade.Crear(profesor);
}

public void ActualizarProfesor (profesor profesor){
    profesor_facade.actualizar(profesor);
}

public void ELiminarProfesor (profesor profesor){
   profesor_facade.eliminar(profesor);
}

public void BuscarProfesor (profesor profesor){
   profesor_facade.buscar(profesor);
}

public void MostrarProfesor (ArrayList<profesor> lista){
    profesor_facade.mostrar(lista);
}
}

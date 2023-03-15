package Agenda_Servicios;

import DTO_Biblioteca.alumno;
import Facades.alumno_Facade;
import java.util.ArrayList;

public class alumno_servicios {
    
    alumno_Facade alumno_Facade = new alumno_Facade();

public void agregarAlumno (alumno alumno){
    alumno_Facade.Crear(alumno);
}

public void ActualizarAlumno (alumno alumno){
    alumno_Facade.actualizar(alumno);
}

public void ELiminarAlumno (alumno alumno){
    alumno_Facade.eliminar(alumno);
}

public void BuscarAlumno (alumno alumno){
    alumno_Facade.buscar(alumno);
}

public void MostrarALumno (ArrayList<alumno> lista){
    alumno_Facade.mostrar(lista);
}
}

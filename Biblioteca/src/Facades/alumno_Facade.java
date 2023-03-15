package Facades;

import DAO_Biblioteca.DAO_alumno;
import DTO_Biblioteca.alumno;
import java.util.ArrayList;

public class alumno_Facade {

DAO_alumno alumno_dao = new DAO_alumno();

public void Crear (alumno alumno){
    
    alumno_dao.AgregarAlumno(alumno);
}
        
public void actualizar (alumno alumno){
    alumno_dao.actualizar_alumno(alumno);
}

public void eliminar (alumno alumno){
    alumno_dao.eliminarAlumno(alumno);
}

public void buscar (alumno alumno){
    alumno_dao.buscarAlumno(0);
}

public void mostrar (ArrayList<alumno> lista){
    alumno_dao.imprimirAlumno(lista);
}
}

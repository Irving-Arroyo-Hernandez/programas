package Facades;

import DAO_Biblioteca.DAO_alumno;
import DTO_Biblioteca.alumno;
import java.util.ArrayList;
import java.util.List;

public class alumno_Facade {

DAO_alumno alumno_dao = new DAO_alumno();

public void Crear (List<alumno> lista, alumno alumno){
    
    alumno_dao.agregar_alumno(lista, alumno);
}
        
public void actualizar (List<alumno> lista, alumno alumno){
    alumno_dao.actualizar_alumno(lista, alumno);
}

public void eliminar (List<alumno> lista, alumno alumno){
    alumno_dao.eliminar_alumno(lista, alumno);
}

public void buscar (List<alumno> lista, int id){
    alumno_dao.buscar_alumno(lista, id);
}

public void mostrar (ArrayList<alumno> lista){
    alumno_dao.Imprimir_alumno(lista);
}
}

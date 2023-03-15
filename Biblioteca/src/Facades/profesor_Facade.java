package Facades;

import DAO_Biblioteca.DAO_profesor;
import DTO_Biblioteca.profesor;
import java.util.ArrayList;

public class profesor_Facade {

DAO_profesor profesor_dao = new DAO_profesor();

public void Crear (profesor profesor){
    
    profesor_dao.AgregarProfesor(profesor);
}
        
public void actualizar (profesor profesor){
    profesor_dao.ActualizarProfesor(profesor);
}

public void eliminar (profesor profesor){
    profesor_dao.EliminarProfesor(profesor);
}

public void buscar (profesor profesor){
    profesor_dao.BuscarProfesor(0);
}

public void mostrar (ArrayList<profesor> lista){
profesor_dao.MostrarListaProfesor();
}

}

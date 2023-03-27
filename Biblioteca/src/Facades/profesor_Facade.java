package Facades;

import DAO_Biblioteca.DAO_profesor;
import DTO_Biblioteca.profesor;
import java.util.ArrayList;
import java.util.List;

public class profesor_Facade {

DAO_profesor profesor_dao = new DAO_profesor();

public void Crear (List <profesor> lista ,profesor profesor){
    
    profesor_dao.AgregarProfesor(lista, profesor);
}
        
public void actualizar (List <profesor> lista ,profesor profesor){
    profesor_dao.ActualizarProfesor(lista, profesor);
}

public void eliminar (List <profesor> lista ,profesor profesor){
    profesor_dao.EliminarProfesor(lista, profesor);
}

public void buscar (List <profesor> lista ,int id){
    profesor_dao.BuscarProfesor(lista, id);
}

public void mostrar (ArrayList<profesor> lista){
profesor_dao.MostrarListaProfesor(lista);
}

}

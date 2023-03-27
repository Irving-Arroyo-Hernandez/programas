package Facades;

import DAO_Biblioteca.DAO_libro;
import DTO_Biblioteca.Libro;
import java.util.ArrayList;
import java.util.List;

public class Libro_Facade {
 
    DAO_libro libro_dao = new DAO_libro();
    
    public void Crear (List<Libro> lista ,Libro libro){
    
    libro_dao.AgregarLibro(lista, libro);
}
        
public void actualizar (List<Libro> lista ,Libro libro){
    libro_dao.ActualizarLibro(lista, libro);
}

public void eliminar (List<Libro> lista ,Libro libro){
    libro_dao.EliminarLibro(lista, libro);
}

public void buscar (List<Libro> lista ,int id){
    libro_dao.BuscarLibro(lista, id);
}

public void mostrar (ArrayList<Libro> lista){
    libro_dao.ImprimirLibro(lista);
}
    
}

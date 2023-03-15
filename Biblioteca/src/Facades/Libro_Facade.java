package Facades;

import DAO_Biblioteca.DAO_libro;
import DTO_Biblioteca.Libro;
import java.util.ArrayList;

public class Libro_Facade {
 
    DAO_libro libro_dao = new DAO_libro();
    
    public void Crear (Libro libro){
    
    libro_dao.AgregarLibro(libro);
}
        
public void actualizar (Libro libro){
    libro_dao.ActualizarLibro(libro);
}

public void eliminar (Libro libro){
    libro_dao.EliminarLibro(libro);
}

public void buscar (Libro libro){
    libro_dao.BuscarLibro(0);
}

public void mostrar (ArrayList<Libro> lista){
    libro_dao.ImprimirLibro(lista);
}
    
}

package DAO_Biblioteca;

import DTO_Biblioteca.Libro;
import java.util.ArrayList;
import java.util.List;

public class DAO_libro {
    
    public void AgregarLibro(List<Libro> lista ,Libro libro) {
		lista.add(libro);
	}
	
	public void ActualizarLibro (List<Libro> lista ,Libro libro) {
		for (int i = 0; i < lista.size(); i++) {
	          if(lista.get(i).getId()== libro.getId()){
                      lista.get(i).setNombre(libro.getNombre());
                      lista.get(i).setCategoria(libro.getCategoria());
                      lista.get(i).setEditorial(libro.getEditorial());
                      lista.get(i).setIsbn(libro.getIsbn());
                      lista.get(i).setStock(libro.getStock());
	}
        }
        }
	public void EliminarLibro(List<Libro> lista ,Libro libro) {
		lista.remove(libro);
		
	}
        public Libro BuscarLibro(List<Libro> lista ,int id) {
        for (int i = 0; i < lista.size(); i++) {
            Libro a= lista.get(i);
            if(a.getId()== id ){
                 System.out.println(a.getId());
                 return a;
            }else{
                System.out.println("Libro no encontrado");
            }
        }
         return null;
     
    }
          public void ImprimirLibro(ArrayList<Libro> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
        }
}


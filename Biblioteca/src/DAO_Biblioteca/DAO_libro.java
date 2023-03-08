package DAO_Biblioteca;

import DTO_Biblioteca.Libro;
import java.util.ArrayList;
import java.util.List;

public class DAO_libro {
    List<Libro> list_libros= new ArrayList<Libro>();	
	int id=0;

	
	public void AgregarLibro(Libro libro) {
		libro.setId(id+1);
		list_libros.add(libro);
		id++;
		
	}
	
	public void ActualizarLibro (Libro libro) {
		for (int i = 0; i < list_libros.size(); i++) {
	          if(list_libros.get(i).getId()== libro.getId()){
	}
        }
        }
	public void EliminarLibro(Libro libro) {
		list_libros.remove(libro);
		
	}
	public void MostrarLista() {
		 System.out.println(list_libros);
		 }
}

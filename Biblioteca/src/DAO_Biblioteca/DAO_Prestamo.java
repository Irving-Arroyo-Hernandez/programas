package DAO_Biblioteca;

import DTO_Biblioteca.Prestamo;
import java.util.ArrayList;
import java.util.List;

public class DAO_Prestamo {
    
	
	public void AgregarPrestamo(List<Prestamo> lista ,Prestamo prestamo) {
		lista.add(prestamo);
	}
	
	public void ActualizarPrestamos (List<Prestamo> lista ,Prestamo prestamo) {
            for (int i = 0; i < lista.size(); i++) {
	          if(lista.get(i).getId()== prestamo.getId()){
		lista.get(i).setFolio(prestamo.getFolio());
                lista.get(i).setEstatus(prestamo.getEstatus());
                lista.get(i).setLibros(prestamo.getLibros());
                lista.get(i).setPersona(prestamo.getPersona());
	}
	
            }
        }
            
          public void EliminarPrestamo(List<Prestamo> lista ,Prestamo prestamo) {
		lista.remove(prestamo);
		
	}
          public Prestamo BuscarPrestamo(List<Prestamo> lista ,int id) {
        for (int i = 0; i < lista.size(); i++) {
            Prestamo a = lista.get(i);
            if (a.getId() == id) {
                System.out.println(a.getId());
            } else {
                System.out.println("Prestamo no encontrado");
            }
        }
        return null;
    }

          public void imprimirPrestamo (ArrayList<Prestamo> lista ){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
    }
}
	

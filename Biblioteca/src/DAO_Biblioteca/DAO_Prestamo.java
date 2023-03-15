package DAO_Biblioteca;

import DTO_Biblioteca.Prestamo;
import java.util.ArrayList;
import java.util.List;

public class DAO_Prestamo {
    List<Prestamo> list_prestamos= new ArrayList<Prestamo>();
	int id=0;
	
	public void AgregarPrestamo(Prestamo prestamo) {
		prestamo.setId(id+1);
		list_prestamos.add(prestamo);
		id++;
		
	}
	
	public void ActualizarPrestamos (Prestamo prestamo) {
            for (int i = 0; i < list_prestamos.size(); i++) {
	          if(list_prestamos.get(i).getId()== prestamo.getId()){
		list_prestamos.get(i).setFolio(prestamo.getFolio());
                list_prestamos.get(i).setEstatus(prestamo.getEstatus());
                list_prestamos.get(i).setLibros(prestamo.getLibros());
                list_prestamos.get(i).setPersona(prestamo.getPersona());
	}
	
            }
        }
            
          public void EliminarPrestamo(Prestamo prestamo) {
		list_prestamos.remove(prestamo);
		
	}
          public Prestamo BuscarPrestamo(int id) {
        for (int i = 0; i < list_prestamos.size(); i++) {
            Prestamo a = list_prestamos.get(i);
            if (a.getId() == id) {
//                 System.out.println(a.getId());
                return a;
            }else{
                System.out.println("Prestamo no encontrado");
            }
        }
        return null;

    }

          public void imprimirAlumno (ArrayList<Prestamo> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
    }
}
	

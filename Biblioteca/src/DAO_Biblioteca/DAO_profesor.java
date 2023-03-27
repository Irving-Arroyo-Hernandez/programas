 package DAO_Biblioteca;

import DTO_Biblioteca.profesor;
import java.util.ArrayList;
import java.util.List;

public class DAO_profesor {
    
	public void AgregarProfesor(List <profesor> lista ,profesor profesor) {
	lista.add(profesor);
		
	}
	
	public void ActualizarProfesor (List <profesor> lista ,profesor profesor) {
		for (int i = 0; i < lista.size(); i++) {
	          if(lista.get(i).getId()== profesor.getId()){
                      lista.get(i).setNombre(profesor.getNombre());
                      lista.get(i).setApellido_p(profesor.getApellido_p());
                      lista.get(i).setApellido_m(profesor.getApellido_m());
                      lista.get(i).setNum_emp(profesor.getNum_emp());
                  }
                  }
	}
	
	public void EliminarProfesor(List <profesor> lista ,profesor profesor) {
		lista.remove(profesor);
		
	}
         public profesor BuscarProfesor(List <profesor> lista ,int id) {
        for (int i = 0; i < lista.size(); i++) {
            profesor a = lista.get(i);
            if (a.getId() == id) {
                System.out.println(a.getId());
            } else {
                System.out.println("Profesor no encontrado");
            }
        }
        return null;

    }
	public void MostrarListaProfesor(ArrayList<profesor> lista) {
		 for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
}

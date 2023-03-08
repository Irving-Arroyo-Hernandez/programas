package DAO_Biblioteca;

import DTO_Biblioteca.profesor;
import java.util.ArrayList;
import java.util.List;

public class DAO_profesor {
    
	List <profesor> list_profesores= new ArrayList<profesor>();
	int id=0;
	
	public void AgregarProfesor(profesor profesor) {
		profesor.setId(id+1);
		list_profesores.add(profesor);
		id++;
		
	}
	
	public void ActualizarProfesor (profesor profesor) {
		for (int i = 0; i < list_profesores.size(); i++) {
	          if(list_profesores.get(i).getId()== profesor.getId()){
                      list_profesores.get(i).setNombre(profesor.getNombre());
                      list_profesores.get(i).setApellido_p(profesor.getApellido_p());
                      list_profesores.get(i).setApellido_m(profesor.getApellido_m());
                      list_profesores.get(i).setNum_emp(profesor.getNum_emp());
                  }
                  }
	}
	
	public void EliminarProfesor(profesor profesor) {
		list_profesores.remove(profesor);
		
	}
	public void MostrarLista() {
		 System.out.println(list_profesores);
		 }
}

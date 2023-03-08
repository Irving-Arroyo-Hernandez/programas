package DAO_Biblioteca;

import DTO_Biblioteca.alumno;
import java.util.ArrayList;
import java.util.List;

public class DAO_alumno {


	List<alumno> list_alumnos= new ArrayList<alumno>();	

	int id=0;
	
	
	public void AgregarAlumno(alumno alumno) {

		alumno.setId(id+1);
		list_alumnos.add(alumno);
		id++;	
	}
	
	public void actualizar (alumno alumno) {
            
		  for (int i = 0; i < list_alumnos.size(); i++) {
	          if(list_alumnos.get(i).getId()== alumno.getId()){
	              list_alumnos.get(i).setNombre(alumno.getNombre());
	              list_alumnos.get(i).setApellido_p(alumno.getApellido_p());
                      list_alumnos.get(i).setApellido_m(alumno.getApellido_m());
                      list_alumnos.get(i).setSexo(alumno.getSexo());
                      list_alumnos.get(i).setNumero(alumno.getNumero());
	          }
	            }
	        }
		
	
	public void eliminar(alumno alumno) {
		list_alumnos.remove(alumno);
		
	}
	 public void MostrarLista() {
		 System.out.println(list_alumnos);
		 }
	 }    

}
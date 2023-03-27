package DAO_Biblioteca;

import DTO_Biblioteca.alumno;
import java.util.ArrayList;
import java.util.List;

public class DAO_alumno {

    public void agregar_alumno(List<alumno> lista, alumno alumno) {
        lista.add(alumno);

    }

    public void eliminar_alumno(List<alumno> lista, alumno alumno) {
        lista.remove(alumno);
    }

    public alumno buscar_alumno(List<alumno> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            alumno a = lista.get(i);
            if (a.getId() == id) {
                System.out.println(a.getId());
            } else {
                System.out.println("Alumno no encontrado");
            }
        }
        return null;
    }

    public void actualizar_alumno(List<alumno> lista, alumno alumno) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == alumno.getId()) {
                lista.get(i).setNombre(alumno.getNombre());
                lista.get(i).setApellido_m(alumno.getApellido_m());
                lista.get(i).setApellido_p(alumno.getApellido_p());
                lista.get(i).setNumero(alumno.getNumero());
            }
        }
    }

    public void Imprimir_alumno(ArrayList<alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
}

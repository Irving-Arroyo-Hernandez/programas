package DAO_Musica;

import DTO_Musica.genero;
import java.util.ArrayList;
import java.util.List;

public class DAO_Genero {

public void Agregar_genero (List<genero> lista ,genero genero){
   lista.add(genero);
}

public void Actualizar_genero (List<genero> lista ,genero genero){
    for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId_g()== genero.getId_g()) {
                lista.get(i).setNombre_g(genero.getNombre_g());
              }
            }
}
public void Eliminar_genero (List<genero> lista ,genero genero){
    lista.remove(genero);
}
public genero Buscar_genero(List<genero> lista ,int id) {
        for (int i = 0; i < lista.size(); i++) {
            genero a = lista.get(i);
            if (a.getId_g()== id) {
                System.out.println(a.getId_g());
            } else {
                System.out.println("Elemento no encontrado");
            }
        }
        return null;
    }

public void Imprimir_genero (ArrayList<genero> lista){
     for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
}
}
}

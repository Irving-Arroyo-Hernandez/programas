package DAO_Musica;

import DTO_Musica.Albumes;
import java.util.ArrayList;
import java.util.List;

public class DAO_Album {
    
  ;public void Agregrar_album (List<Albumes> lista ,Albumes Albumes){
    lista.add(Albumes);
}

public void Actualizar_album (List<Albumes> lista ,Albumes Albumes){
    for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId_alb()== Albumes.getId_alb()) {
                lista.get(i).setNombre_alb(Albumes.getNombre_alb());
                lista.get(i).setFecha_alb(Albumes.getFecha_alb());
                lista.get(i).setCancion(Albumes.getCancion());
              }
            }
}
public void Eliminar_album (List<Albumes> lista ,Albumes Albumes){
    lista.remove(Albumes);
}
public Albumes Buscar_genero(List<Albumes> lista ,int id) {
        for (int i = 0; i < lista.size(); i++) {
            Albumes a = lista.get(i);
            if (a.getId_alb()== id) {
                System.out.println(a.getId_alb());
            } else {
                System.out.println("Elemento no encontrado");
            }
        }
        return null;
    }

public void Imprimir_genero (ArrayList<Albumes> lista){
     for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
}
}
}

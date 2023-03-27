package DAO_Musica;

import DTO_Musica.Cancion;
import java.util.ArrayList;
import java.util.List;

public class DAO_Cancion {

public void Agregar_cancion (List <Cancion> lista ,Cancion Cancion){
    lista.add(Cancion);
 }

public void Actualizar_cancion (List <Cancion> lista ,Cancion Cancion){
    for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId_c()== Cancion.getId_c()) {
                lista.get(i).setTitulo(Cancion.getTitulo());
                lista.get(i).setNombre_g(Cancion.getNombre_g());
                lista.get(i).setFecha_lan(Cancion.getFecha_lan());
                lista.get(i).setCompositora(Cancion.getCompositora());
                lista.get(i).setCompositorb(Cancion.getCompositorb());
              }
            }
}

public void Eliminar_cancion (List <Cancion> lista ,Cancion Cancion){
    lista.remove(Cancion);
}

public Cancion Buscar_cancion (List <Cancion> lista ,int id){
    for (int i = 0; i < lista.size(); i++) {
            Cancion a = lista.get(i);
            if (a.getId_g()== id) {
                System.out.println(a.getId_g());
            } else {
                System.out.println("Elemento no encontrado");
            }
        }
        return null;
}

public void Imprimir_cancion (ArrayList<Cancion> lista){
    for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
}
}
}
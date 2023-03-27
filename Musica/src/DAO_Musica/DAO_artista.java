package DAO_Musica;

import DTO_Musica.artista;
import java.util.ArrayList;
import java.util.List;

public class DAO_artista {
    
    List <artista> lista_artista = new ArrayList<artista>();
    
    int id=0;
    
    public void Agregar_artista (artista artista){
        artista.setId_art(id+1);
        lista_artista.add(artista);
        id++;
    }
    
    public void Actualizar_artista (artista artista){
        for (int i = 0; i < lista_artista.size(); i++) {
          if(lista_artista.get(i).getId_art()==artista.getId_art()){
              lista_artista.get(i).setActa_nac(artista.getActa_nac());
              lista_artista.get(i).setNombre(artista.getNombre());
              lista_artista.get(i).setApellido_p(artista.getApellido_p());
              lista_artista.get(i).setApellido_m(artista.getApellido_m());
              lista_artista.get(i).setNombre_art(artista.getNombre_art());
          }
        }
    }
          
     public void Eliminar_artista (artista artista){
        lista_artista.remove(artista);
        } 
     
      public artista buscar_artista(int id) {
        for (int i = 0; i < lista_artista.size(); i++) {
            artista a = lista_artista.get(i);
            if (a.getId() == id) {
                System.out.println(a.getId());
            } else {
                System.out.println("Artista no encontrado");
            }
        }
        return null;
    }
      
      public void imprimir_Artista (ArrayList<artista> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       } 
    }
                    
        }
    
    


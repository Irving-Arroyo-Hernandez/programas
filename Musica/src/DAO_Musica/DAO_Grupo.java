package DAO_Musica;

import DTO_Musica.Grupo;
import java.util.ArrayList;
import java.util.List;

public class DAO_Grupo {
  
    public void Agregar_grupo (List<Grupo> lista ,Grupo grupo){
        lista.add(grupo);
    }
    
    public void Actualizar_grupo (List<Grupo> lista ,Grupo grupo){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getId_gr()== grupo.getId_gr()){
                lista.get(i).setNombre_gr(grupo.getNombre_gr());
                lista.get(i).setArtistas(grupo.getArtistas());
                }
        }
    }
    
    public void Eliminar_grupo (List<Grupo> lista ,Grupo grupo){
        lista.remove(grupo);
        }
    
   public Grupo Buscar_grupo (List<Grupo> lista ,int id){
       for (int i = 0; i < lista.size(); i++) {
            Grupo a = lista.get(i);
            if (a.getId_gr()== id) {
                System.out.println(a.getId_gr());
            } else {
                System.out.println("Grupo no encontrado");
            }
        }
        return null;
   } 
   
   public void Imprimir_grupo (ArrayList<Grupo> lista){
        for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
    }
   }


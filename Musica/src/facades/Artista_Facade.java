package facades;

import DAO_Musica.DAO_artista;
import DTO_Musica.artista;
import Servicios.Servicios;
import java.util.ArrayList;
import java.util.List;

public abstract class Artista_Facade implements Servicios{
    
    DAO_artista artista_dao = new DAO_artista();
    
    @Override
     public void Agrega_Artista(List<artista> lista, artista artista){
         artista_dao.Agregar_artista(artista);
     }
    @Override
    public void Eliminar_Artista(List<artista> lista, artista artista){
        artista_dao.Eliminar_artista(artista);
    }
    @Override
    public void Actualizar_Artista(List<artista> lista, artista artista){
        artista_dao.Actualizar_artista(artista);
    }
    
    public void Buscar_Artista(List<artista> lista, int id){
        artista_dao.buscar_artista(id);
    }
    
    public void Mostrar_Cancion(ArrayList<artista> lista){
        artista_dao.imprimir_Artista(lista);
    }
}

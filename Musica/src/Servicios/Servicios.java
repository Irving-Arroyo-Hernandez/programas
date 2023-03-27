package Servicios;

import DTO_Musica.Albumes;
import DTO_Musica.Cancion;
import DTO_Musica.Grupo;
import DTO_Musica.artista;
import DTO_Musica.genero;
import java.util.List;

public interface Servicios {
    
    public void Agrega_Genero(List<genero> lista, genero genero);
    public void Eliminar_Genero(List<genero> lista, genero genero);
    public void Actualizar_Genero(List<genero> lista, genero genero);
    
    
    public void Agrega_Cancion(List<Cancion> lista, Cancion cancion);
    public void Eliminar_Cancion(List<Cancion> lista, Cancion cancion);
    public void Actualizar_Cancion(List<Cancion> lista, Cancion cancion);
  
    
    public void Agrega_Artista(List<artista> lista, artista artista);
    public void Eliminar_Artista(List<artista> lista, artista artista);
    public void Actualizar_Artista(List<artista> lista, artista artista);
    
    
    public void Agrega_Grupo(List<Grupo> lista, Grupo grupo);
    public void Eliminar_Grupo(List<Grupo> lista, Grupo grupo);
    public void Actualizar_Grupo(List<Grupo> lista, Grupo grupo);
    

    public void Agregar_Album(List<Albumes> lista , Albumes Albumes);
    public void Eliminar_Album(List<Albumes> lista , Albumes Albumes);
    public void Actualizar_Album(List<Albumes> lista , Albumes Albumes);
   
    
}

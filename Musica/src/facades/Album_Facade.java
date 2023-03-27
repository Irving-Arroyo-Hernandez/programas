package facades;

import DAO_Musica.DAO_Album;
import DTO_Musica.Albumes;
import Servicios.Servicios;
import java.util.ArrayList;
import java.util.List;

public abstract class Album_Facade implements Servicios {
    
    DAO_Album album_dao = new DAO_Album();
    
    @Override
    public void Agregar_Album(List<Albumes> lista, Albumes Albumes) {
        album_dao.Agregrar_album(lista, Albumes);
    }
    
    @Override
    public void Eliminar_Album(List<Albumes> lista, Albumes Albumes) {
        album_dao.Eliminar_album(lista, Albumes);
    }

    @Override
    public void Actualizar_Album(List<Albumes> lista, Albumes Albumes) {
        album_dao.Actualizar_album(lista, Albumes);
    }
    
    public void Buscar_Cancion(List<Albumes> lista, int id) {
        album_dao.Buscar_genero(lista, id);
    }
    
    public void Mostrar_Cancion(ArrayList<Albumes> lista) {
        album_dao.Imprimir_genero(lista);
    }
}

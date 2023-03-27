package facades;

import DAO_Musica.DAO_Cancion;
import DTO_Musica.Cancion;
import Servicios.Servicios;
import java.util.ArrayList;
import java.util.List;

public abstract class Cancion_Facade implements Servicios {
    
    DAO_Cancion cancion_dao =new DAO_Cancion();
    
    @Override
    public void Agrega_Cancion(List<Cancion> lista, Cancion cancion){
    cancion_dao.Agregar_cancion(lista, cancion);
    }
    
    @Override
    public void Eliminar_Cancion(List<Cancion> lista, Cancion cancion){
        cancion_dao.Eliminar_cancion(lista, cancion);
    }
    @Override
    public void Actualizar_Cancion(List<Cancion> lista, Cancion cancion){
        cancion_dao.Actualizar_cancion(lista, cancion);
    }

    public void Buscar_Cancion(List<Cancion> lista, int id){
        cancion_dao.Buscar_cancion(lista, id);
    }
    
    public void Mostrar_Cancion(ArrayList<Cancion> lista){
        cancion_dao.Imprimir_cancion(lista);
    }
}

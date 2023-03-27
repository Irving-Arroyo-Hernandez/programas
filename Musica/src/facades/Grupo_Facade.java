package facades;

import DAO_Musica.DAO_Grupo;
import DTO_Musica.Grupo;
import Servicios.Servicios;
import java.util.ArrayList;
import java.util.List;

public abstract class Grupo_Facade implements Servicios{

    DAO_Grupo grupo_dao =new DAO_Grupo();
            
    
    @Override
     public void Agrega_Grupo(List<Grupo> lista, Grupo grupo){
     grupo_dao.Agregar_grupo(lista, grupo);
     }
     
    @Override
    public void Eliminar_Grupo(List<Grupo> lista, Grupo grupo){
    grupo_dao.Eliminar_grupo(lista, grupo);
    }
    
    @Override
    public void Actualizar_Grupo(List<Grupo> lista, Grupo grupo){
        grupo_dao.Actualizar_grupo(lista, grupo);
    }
    
    public void Buscar_Cancion(List<Grupo> lista, int id){
        grupo_dao.Buscar_grupo(lista, id);
    }
    
    public void Mostrar_Cancion(ArrayList<Grupo> lista){
        grupo_dao.Imprimir_grupo(lista);
    }
    
}

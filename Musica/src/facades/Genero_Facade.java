package facades;

import DAO_Musica.DAO_Genero;
import DTO_Musica.genero;
import Servicios.Servicios;
import java.util.ArrayList;
import java.util.List;

public abstract class Genero_Facade implements Servicios {
    
    DAO_Genero genero_dao = new DAO_Genero();
    
    @Override
    public void Agrega_Genero(List<genero> lista, genero genero) {
        genero_dao.Agregar_genero(lista, genero);
    }
    
    @Override
    public void Eliminar_Genero(List<genero> lista, genero genero) {
        genero_dao.Eliminar_genero(lista, genero);
    }

    @Override
    public void Actualizar_Genero(List<genero> lista, genero genero) {
        genero_dao.Actualizar_genero(lista, genero);
    }
    
    public void Buscar_Genero(List<genero> lista, int id) {
        genero_dao.Buscar_genero(lista, id);
    }
    
    public void Mostrar_Cancion(ArrayList<genero> lista) {
        genero_dao.Imprimir_genero(lista);
    }
}

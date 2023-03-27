package Facades;

import DAO_Biblioteca.DAO_Prestamo;
import DTO_Biblioteca.Prestamo;
import java.util.ArrayList;
import java.util.List;

public class prestamo_Facade {
    
    DAO_Prestamo prestamo_dao = new DAO_Prestamo();
    
    public void Crear (List<Prestamo> lista ,Prestamo prestamo){
    
    prestamo_dao.AgregarPrestamo(lista, prestamo);
}
        
public void actualizar (List<Prestamo> lista ,Prestamo prestamo){
    prestamo_dao.ActualizarPrestamos(lista, prestamo);
}

public void eliminar (List<Prestamo> lista ,Prestamo prestamo){
    prestamo_dao.EliminarPrestamo(lista, prestamo);

}

public void buscar (List<Prestamo> lista ,int id){
    prestamo_dao.BuscarPrestamo(lista, id);
}

public void mostrar (ArrayList<Prestamo> lista){
    prestamo_dao.imprimirPrestamo(lista);
}
}

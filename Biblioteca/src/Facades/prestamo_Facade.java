package Facades;

import DAO_Biblioteca.DAO_Prestamo;
import DTO_Biblioteca.Prestamo;
import java.util.ArrayList;

public class prestamo_Facade {
    
    DAO_Prestamo prestamo_dao = new DAO_Prestamo();
    
    public void Crear (Prestamo prestamo){
    
    prestamo_dao.AgregarPrestamo(prestamo);
}
        
public void actualizar (Prestamo prestamo){
    prestamo_dao.ActualizarPrestamos(prestamo);
}

public void eliminar (Prestamo prestamo){
    prestamo_dao.EliminarPrestamo(prestamo);

}

public void buscar (Prestamo prestamo){
    prestamo_dao.BuscarPrestamo(0);
}

public void mostrar (ArrayList<Prestamo> lista){
    prestamo_dao.imprimirAlumno(lista);
}
}

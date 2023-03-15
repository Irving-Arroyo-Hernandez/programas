package Agenda_Servicios;

import DTO_Biblioteca.Prestamo;
import Facades.prestamo_Facade;
import java.util.ArrayList;

public class prestamo_Servicios {
    
    prestamo_Facade prestamo_facade = new prestamo_Facade();
    
    public void agregarPrestamo (Prestamo prestamo){
    prestamo_facade.Crear(prestamo);
}

public void ActualizarPrestamo (Prestamo prestamo){
    prestamo_facade.actualizar(prestamo);
}

public void ELiminarPrestamo (Prestamo prestamo){
    prestamo_facade.eliminar(prestamo);
}

public void BuscarPrestamo (Prestamo prestamo){
prestamo_facade.buscar(prestamo);
}

public void MostrarPrestamo (ArrayList<Prestamo> lista){
    prestamo_facade.mostrar(lista);
}
}

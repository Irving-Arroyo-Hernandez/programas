package DTO_Musica;

import java.util.List;

public class Albumes{
    private int id_alb;
    private String nombre_alb;
    private List<Cancion> cancion;
    private String fecha_alb;

    public Albumes(int id_alb, String nombre_alb, String fecha_alb) {
        this.id_alb = id_alb;
        this.nombre_alb = nombre_alb;
        this.fecha_alb = fecha_alb;
    }
  public int getId_alb() {
        return id_alb;
    }

    public void setId_alb(int id_alb) {
        this.id_alb = id_alb;
    }

    public String getNombre_alb() {
        return nombre_alb;
    }

    public void setNombre_alb(String nombre_alb) {
        this.nombre_alb = nombre_alb;
    }

    public List<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(List<Cancion> cancion) {
        this.cancion = cancion;
    }

    public String getFecha_alb() {
        return fecha_alb;
    }

    public void setFecha_alb(String fecha_alb) {
        this.fecha_alb = fecha_alb;
    }
    @Override
    public String toString() {
        return "Albumes{" + "id_alb=" + id_alb + ", nombre_alb=" + nombre_alb + ", cancion=" + cancion + ", fecha_alb=" + fecha_alb + '}';
    }
    
    
}

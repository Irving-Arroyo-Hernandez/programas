package DTO_Musica;

import java.util.List;

public class Cancion extends genero{
    private int id_c;
    private String titulo;
    private String Fecha_lan;
    private List<artista> compositora;
    private List<Grupo> compositorb;

    public Cancion(int id_c, String titulo, String Fecha_lan, int id_g, String nombre_g) {
        super(id_g, nombre_g);
        this.id_c = id_c;
        this.titulo = titulo;
        this.Fecha_lan = Fecha_lan;
    }

  

    public int getId_c() {
        return id_c;
    }

    public void setId_c(int id_c) {
        this.id_c = id_c;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_lan() {
        return Fecha_lan;
    }

    public void setFecha_lan(String Fecha_lan) {
        this.Fecha_lan = Fecha_lan;
    }

    public List<artista> getCompositora() {
        return compositora;
    }

    public void setCompositora(List<artista> compositora) {
        this.compositora = compositora;
    }

    

    public List<Grupo> getCompositorb() {
        return compositorb;
    }

    public void setCompositorb(List<Grupo> compositorb) {
        this.compositorb = compositorb;
    }

    
@Override
    public String toString() {
        return "Cancion{" + "id_c=" + id_c + ", titulo=" + titulo + ", Fecha_lan=" + Fecha_lan + ", compositora=" + compositora + ", compositorb=" + compositorb + '}';
    }
    


 

    

    
    

    
    
    
}

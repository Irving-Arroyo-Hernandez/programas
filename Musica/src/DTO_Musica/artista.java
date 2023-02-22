package DTO_Musica;
public class artista extends persona {
    private String nombre_art ;
    private int id_art;

    public artista(String nombre_art, int id_art, int id, String nombre, String apellido_p, String apellido_m, String acta_nac) {
        super(id, nombre, apellido_p, apellido_m, acta_nac);
        this.nombre_art = nombre_art;
        this.id_art = id_art;
    }

    public String getNombre_art() {
        return nombre_art;
    }

    public void setNombre_art(String nombre_art) {
        this.nombre_art = nombre_art;
    }

    public int getId_art() {
        return id_art;
    }

    public void setId_art(int id_art) {
        this.id_art = id_art;
    }

    @Override
    public String toString() {
        return "artista{" + "nombre_art=" + nombre_art + ", id_art=" + id_art + '}';
    }
    

   
}

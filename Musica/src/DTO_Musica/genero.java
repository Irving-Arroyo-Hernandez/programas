package DTO_Musica;
public class genero {

private int id_g;
private String nombre_g;

    public genero(int id_g, String nombre_g) {
        this.id_g = id_g;
        this.nombre_g = nombre_g;
    }

    public int getId_g() {
        return id_g;
    }

    public void setId_g(int id_g) {
        this.id_g = id_g;
    }

    public String getNombre_g() {
        return nombre_g;
    }

    public void setNombre_g(String nombre_g) {
        this.nombre_g = nombre_g;
    }

    @Override
    public String toString() {
        return "genero{" + "id_g=" + id_g + ", nombre_g=" + nombre_g + '}';
    }


}

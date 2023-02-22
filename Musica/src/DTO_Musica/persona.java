package DTO_Musica;
public class persona {
private int id;
private String nombre;
private String apellido_p;
private String apellido_m;
private String acta_nac;

    public persona(int id, String nombre, String apellido_p, String apellido_m, String acta_nac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.acta_nac = acta_nac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public String getActa_nac() {
        return acta_nac;
    }

    public void setActa_nac(String acta_nac) {
        this.acta_nac = acta_nac;
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", nombre=" + nombre + ", apellido_p=" + apellido_p + ", apellido_m=" + apellido_m + ", acta_nac=" + acta_nac + '}';
    }


}

package DTO_Biblioteca;
public class persona {
private String nombre;
int id;
private String apellido_p;
private String apellido_m;
private String sexo;

    public persona(String nombre, int id, String apellido_p, String apellido_m, String sexo) {
        this.nombre = nombre;
        this.id = id;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.sexo = sexo;
    }

 public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", id=" + id + ", apellido_p=" + apellido_p + ", apellido_m=" + apellido_m + ", sexo=" + sexo + '}';
    }
    
    
   



}

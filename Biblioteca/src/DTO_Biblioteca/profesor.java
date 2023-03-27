package DTO_Biblioteca;
public class profesor extends persona{

private int num_emp;

    public profesor(int num_emp, String nombre, int id, String apellido_p, String apellido_m, String sexo) {
        super(nombre, id, apellido_p, apellido_m, sexo);
        this.num_emp = num_emp;
    }

@Override
     public int getId() {
        return id;
    }

@Override
     public void setId(int id) {
        this.id = id;
    }
     
    public int getNum_emp() {
        return num_emp;
    }

  

    public void setNum_emp(int num_emp) {
        this.num_emp = num_emp;
    }

    @Override
    public String toString() {
        return "profesor{" + "num_emp=" + num_emp + "nombre="+ nombre + "Id=" + id + "Apellido_p" + apellido_p + "Apellido_m" + apellido_m + "Sexo" + sexo + '}';
    }

    

    
}

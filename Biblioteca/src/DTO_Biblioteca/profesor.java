package DTO_Biblioteca;
public class profesor extends persona{
private int id_profesor;
private int num_emp;

    public profesor(int id_profesor, int num_emp, String nombre, int id, String apellido_p, String apellido_m, String sexo) {
        super(nombre, id, apellido_p, apellido_m, sexo);
        this.id_profesor = id_profesor;
        this.num_emp = num_emp;
    }
    public int getId_profesor() {
        return id_profesor;
    }

    public int getNum_emp() {
        return num_emp;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public void setNum_emp(int num_emp) {
        this.num_emp = num_emp;
    }

    @Override
    public String toString() {
        return "profesor{" + "id_profesor=" + id_profesor + ", num_emp=" + num_emp + '}';
    }


    
}

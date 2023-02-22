package DTO_Biblioteca;
public class alumno extends persona {
   private int Id_alumno;
    private int numero;

    public alumno(int Id_alumno, int numero, String nombre, int id, String apellido_p, String apellido_m, String sexo) {
        super(nombre, id, apellido_p, apellido_m, sexo);
        this.Id_alumno = Id_alumno;
        this.numero = numero;
    }

    public int getId_alumno() {
        return Id_alumno;
    }

    public void setId_alumno(int Id_alumno) {
        this.Id_alumno = Id_alumno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "alumno{" + "Id_alumno=" + Id_alumno + ", numero=" + numero + '}';
    }

   
    

     
    
}
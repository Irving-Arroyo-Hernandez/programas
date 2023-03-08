package DTO_Biblioteca;
public class alumno extends persona {
   private int id;
    private int numero;

    public alumno( int numero, String nombre, int id, String apellido_p, String apellido_m, String sexo) {
        super(nombre, id, apellido_p, apellido_m, sexo);
        this.id = id;
        this.numero = numero;
    }

   @Override
    public int getId() {
        return id;
    }

   @Override
    public void setId(int id) {
        this.id = id;
    }

   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "alumno{" + "id=" + id + ", numero=" + numero + '}';
    }

   

   
    

     
    
}
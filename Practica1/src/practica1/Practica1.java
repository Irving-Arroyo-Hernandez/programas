package practica1;
public class Practica1 {
    public static void main(String[] args) {
        testLogin();
testHackeo();
}
public static void testLogin() {
SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
sesionDeUsuario.setUsuario("sofia");
sesionDeUsuario.setPassword("uvwxyz");
sesionDeUsuario.doLogin();
if(sesionDeUsuario.isLoggedIn()) {
System.out.println("Bienvenido "+sesionDeUsuario.getUsuario());
}else {
System.out.println("Su usuario o contraseña están equivocados");
}
sesionDeUsuario.setPassword("abcdef");
/*sesionDeUsuario.doLogin();
if(sesionDeUsuario.isLoggedIn()) {
System.out.println("Bienvenido "+sesionDeUsuario.getUsuario());
}else {
System.out.println("Su usuario o contraseña estan equivocados");
}*/   //Esta repetida esta parte
}
public static void testHackeo() {
SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
//sesionDeUsuario.getPassword();    En esta linea intenta robar la contraseña pero como esta emcriptada en MD5 ocurre un error
//sesionDeUsuario.setLoggedIn(true);  En esta line intentan establecer el logeo como verdadero cuando el metodo del set no esta ya que esa clase 
//solo retorna el valor
}
}





    


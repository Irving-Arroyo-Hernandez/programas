package Vista;

import Dominio.Arbol_Manzana;
import logica.Experimento_Manzana;

public class Vista_Manzana {
    
 public void run() {
 Arbol_Manzana[] manzanos = new Arbol_Manzana[5];
 manzanos[0] = new Arbol_Manzana( 1, 16, 230, 200);
 manzanos[1] = new Arbol_Manzana( 2, 20, 200, 190);
 manzanos[2] = new Arbol_Manzana( 3, 13, 210, 180);
 manzanos[3] = new Arbol_Manzana( 4, 25, 190, 200);
 manzanos[4] = new Arbol_Manzana( 5, 22, 198, 205);
 Experimento_Manzana exp = new Experimento_Manzana();
 exp.setManzanos(manzanos);
 System.out.println("Rendimiento del cultivo de manzanas");
 int promedioManzanas= exp.getPromedioNumeroManzanas();
 System.out.println("Numero promedio de manzanas "+promedioManzanas);
 int promedioAlturaArbolManzana= exp.getPromedioAlturaArbolManzana();
 System.out.println("Altura promedio de los arboles "+promedioAlturaArbolManzana);
 int promedioPesoManzana= exp.getPromedioPesoManzana();
 System.out.println("Peso promedio de las manzanas"+promedioPesoManzana);
 }
}



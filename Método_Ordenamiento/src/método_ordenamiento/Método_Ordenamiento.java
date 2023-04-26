package método_ordenamiento;

import Ordenamiento.Met_Ordenamiento;
import java.util.Scanner;

public class Método_Ordenamiento {

    public static void main(String[] args) {
        int n, op = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("De qué tamaño deseas el vector: ");
        n = leer.nextInt();

        int[] array = new int[n];
        Met_Ordenamiento.llenar_arreglo(array);
        System.out.println("Vector Inicial: ");
        Met_Ordenamiento.imprimir_arreglo(array);

        System.out.println("¿Por qué método lo quieres");
        System.out.println("1.-Metodo burbuja");
        System.out.println("2.-Metodo seleccion");
        System.out.println("3.-Metodo de insercion");
        System.out.println("4.-Shell");
        System.out.println("5.-Salir");
        op = leer.nextInt();

        if (op == 1) {
            Met_Ordenamiento.Burbuja(array);
            System.out.println("Vector Ordenado");
            Met_Ordenamiento.imprimir_arreglo(array);
        } else {
            if (op == 2) {
                Met_Ordenamiento.Selección(array);
                System.out.println("Vector Ordenado");
                Met_Ordenamiento.imprimir_arreglo(array);
            } else {
                if (op == 3) {
                    Met_Ordenamiento.Insercion(array);
                    System.out.println("Vector Ordenado");
                    Met_Ordenamiento.imprimir_arreglo(array);
                } else {
                    if (op == 4) {
                        Met_Ordenamiento.Shell(array);
                        System.out.println("Vector Ordenado");
                        Met_Ordenamiento.imprimir_arreglo(array);
                    }else{
                        if(op==5){
                            System.out.println("Saliendo...");
                        }
                    }
                }
            }
        }

    }

}

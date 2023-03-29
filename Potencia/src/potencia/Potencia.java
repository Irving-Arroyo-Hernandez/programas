package potencia;

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {

        int b = 0, e= 0;
        Calcular prueba = new Calcular();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor de la base");
        b= leer.nextInt();
        System.out.println("Ingrese el valor del exponente");
        e = leer.nextInt();

        prueba.elevar(b,e);

        System.out.println("El resultado de la operacion es :"+" "+prueba.elevar(b,e));

    }
}

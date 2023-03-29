package serie_fibonacci;

import java.util.Scanner;

public class Serie_fibonacci {

    public static void main(String[] args) {

        int a = 0, b = 0, c = 0, limite = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor limite de numeros en la sucesion");
        limite = leer.nextInt();

        System.out.println("Ingrese el valor inicial");

        b = leer.nextInt();

        for (int i = 0; i < limite; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        System.out.println("");
    }

}

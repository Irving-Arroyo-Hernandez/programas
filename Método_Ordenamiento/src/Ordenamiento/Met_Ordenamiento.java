/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamiento;

import java.util.Random;

/**
 *
 * @author EQ40
 */
public class Met_Ordenamiento {

    public static int[] Burbuja(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int aux = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }

    public static int[] Selección(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int aux = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }

    public static int[] Insercion(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int aux = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }

    public static int[] Shell(int arreglo[]) {
        int salto, aux, i;
        boolean cambios;

        for (salto = arreglo.length / 2; salto != 0; salto /= 2) {
            cambios = true;

            while (cambios) {
                cambios = false;

                for (i = salto; i < arreglo.length; i++) {
                    if (arreglo[i - salto] > arreglo[i]) {
                        aux = arreglo[i];
                        arreglo[i] = arreglo[i - salto];
                        arreglo[i - salto] = aux;
                        cambios = true;
                    }
                }

            }

        }
        return arreglo;
    }

    public static int[] llenar_arreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = new Random().nextInt(100);
        }
        return arreglo;
    }

    public static void imprimir_arreglo(int arreglo[]) {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(String.valueOf(arreglo[i]) + " ");
        }
    }

}

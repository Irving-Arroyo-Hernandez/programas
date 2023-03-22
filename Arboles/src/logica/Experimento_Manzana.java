package logica;

import Dominio.Arbol_Manzana;

public class Experimento_Manzana {

    private Arbol_Manzana[] manzanos;

    public int getPromedioNumeroManzanas() {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + manzanos[i].getNumeroFrutas();
        }
        return suma / 5;
    }

    public int getPromedioAlturaArbolManzana() {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + manzanos[i].getAlturaCm();
        }
        return suma / 5;
    }

    public int getPromedioPesoManzana() {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + manzanos[i].getPesoPromedioFruta();
        }
        return suma / 5;
    }

    public void setManzanos(Arbol_Manzana[] manzanos) {
        this.manzanos = manzanos;
    }
}



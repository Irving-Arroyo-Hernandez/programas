package logica;

import Dominio.Arbol_Durazno;

public class Experimento_Durazno {

    private Arbol_Durazno[] duraznos;

    public int getPromedioNumeroDuraznos() {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + duraznos[i].getNumeroFrutas();
        }
        return suma / 5;
    }

    public int getPromedioAlturaArbolDurazno() {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + duraznos[i].getAlturaCm();
        }
        return suma / 5;
    }

    public int getPromedioPesoDurazno() {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + duraznos[i].getPesoPromedioFruta();
        }
        return suma / 5;
    }

    public void setDuraznos(Arbol_Durazno[] duraznos) {
        this.duraznos = duraznos;
    }
}

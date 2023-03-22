package Vista;

import Dominio.Arbol_Durazno;
import logica.Experimento_Durazno;

public class Vista_Durazno {

    public void run() {
        Arbol_Durazno[] duraznos = new Arbol_Durazno[5];
        duraznos[0] = new Arbol_Durazno(1, 15, 180, 150);
        duraznos[1] = new Arbol_Durazno(2, 16, 190, 160);
        duraznos[2] = new Arbol_Durazno(3, 17, 200, 200);
        duraznos[3] = new Arbol_Durazno(4, 16, 230, 189);
        duraznos[4] = new Arbol_Durazno(5, 16, 180, 168);
        Experimento_Durazno exp = new Experimento_Durazno();
        exp.setDuraznos(duraznos);
        System.out.println("Rendimiento del cultivo de duraznos");
        int promedioDuraznos = exp.getPromedioNumeroDuraznos();
        System.out.println("Numero promedio de duraznos " + promedioDuraznos);
        int promedioAlturaArbolDurazno = exp.getPromedioAlturaArbolDurazno();
        System.out.println("Altura promedio de los arboles " + promedioAlturaArbolDurazno);
        int promedioPesoDurazno = exp.getPromedioPesoDurazno();
        System.out.println("Peso promedio de las duraznos" + promedioPesoDurazno);
    }
}



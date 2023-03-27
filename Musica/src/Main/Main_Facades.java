package Main;

import DTO_Musica.Albumes;
import DTO_Musica.Cancion;
import DTO_Musica.artista;
import facades.Album_Facade;
import facades.Artista_Facade;
import facades.Cancion_Facade;
import facades.Genero_Facade;
import facades.Grupo_Facade;
import java.util.ArrayList;
import java.util.List;

public class Main_Facades {

    public static void main(String[] args) {

        Cancion_Facade Cancion = new Cancion_Facade();
        Album_Facade Album = new Album_Facade();
        Artista_Facade Artista;
        Genero_Facade Genero;
        Grupo_Facade Grupo;

        List<Cancion> lista_cancion = new ArrayList<Cancion>();
        List<artista> cancion_1 = new ArrayList<>();
        List<Albumes> lista_album = new ArrayList<Albumes>();

        artista artista1 = new artista("", 0, 0, "", "", "", "");
        artista1.setNombre("Sebastian");
        artista1.setApellido_p("Obando");
        artista1.setApellido_m("Giraldo");
        artista1.setActa_nac("15/oct/1994");
        artista1.setId(1);
        artista1.setId_art(001);
        artista1.setNombre_art("Sebastian Yatra");

        cancion_1.add(artista1);

        Cancion cancion1 = new Cancion(0, "", "", 0, "");
        cancion1.setFecha_lan("2022");
        cancion1.setId_c(1);
        cancion1.setId_g(1);
        cancion1.setTitulo("Tacones Rojos");
        cancion1.setNombre_g("Pop");
        cancion1.setCompositora(cancion_1);

        Cancion cancion2 = new Cancion(0, "", "", 0, "");
        cancion2.setFecha_lan("2019");
        cancion2.setId_c(2);
        cancion2.setId_g(2);
        cancion2.setTitulo("Te quemaste");
        cancion2.setNombre_g("Regueton");
        cancion2.setCompositora(cancion_1);

        Albumes album1 = new Albumes(0, "", "");
        album1.setFecha_alb("2022");
        album1.setId_alb(1);
        album1.setNombre_alb("Dharma");
        album1.setCancion(lista_cancion);

        Cancion.Agrega_Cancion(lista_cancion, cancion1);
        Cancion.Agrega_Cancion(lista_cancion, cancion2);
        Album.Agregar_Album(lista_album, album1);
        System.out.println(lista_album);
        System.out.println(lista_cancion);
    }

}

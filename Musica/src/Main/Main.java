package Main;

import DTO_Musica.Albumes;
import DTO_Musica.Cancion;
import DTO_Musica.Grupo;
import DTO_Musica.artista;
import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
        
        
       artista artista1 = new artista("",0,0,"","","","");
        artista1.setNombre("Sebastian");
        artista1.setApellido_p("Obando");
        artista1.setApellido_m("Giraldo");
        artista1.setActa_nac("15/oct/1994");
        artista1.setId(1);
        artista1.setId_art(001);
        artista1.setNombre_art("Sebastian Yatra");
        
        artista artista2 = new artista("",0,0,"","","","");
        artista2.setNombre("Manuel");
        artista2.setApellido_p("Turizo");
        artista2.setApellido_m("Zapata");
        artista2.setActa_nac("12/abr/2000");
        artista2.setId(2);
        artista2.setId_art(002);
        artista2.setNombre_art("Manuel Turizo");
        
        artista artista3 = new artista("",0,0,"","","","");
        artista3.setNombre("Jesus");
        artista3.setApellido_p("Navarro");
        artista3.setApellido_m("Rosas");
        artista3.setActa_nac("9/jul/1986");
        artista3.setId(3);
        artista3.setId_art(003);
        artista3.setNombre_art("Jesue Navarro");
        
        artista artista4 = new artista("",0,0,"","","","");
        artista4.setNombre("Gilberto");
        artista4.setApellido_p("Marin");
        artista4.setApellido_m("Espinoza");
        artista4.setActa_nac("26/ene/1983");
        artista4.setId(4);
        artista4.setId_art(004);
        artista4.setNombre_art("Bibi Marin");
        
        artista artista5 = new artista("",0,0,"","","","");
        artista5.setNombre("Julio");
        artista5.setApellido_p("Ramires");
        artista5.setApellido_m("Eguia");
        artista5.setActa_nac("21/dic/1987");
        artista5.setId(5);
        artista5.setId_art(005);
        artista5.setNombre_art("Julio Ramirez");
       
        
        List<artista> grupo1= new ArrayList<>();
        
        grupo1.add(artista3);
        grupo1.add(artista4);
        grupo1.add(artista5);
        
        Grupo reik = new Grupo(0,"");
        reik.setNombre_gr("Reik");
        reik.setId_gr(1);
        reik.setArtistas(grupo1);
       
        List<artista> cancion_1= new ArrayList<>();
        cancion_1.add(artista1);
        
        Cancion cancion1= new Cancion(0,"","",0,"");
        cancion1.setFecha_lan("2022");
        cancion1.setId_c(1);
        cancion1.setId_g(1);
       cancion1.setTitulo("Tacones Rojos");
        cancion1.setNombre_g("Pop");
        cancion1.setCompositora(cancion_1);
        
        List<Cancion> album_1=new ArrayList<>();
        
        album_1.add(cancion1);
        
        Albumes album1 =new Albumes(0,"","");
        album1.setFecha_alb("2022");
        album1.setId_alb(1);
        album1.setNombre_alb("Dharma");
        album1.setCancion(album_1);
        
         List<artista> cancion_2= new ArrayList<>();
        cancion_2.add(artista2);
        
        Cancion cancion2= new Cancion(0,"","",0,"");
        cancion2.setFecha_lan("2019");
        cancion2.setId_c(2);
        cancion2.setId_g(2);
       cancion2.setTitulo("Te quemaste");
        cancion2.setNombre_g("Regueton");
        cancion2.setCompositora(cancion_2);
        
         List<Cancion> album_2=new ArrayList<>();
        
        album_2.add(cancion2);
        
        Albumes album2 =new Albumes(0,"","");
        album2.setFecha_alb("2019");
        album2.setId_alb(2);
        album2.setNombre_alb("ADN");
        album2.setCancion(album_2);
        
        List<Grupo> cancion_3= new ArrayList<>();
        cancion_3.add(reik);
        
        
        Cancion cancion3= new Cancion(0,"","",0,"");
        cancion3.setFecha_lan("2019");
        cancion3.setId_c(3);
        cancion3.setId_g(1);
       cancion3.setTitulo("Aleluya");
        cancion3.setNombre_g("Pop");
        cancion3.setCompositorb(cancion_3);
        
         List<Cancion> album_3=new ArrayList<>();
        
        album_3.add(cancion3);
        
        Albumes album3 =new Albumes(0,"","");
        album3.setFecha_alb("2019");
        album3.setId_alb(2);
        album3.setNombre_alb("Ahora");
        album3.setCancion(album_3);
        
                
        System.out.println(album1);
        System.out.println(album2);
        System.out.println(album3);
    }
    }
    


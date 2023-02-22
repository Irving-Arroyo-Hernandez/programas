package DTO_Musica;

import java.util.List;

public class Grupo  {
private int id_gr;
private List<artista> artistas;
private String nombre_gr;

    public Grupo(int id_gr, String nombre_gr) {
        this.id_gr = id_gr;
        this.nombre_gr = nombre_gr;
    }

    public int getId_gr() {
        return id_gr;
    }

    public void setId_gr(int id_gr) {
        this.id_gr = id_gr;
    }

    public List<artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<artista> artistas) {
        this.artistas = artistas;
    }

    public String getNombre_gr() {
        return nombre_gr;
    }

    public void setNombre_gr(String nombre_gr) {
        this.nombre_gr = nombre_gr;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id_gr=" + id_gr + ", artistas=" + artistas + ", nombre_gr=" + nombre_gr + '}';
    }

    
   }

package com.practica.hebert.petagram;

public class Mascota {

    // Atributos
    private int foto ;
    private String nombre ;
    private byte rating ;

    // Constructor
    public Mascota(int foto, String nombre, byte rating){
        this.foto   = foto ;
        this.nombre = nombre ;
        this.rating = rating ;
    } // fin del constructor

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }
} // fin de la clase Mascota

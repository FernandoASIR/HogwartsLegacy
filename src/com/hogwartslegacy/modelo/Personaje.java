package com.hogwartslegacy.modelo;

public  abstract class Personaje {

private String nombre;
private int vida;
public static final int MAX_VIDA=100;


    public Personaje() {
        this.nombre="";
        this.vida=0;
    }

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre.toUpperCase().trim();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if(vida<0){
            this.vida =0;
        } else if(vida>MAX_VIDA) {
            this.vida = MAX_VIDA;
        } else{
            this.vida=vida;
        }
    }
}

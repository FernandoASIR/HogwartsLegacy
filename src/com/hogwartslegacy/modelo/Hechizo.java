package com.hogwartslegacy.modelo;

public class Hechizo {
    private String nombre;
    private int costeMana;
    public static final int MAX_COSTE=20;

    public Hechizo() {
        this.nombre="";
        this.costeMana=0;
    }

    public Hechizo(String nombre, int costeMana) {
        this.nombre = nombre;
        this.costeMana = costeMana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }

    public int getCosteMana() {
        return costeMana;
    }

    public void setCosteMana(int costeMana) {
        if(costeMana<0) {
            this.costeMana = 0;
        } else if(costeMana>MAX_COSTE){
            this.costeMana= MAX_COSTE;
        }
        }
}

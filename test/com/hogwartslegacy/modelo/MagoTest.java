package com.hogwartslegacy.modelo;


import org.junit.jupiter.api.Test;

import static com.hogwartslegacy.modelo.Casa.GRYFFINDOR;
import static com.hogwartslegacy.modelo.Casa.SIN_CASA;
import static com.hogwartslegacy.modelo.Madera.ACEBO;
import static com.hogwartslegacy.modelo.Mago.MAX_MAGIA;
import static com.hogwartslegacy.modelo.Mago.MAX_VIDA;
import static com.hogwartslegacy.modelo.Nucleo.PLUMA_FENIX;
import static com.hogwartslegacy.modelo.Varita.MAX_POW;
import static com.hogwartslegacy.modelo.Varita.MIN_LONG;
import static org.junit.jupiter.api.Assertions.*;

class MagoTest {


    @Test
    void testConstructorDefecto() {

        Mago magoVacio = new Mago("Harry Potter", MAX_VIDA, GRYFFINDOR, MAX_MAGIA, varitaEbano);
        assertNotNull(magoVacio.getVarita());
        assertNotNull(magoVacio.getNombre());
        assertNotNull(magoVacio.getHechizos());
        assertNotNull(magoVacio.getVarita());
        assertEquals(SIN_CASA, magoVacio.getCasa());
        assertNotNull(magoVacio.getVarita());
        assertEquals(0, magoVacio.getMagia());
        assertEquals(0, magoVacio.getVida());
        assertEquals(Mago.MAX_HECHIZOS, magoVacio.getHechizos().length);


    }

    @Test
    void testSetters() {
        Varita varita = new Varita(ACEBO, PLUMA_FENIX, 10, 10);
        Mago mago = new Mago("Harry Potter",
                100,
                GRYFFINDOR,
                10,
                varita);
        mago.setVarita(null);
        assertNotNull(mago.getVarita());

        mago.setMagia(MAX_MAGIA + 1);
        assertEquals(MAX_MAGIA, mago.getMagia());
        mago.setMagia(-1);
        assertEquals(0, mago.getMagia());

        mago.setNombre(null);
        assertNotNull(mago.getNombre());

    }

    @Test
    void testToString() {
        Personaje mago = new Mago("Harry Potter", MAX_VIDA, GRYFFINDOR, MAX_MAGIA, new Varita());
        assertEquals(0, mago.toString().compareTo("HARRY POTTER (pv:" + MAX_VIDA + ",pm:" + MAX_MAGIA + ") GRYFFINDOR"));
    }

    @Test
    void testEquals() {
        Varita varita = new Varita(ACEBO, PLUMA_FENIX, MIN_LONG, MAX_POW);
        Personaje magoVacio = new Mago("Harry Potter", MAX_VIDA, GRYFFINDOR, MAX_MAGIA, varitaEbano);
        Mago mago = new Mago("Harry Potter", MAX_VIDA, GRYFFINDOR, MAX_MAGIA, varita);
        Personaje copia = new Mago(mago);
        assertEquals(mago, copia);

        assertNotEquals(mago, magoVacio);
    }
}
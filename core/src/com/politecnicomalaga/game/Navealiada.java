package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;

public class Navealiada {

    //Atributos de la nave aliada
    private int posX;
    private int posY;
    private int lado;
    private float velocidad;
    private Texture imagen;
    private boolean vida;

    //Constructor, donde se incicializan los valores de nuestra querida nave

    public Navealiada (int posX, int posY, Texture imagen) {
        this.posX = posX;
        this.posY = posY;
        vida = true;
        this.imagen = imagen;
    }

    //Comportamientos



}

package com.politecnicomalaga.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Disparo {

    private Boolean enemigo;
    private float posX;
    private float posY;
    private Texture imagen;
    private short anchoPant;                                            //Ancho de la pantalla para saber hasta donde podemos moverla
    static private final float VELOCIDAD = 5.0f;                        //Velocidad a la que se va a mover la nave

    static private List<Disparo> disparoList;
    static private final String SPRITE_DISPARO_AMIGO = "DisparoAmigo.png";
    static private final String SPRITE_DISPARO_ENEMIGO = "DisparoEnemigo.png";

    static private float ScreenWidth = 0;
    static private float ScreenHeight = 0;

    public static void control () {
        try{
            for (Disparo d: disparoList) {
                d.moverse();
                d.colisiones();
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static void start(){
        disparoList = new ArrayList<>();
        ScreenHeight = Gdx.graphics.getHeight();
        ScreenWidth = Gdx.graphics.getWidth();
    }

    public void colisiones(){
        //Detectar si está fuera de la pantalla para destruirse:
        if(posY > ScreenHeight || posX > ScreenWidth || posY < 0 || posX < 0)
            this.destruirse();
        //Detectar si toca a una nave:

    }

    public void moverse(){
        posY += VELOCIDAD;
    }

    public static void pintarseTodos(SpriteBatch miSB){
        for(Disparo d: disparoList){
            d.pintarse(miSB);
        }
    }

    public void pintarse(SpriteBatch miSB) {
        miSB.draw(imagen, posX - 5 /*Para que esté centrado en la nave*/, posY + 40,10,10);
    }

    public Disparo (float posX, float posY, boolean esEnemiga, float velocidad) {
        this.posX = posX;
        this.posY = posY;
        enemigo = esEnemiga;
        if(enemigo)
            imagen = new Texture(SPRITE_DISPARO_ENEMIGO);
        else
            imagen = new Texture(SPRITE_DISPARO_AMIGO);

        if(disparoList != null)
            disparoList.add(this);
    }


    /*public Colisiona(float posX, float posY, boolean esEnemiga, float velocidad) {
        this.posX = posX;
        this.posY = posY;
        enemigo = enemiga;
        imagen = new Texture(SPRITE_NAVE_ALIADA);
        anchoPant = anchoPantalla;
    }*/
    public void destruirse() {
        imagen.dispose();
        disparoList.remove(this);
    }
}

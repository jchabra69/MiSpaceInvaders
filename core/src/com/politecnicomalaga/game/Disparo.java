package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;

public class Disparo {

    private bool enemigo;
    private float posX;
    private float posY;
    private Texture imagen;
    private short anchoPant;                                            //Ancho de la pantalla para saber hasta donde podemos moverla
    static private final float VELOCIDAD = 3.0f;                        //Velocidad a la que se va a mover la nave
    static public final String SPRITE_DISPARO_AMIGO = "Navealiada.png";
    static public final String SPRITE_DISPARO_ENEMIGO = "Navealiada.png";

    public Disparo (float posX, float posY, boolean esEnemiga, float velocidad) {
        this.posX = posX;
        this.posY = posY;
        enemigo = enemiga;
        imagen = new Texture(SPRITE_NAVE_ALIADA);
        anchoPant = anchoPantalla;
    }

    /*public Colisiona(float posX, float posY, boolean esEnemiga, float velocidad) {
        this.posX = posX;
        this.posY = posY;
        enemigo = enemiga;
        imagen = new Texture(SPRITE_NAVE_ALIADA);
        anchoPant = anchoPantalla;
    }*/

}

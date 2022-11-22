package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sun.org.apache.xpath.internal.functions.FuncFalse;

public class Nave_Enemiga {
    //Atributos de la nave enemiga
    private float posX;                                                 //Posicion X de la nave
    private float posY;                                                 //Posición Y de la nave
    private Texture imagen;                                             //Imagen de la nave
    private short anchoPant;                                            //Ancho de la pantalla para saber hasta donde podemos moverla
    static private final float VELOCIDAD = 5.0f;                        //Velocidad a la que se va a mover la nave
    static public final String SPRITE_NAVE_ENEMIGA = "Naveenemiga.png"; //String que contiene el archivo de imagen

    //Constructor, donde se incicializan los valores de nuestra querida nave

    public Nave_Enemiga (float posX, float posY, short anchoPantalla) {
        this.posX = posX;
        this.posY = posY;
        imagen = new Texture(SPRITE_NAVE_ENEMIGA);
        anchoPant = anchoPantalla;
    }

    //Comportamientos
    public void moverse() {
        boolean sentido = false;
        while(sentido == false){
            posX += VELOCIDAD;
            if (posX+50f > anchoPant){
                sentido = true;
            }else if
            (sentido == true){
            posX -= VELOCIDAD;
            if (posX-50f < 0){
                sentido = false;
            }
        }
        }
    }
    public void pintarse(SpriteBatch miSB) {
        miSB.draw(imagen, posX-(200/2.0f), posY-(200/2.0f),200,200);
    }

    public void dispose() {
        if (imagen != null) {
            imagen.dispose();
        }
    }
}

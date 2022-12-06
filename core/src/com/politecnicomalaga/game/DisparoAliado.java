//package com.politecnicomalaga.game;
//
//import java.util.ArrayList;
//import com.badlogic.gdx.graphics.Texture;
//
//
//public class DisparoAliado {
//
//    private Boolean enemigo;
//    private float posX;
//    private float posY;
//    private Texture imagen;
//    private short anchoPant;                                            //Ancho de la pantalla para saber hasta donde podemos moverla
//    static private final float velocidad = 3.0f;                        //Velocidad a la que se va a mover la nave
//
//    static private ArrayList<DisparoAliado> disparoList;
//    static private final String SPRITE_DISPARO_AMIGO = "DisparoAmigo.png";
//    static private final String SPRITE_DISPARO_ENEMIGO = "DisparoEnemigo.png";
//
//    public void DisparoAliado (float posX, float posY, boolean esEnemiga, float velocidad) {
//
//        this.posX = posX;
//        this.posY = posY;
//        this.enemigo = esEnemiga;
//
//        if(enemigo)
//            imagen = new Texture(SPRITE_DISPARO_ENEMIGO);
//        else
//            imagen = new Texture(SPRITE_DISPARO_AMIGO);
//        disparoList.add(this);
//    }
//
//    public static void control () {
//        for (DisparoAliado d: disparoList) {
//            d.moverse();
//        }
//    }
//
//    public void moverse(){
//        posY += velocidad;
//    }
//
//
//
//
//    /*public Colisiona(float posX, float posY, boolean esEnemiga, float velocidad) {
//        this.posX = posX;
//        this.posY = posY;
//        enemigo = enemiga;
//        imagen = new Texture(SPRITE_NAVE_ALIADA);
//        anchoPant = anchoPantalla;
//    }*/
//    public void destruirse() {
//        imagen.dispose();
//        disparoList.remove(this);
//    }
//}
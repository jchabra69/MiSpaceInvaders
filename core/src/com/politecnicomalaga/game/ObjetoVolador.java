package com.politecnicomalaga.game;

import com.badlogic.gdx.graphics.Texture;

public class ObjetoVolador {

    //Para cumplir la POO, no debo dar valores directamente aquí
    protected float posX, posY;
    protected float velX, velY;
    protected Texture img;
    protected float width, height;

    //Solo asigno valores en el constructor, si no sé que darles les asigno su propio nombre para que no estén NULLs.
    public ObjetoVolador(float pX, float pY, float vX, float vY, String imgStr, float w, float h) {

        img = new Texture(imgStr);
        this.init(pX,pY,vX,vY,w,h);
    }

    public ObjetoVolador(float pX, float pY, float vX, float vY, Texture img, float w, float h) {

        this.img = new Texture();
        this.init(pX,pY,vX,vY,w,h);

    }

    //Hago un método PRIVADO porque en herencia no debe haber setters
     //Este método sustituirá a un segundo constructor para evitar repetir código.

     private void init (float pX, float pY, float vX, float vY, float w, float h) {

            posX = pX;
            posY = pY;
            velX = vX;
            velY = vY;
            width = w;
            height = h;
        }

    }


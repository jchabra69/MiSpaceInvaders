package com.politecnicomalaga.game;

public class EstadoTeclado {


    /*
                Estado
     */
    private boolean teclaArriba,teclaAbajo,teclaIzquierda,teclaDerecha;
    private int alto,ancho;
    private int limiteAlturaZonaArriba;
    private int limiteAnchoZonaLateral;
    
    
    /*
                Comportamiento
     */
    
    
    // CONSTRUCTOR
    
    public EstadoTeclado(int ancho, int alto){             // usamos booleans para simular las teclas pulsadas
        teclaArriba = false;
        teclaAbajo = false;
        teclaIzquierda = false;
        teclaDerecha = false;
        this.ancho = ancho;
        this.alto = alto;
        limiteAlturaZonaArriba= alto/2;                               //Definimos los limites, el de la zona de arriba para trabajar con los disparos mas adelante
        limiteAnchoZonaLateral = ancho/3;
    }

    //Resto de comportamiento

    public boolean isTeclaArriba() {              // la usaremos para los disparos mas adelante
        return teclaArriba;
    }

    public boolean isTeclaAbajo() {               //ahora mismo no sirve para nada
        return teclaAbajo;
    }

    public boolean isTeclaIzq() {                 //la usaremos para movernos a la izquierda
        return teclaIzquierda;
    }

    public boolean isTeclaDer() {                //la usaremos para movernos a la derecha
        return teclaDerecha;
    }
    
    
    
    //cuando nos pulsan en la pantalla. Lo simulamos en el teclado

    public void simulaTeclado(int posX, int posY) {

        if (posY < limiteAlturaZonaArriba)                                   //Si pulsan en la zona superior simulamos que pulsamos la tecla hacia arriba e igual con todas
            teclaArriba = true;
        else {
            teclaArriba = false;


            if (posX < limiteAnchoZonaLateral) {
                teclaIzquierda = true;
                teclaDerecha = false;
            } else if (posX >= ancho - limiteAnchoZonaLateral) {
                teclaDerecha = true;
                teclaIzquierda = false;
            } else {
                teclaDerecha = false;
                teclaIzquierda = false;
            }
        }



    }
    
    
    
    
}

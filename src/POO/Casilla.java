package POO;

import Piezas.Pieza;

public class Casilla {
    private char coorX;
    private int coorY;
    private boolean libre;
    private Pieza contenido;

    public Casilla(char x, int y) {
        coorX = x;
        coorY = y;
    }

    public void addPieza (Pieza p){
        libre=false;
        this.contenido = p;
    }

    public void removePieza(){
        this.contenido = null; //Creo que es opcional
        libre=true;
    }

    public Pieza checkPieza(Casilla c){
        return c.contenido;
    }
    public char getCoorX() {
        return coorX;
    }
    public int getCoorY() {
        return coorY;
    }
    public boolean isLibre() {
        return libre;
    }

}
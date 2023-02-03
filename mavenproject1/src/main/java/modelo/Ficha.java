/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a22danielas
 */
public abstract class Ficha {

    List<Cadrado> cadrados;
    Xogo xogo;
    public Ficha(Xogo xogo) {
        cadrados = new ArrayList<>();
        this.xogo=xogo;
    }

    public List<Cadrado> getCadrados() {
        return cadrados;

    }

    public void setCadrados(List<Cadrado> cadrados) {
        this.cadrados = cadrados;

    }

    public boolean moverDereita(int LADOCADRADO) {
        for (Cadrado cadrado : this.getCadrados()) {
            cadrado.setX(cadrado.getX() + LADOCADRADO);

        }
        return true;
    }

    public boolean moverEsquerda(int LADOCADRADO) {
        for (Cadrado cadrado : this.getCadrados()) {
            cadrado.setX(cadrado.getX() - LADOCADRADO);

        }
        return true;
    }

    public boolean moverAbaixo(int LADOCADRADO) {
        for (Cadrado cadrado : this.getCadrados()) {
            cadrado.setY(cadrado.getY() + LADOCADRADO);
        }

        return true;

    }

    public abstract boolean rotar();
}

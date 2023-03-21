/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.*;

import java.util.List;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public class FichaBarra extends Ficha {

    /**
     * @return the posicion
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public FichaBarra(Xogo x) {
        super(x);

        cadrados.add(new Cadrado(150, 50, yellow));
        cadrados.add(new Cadrado(200, 50, yellow));
        cadrados.add(new Cadrado(250, 50, yellow));
        cadrados.add(new Cadrado(300, 50, yellow));
        id = 1;
    }

    @Override
    public boolean rotar() {
        boolean move = true;
        //Rotacion de Barra
        int y = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getY();
        int x = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getX();

        switch (getPosicion()) {

            case 0 -> {
                int cont = 0;
                //Comprobacion antes de pasar de tumbada a vertical
                if (xogo.ePosicionValida(x, y - 50)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x, y + 50)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x, y + 100)) {
                    cont++;
                }
                //Si la ficha esta tumbada xogo.getFichaActual().getCadrados().get(2).lblCadrado.getX() != xogo.getFichaActual().getCadrados().get(3).lblCadrado.getX() &&
                if (cont == 3) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y - 50);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x, y + 50);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x, y + 100);
                    setPosicion(1);
                }
            }
            case 1 -> {
                int cont = 0;
                //Comprobacion antes de pasar de vertical  a tumbada
                if (xogo.ePosicionValida(x - 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x + 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x + 100, y)) {
                    cont++;
                }
                //Si la ficha esta vertical  xogo.getFichaActual().getCadrados().get(2).lblCadrado.getX() == xogo.getFichaActual().getCadrados().get(3).lblCadrado.getX() && 
                if (cont == 3) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x - 50, y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x + 50, y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x + 100, y);
                    setPosicion(0);
                }
            }

        }

        return move;

    }

}

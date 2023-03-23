/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.*;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public class FichaBarra extends Ficha {

    Cadrado firstCadrado = new Cadrado((xogo.getMAXX() / 2) - xogo.getLADOCADRADO() * 2, xogo.getLADOCADRADO(), yellow);

    public FichaBarra(Xogo x) {
        super(x);

        cadrados.add(firstCadrado);
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY(), yellow));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO() * 2, firstCadrado.getY(), yellow));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO() * 3, firstCadrado.getY(), yellow));
        id = 1;
    }

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

    @Override
    public boolean rotar() {
        boolean move = true;

        int y = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getY();
        int x = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getX();

        switch (getPosicion()) {

            case 0 -> {

                if (xogo.ePosicionValida(x, y - xogo.getLADOCADRADO()) && xogo.ePosicionValida(x, y + xogo.getLADOCADRADO()) && xogo.ePosicionValida(x, y + xogo.getLADOCADRADO() * 2)) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y - xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x, y + xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x, y + xogo.getLADOCADRADO() * 2);
                    setPosicion(1);
                }
            }
            case 1 -> {

                if (xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x + xogo.getLADOCADRADO() * 2, y)) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x - xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x + xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x + xogo.getLADOCADRADO() * 2, y);
                    setPosicion(0);
                }
            }

        }

        return move;

    }

}

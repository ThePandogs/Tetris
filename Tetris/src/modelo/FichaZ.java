/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.magenta;

/**
 *
 * @author ThePandogs
 *
 */
public class FichaZ extends Ficha {

    Cadrado firstCadrado = new Cadrado((xogo.getMAXX() / 2) - xogo.getLADOCADRADO() * 2, 0, magenta);

    public FichaZ(Xogo x) {
        super(x);
        cadrados.add(firstCadrado);
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY(), magenta));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY() + xogo.getLADOCADRADO(), magenta));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO() * 2, firstCadrado.getY() + xogo.getLADOCADRADO(), magenta));
       
    }

    @Override
    public boolean rotar() {
        boolean move = true;
        //Rotacion de L
        int y = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getY();
        int x = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getX();

        switch (posicion) {
            case 0 -> {

                if (xogo.ePosicionValida(x, y - xogo.getLADOCADRADO()) && xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y - xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x - xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x - xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO());
                    posicion = 1;
                }

            }
            case 1 -> {

                if (xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x, y + xogo.getLADOCADRADO()) && xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x - xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x, y + xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x + xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO());
                    posicion = 0;
                }
            }
        }

        return move;
    }

}

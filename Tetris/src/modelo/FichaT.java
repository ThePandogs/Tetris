/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.orange;

/**
 *
 * @author ThePandogs
 *
 */
public class FichaT extends Ficha {

    Cadrado firstCadrado = new Cadrado((xogo.getMAXX() / 2) - xogo.getLADOCADRADO() * 2, xogo.getLADOCADRADO(), orange);

    public FichaT(Xogo x) {
        super(x);
        cadrados.add(firstCadrado);
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY(), orange));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO() * 2, firstCadrado.getY(), orange));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY() - xogo.getLADOCADRADO(), orange));
     
    }

    @Override
    public boolean rotar() {
        boolean move = true;
        //Rotacion de T
        int y = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getY();
        int x = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getX();

        switch (posicion) {
//El case 0 corresponde con la posicion 3 del diagrama,siguiendo el orden 3,0,1,2
            case 0 -> {

                if (xogo.ePosicionValida(x, y - xogo.getLADOCADRADO()) && xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x, y + xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y - xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x + xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x, y + xogo.getLADOCADRADO());
                    posicion = 1;
                }
            }
            case 1 -> {

                if (xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x, y + xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x - xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x + xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x, y + xogo.getLADOCADRADO());
                    posicion = 2;
                }
            }
            case 2 -> {

                if (xogo.ePosicionValida(x, y - xogo.getLADOCADRADO()) && xogo.ePosicionValida(x, y + xogo.getLADOCADRADO()) && xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y)) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y - xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x, y + xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x - xogo.getLADOCADRADO(), y);
                    posicion = 3;
                }

            }
            case 3 -> {

                if (xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x, y - xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x - xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x + xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x, y - xogo.getLADOCADRADO());
                    posicion = 0;
                }

            }
        }

        return move;

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.RED;
import javax.swing.JPanel;

/**
 *
 * @author ThePandogs
 *
 */
public class FichaZReverse extends Ficha {

    Cadrado firstCadrado;

    public FichaZReverse(Xogo x, JPanel panel) {
        super(x, panel);
        firstCadrado = new Cadrado((panel.getWidth() / 2), 0, RED);
        cadrados.add(firstCadrado);
        cadrados.add(new Cadrado(firstCadrado.getX() - xogo.getLADOCADRADO(), firstCadrado.getY(), RED));
        cadrados.add(new Cadrado(firstCadrado.getX() - xogo.getLADOCADRADO(), firstCadrado.getY() + xogo.getLADOCADRADO(), RED));
        cadrados.add(new Cadrado(firstCadrado.getX() - xogo.getLADOCADRADO() * 2, firstCadrado.getY() + xogo.getLADOCADRADO(), RED));

    }

    @Override
    public boolean rotar() {
        boolean move = true;
        //Rotacion de L
        int y = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getY();
        int x = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getX();

        switch (posicion) {
            case 0 -> {

                if (xogo.ePosicionValida(x, y - xogo.getLADOCADRADO()) && xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y - xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x + xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x + xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO());
                    posicion = 1;
                }

            }
            case 1 -> {

                if (xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x, y + xogo.getLADOCADRADO()) && xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x + xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x, y + xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x - xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO());
                    posicion = 0;
                }

            }

        }

        return move;
    }

}

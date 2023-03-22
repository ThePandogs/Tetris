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

        cadrados.add(new Cadrado(x.getLADOCADRADO()*3, x.getLADOCADRADO(), yellow));
        cadrados.add(new Cadrado(x.getLADOCADRADO()*4, x.getLADOCADRADO(), yellow));
        cadrados.add(new Cadrado(x.getLADOCADRADO()*5, x.getLADOCADRADO(), yellow));
        cadrados.add(new Cadrado(x.getLADOCADRADO()*6, x.getLADOCADRADO(), yellow));
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
               
            
                //Si la ficha esta tumbada xogo.getFichaActual().getCadrados().get(2).lblCadrado.getX() != xogo.getFichaActual().getCadrados().get(3).lblCadrado.getX() &&
                if (xogo.ePosicionValida(x, y - xogo.getLADOCADRADO())&& xogo.ePosicionValida(x, y + xogo.getLADOCADRADO()) && xogo.ePosicionValida(x, y + xogo.getLADOCADRADO()*2)) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y - xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x, y + xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x, y + xogo.getLADOCADRADO()*2);
                    setPosicion(1);
                }
            }
            case 1 -> {
               
              
             
                //Si la ficha esta vertical  xogo.getFichaActual().getCadrados().get(2).lblCadrado.getX() == xogo.getFichaActual().getCadrados().get(3).lblCadrado.getX() && 
                if (xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y) &&  xogo.ePosicionValida(x + xogo.getLADOCADRADO()*2, y)) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x -  xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x +  xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x +  xogo.getLADOCADRADO()*2, y);
                    setPosicion(0);
                }
            }

        }

        return move;

    }

}

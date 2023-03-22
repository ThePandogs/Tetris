/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.white;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public class FichaLReverse extends Ficha {

   

    public FichaLReverse(Xogo x) {
        super(x);
        cadrados.add(new Cadrado(x.getLADOCADRADO()*3, xogo.getLADOCADRADO(), white));
        cadrados.add(new Cadrado(x.getLADOCADRADO()*4, xogo.getLADOCADRADO(), white));
        cadrados.add(new Cadrado(x.getLADOCADRADO()*5, xogo.getLADOCADRADO(), white));
        cadrados.add(new Cadrado(x.getLADOCADRADO()*3, 0, white));
        id = 4;
    }

    @Override
    public boolean rotar() {
        boolean move = true;
        //Rotacion de L
        int y = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getY();
        int x = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getX();

        switch (posicion) {
            
            case 0 -> {
             
                if (xogo.ePosicionValida(x, y + xogo.getLADOCADRADO())&xogo.ePosicionValida(x, y - xogo.getLADOCADRADO())&xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y - xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y + xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x, y - xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x + xogo.getLADOCADRADO(), y - xogo.getLADOCADRADO());
                    posicion = 1;
                }

            }
            case 1 -> {

               
                if (xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y)&xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y)&xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x - xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x + xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x + xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO());
                    posicion = 2;
                }

            }
            case 2 -> {
             
                if (xogo.ePosicionValida(x, y - xogo.getLADOCADRADO())&xogo.ePosicionValida(x, y + xogo.getLADOCADRADO())&xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y - xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x, y + xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x - xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO());
                    posicion = 3;
                }

            }
            case 3 -> {

           
                if (xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y)&xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y)&xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y - xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x + xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x - xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x - xogo.getLADOCADRADO(), y - xogo.getLADOCADRADO());
                    posicion = 0;
                }
            }
        }

        return move;
    }

}

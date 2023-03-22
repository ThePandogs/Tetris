/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.GREEN;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public class FichaL extends Ficha {

  

    public FichaL(Xogo x) {
        super(x);
        cadrados.add(new Cadrado(x.getLADOCADRADO()*3, x.getLADOCADRADO(), GREEN));
        cadrados.add(new Cadrado(x.getLADOCADRADO()*4, x.getLADOCADRADO(), GREEN));
        cadrados.add(new Cadrado(x.getLADOCADRADO()*5, x.getLADOCADRADO(), GREEN));
        cadrados.add(new Cadrado(x.getLADOCADRADO()*5, 0, GREEN));
        id = 3;
    }

    @Override
    public boolean rotar() {
        boolean move = true;
        //Rotacion de L
        int y = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getY();
        int x = xogo.getFichaActual().getCadrados().get(1).getLblCadrado().getX();

        switch (posicion) {
//El case 0 corresponde con la posicion 1 del diagrama y el orden es 1,2,3,0
            case 0 -> {
               
                //Comprobacion antes de pasar 
              
                if (xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y - xogo.getLADOCADRADO()) && xogo.ePosicionValida(x, y - xogo.getLADOCADRADO()) &&xogo.ePosicionValida(x, y + xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y + xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x, y - xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x - xogo.getLADOCADRADO(), y - xogo.getLADOCADRADO());
                    posicion = 1;
                }

            }
            case 1 -> {
              
               
                if (xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO()) &&xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y) ) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x - xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x + xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x - xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO());
                    posicion = 2;
                }

            }
            case 2 -> {
              
                if (xogo.ePosicionValida(x, y - xogo.getLADOCADRADO()) && xogo.ePosicionValida(x, y + xogo.getLADOCADRADO()) &&xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO())) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y - xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x, y + xogo.getLADOCADRADO());
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x + xogo.getLADOCADRADO(), y + xogo.getLADOCADRADO());
                    posicion = 3;
                }

            }
            case 3 -> {
             
                if (xogo.ePosicionValida(x - xogo.getLADOCADRADO(), y) && xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y)&& xogo.ePosicionValida(x + xogo.getLADOCADRADO(), y - xogo.getLADOCADRADO()) ) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x - xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x + xogo.getLADOCADRADO(), y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x + xogo.getLADOCADRADO(), y - xogo.getLADOCADRADO());
                    posicion = 0;
                }

            }
        }

        return move;
    }

}

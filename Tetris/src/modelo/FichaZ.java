/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.magenta;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */

public class FichaZ extends Ficha {
  public Cadrado c = new Cadrado(200, 0, magenta);
    public Cadrado c1 = new Cadrado(250, 0, magenta);
    public Cadrado c2 = new Cadrado(250, 50, magenta);
    public Cadrado c3 = new Cadrado(300, 50, magenta);
    public FichaZ(Xogo x) {
         super(x);
         cadrados.add(c);
          cadrados.add(c1);
            cadrados.add(c2);
              cadrados.add(c3);
               id=6;
    }

    @Override
    public boolean rotar() {
        boolean move = true;
        //Rotacion de L
        int y = xogo.getFichaActual().getCadrados().get(1).lblCadrado.getY();
        int x = xogo.getFichaActual().getCadrados().get(1).lblCadrado.getX();

        switch (posicion) {
            case 0 -> {
                int cont = 0;
                //Comprobacion antes de pasar 
                if (xogo.ePosicionValida(x, y -50)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x-50 , y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x-50, y +50)) {
                    cont++;
                }
                if (cont == 3) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y -50);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x-50 , y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x-50, y +50);
               posicion = 1; }
                
            }
            case 1 -> {

   int cont = 0;
                if (xogo.ePosicionValida(x - 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x , y+50)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x+50, y + 50)) {
                    cont++;
                }
                if (cont == 3) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x - 50, y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x , y+50);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x+50, y + 50);
                    posicion = 0;
                }
                
            }
        
        }

        return move;    }
        
    }
    


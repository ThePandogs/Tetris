/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import static java.awt.Color.white;

/**
 *
 * @author dania
 */
public class FichaLReverse extends Ficha{
    public Cadrado c=new Cadrado(150, 50,white);
 public Cadrado c1=new Cadrado(200, 50,white);
public  Cadrado c2=new Cadrado(250, 50,white);
 public Cadrado c3=new Cadrado(150, 0,white);
    public FichaLReverse(Xogo x ) {
          super(x);
          cadrados.add(c);
          cadrados.add(c1);
            cadrados.add(c2);
              cadrados.add(c3);
               id=4;
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
                if (xogo.ePosicionValida(x, y +50)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x , y-50)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x+50, y -50)) {
                    cont++;
                }
                if (cont == 3) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y +50);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x , y-50);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x+50, y -50);
               posicion = 1; }
                
            }
            case 1 -> {

   int cont = 0;
                if (xogo.ePosicionValida(x - 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x + 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x+50, y + 50)) {
                    cont++;
                }
                if (cont == 3) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x - 50, y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x + 50, y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x+50, y +50);
                    posicion = 2;
                }
                
            }
            case 2 -> {
                int cont = 0;
                if (xogo.ePosicionValida(x, y - 50)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x, y + 50)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x - 50, y+50)) {
                    cont++;
                }
                if (cont == 3) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x, y - 50);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x, y + 50);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x -50, y+50);
                  posicion = 3;}
              

            }
            case 3 -> {

                
                int cont = 0;
                if (xogo.ePosicionValida(x + 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x - 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x-50, y - 50)) {
                    cont++;
                }
                if (cont == 3) {
                    xogo.getFichaActual().getCadrados().get(0).actualizarCoordenada(x + 50, y);
                    xogo.getFichaActual().getCadrados().get(2).actualizarCoordenada(x - 50, y);
                    xogo.getFichaActual().getCadrados().get(3).actualizarCoordenada(x-50, y - 50);
                posicion = 0;}
            }
        }

        return move;    }
    
}

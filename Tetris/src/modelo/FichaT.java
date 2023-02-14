/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.red;
import static java.awt.Color.yellow;
import java.util.List;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public class FichaT extends Ficha {

    public Cadrado c = new Cadrado(150, 50, red);
    public Cadrado c1 = new Cadrado(200, 50, red);
    public Cadrado c2 = new Cadrado(250, 50, red);
    public Cadrado c3 = new Cadrado(200, 0, red);

    public FichaT(Xogo x) {
        super(x);
        cadrados.add(c);
        cadrados.add(c1);
        cadrados.add(c2);
        cadrados.add(c3);

    }

    public Cadrado getC() {
        return c;
    }

    public Cadrado getC1() {
        return c1;
    }

    public Cadrado getC2() {
        return c2;
    }

    public Cadrado getC3() {
        return c3;
    }

    public List<Cadrado> getCadrados() {
        return cadrados;
    }

    public void setC(Cadrado c) {
        this.c = c;
    }

    public void setC1(Cadrado c1) {
        this.c1 = c1;
    }

    public void setC2(Cadrado c2) {
        this.c2 = c2;
    }

    public void setC3(Cadrado c3) {
        this.c3 = c3;
    }

    public void setCadrados(List<Cadrado> cadrados) {
        this.cadrados = cadrados;
    }

    @Override
    public boolean rotar() {
        boolean move = true;
        //Rotacion de T
        int y = xogo.fichaActual.getCadrados().get(1).lblCadrado.getY();
        int x = xogo.fichaActual.getCadrados().get(1).lblCadrado.getX();

        switch (posicion) {
//El case 0 corresponde con la posicion 3 del diagrama,siguiendo el orden 3,0,1,2
            case 0 -> {
                int cont = 0;
                //Comprobacion antes de pasar 
                if (xogo.ePosicionValida(x, y - 50)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x + 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x, y + 50)) {
                    cont++;
                }
                if (cont == 3) {
                    xogo.fichaActual.getCadrados().get(0).actualizarCoordenada(x, y - 50);
                    xogo.fichaActual.getCadrados().get(2).actualizarCoordenada(x + 50, y);
                    xogo.fichaActual.getCadrados().get(3).actualizarCoordenada(x, y + 50);
                    posicion = 1;
                }
            }
            case 1 -> {
                int cont = 0;
                if (xogo.ePosicionValida(x - 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x + 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x, y + 50)) {
                    cont++;
                }
                if (cont == 3) {
                    xogo.fichaActual.getCadrados().get(0).actualizarCoordenada(x - 50, y);
                    xogo.fichaActual.getCadrados().get(2).actualizarCoordenada(x + 50, y);
                    xogo.fichaActual.getCadrados().get(3).actualizarCoordenada(x, y + 50);
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
                if (xogo.ePosicionValida(x - 50, y)) {
                    cont++;
                }
                if (cont == 3) {
                    xogo.fichaActual.getCadrados().get(0).actualizarCoordenada(x, y - 50);
                    xogo.fichaActual.getCadrados().get(2).actualizarCoordenada(x, y + 50);
                    xogo.fichaActual.getCadrados().get(3).actualizarCoordenada(x - 50, y);
                    posicion = 3;
                }

            }
            case 3 -> {
                int cont = 0;
                if (xogo.ePosicionValida(x - 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x + 50, y)) {
                    cont++;
                }
                if (xogo.ePosicionValida(x, y - 50)) {
                    cont++;
                }
                if (cont == 3) {
                    xogo.fichaActual.getCadrados().get(0).actualizarCoordenada(x - 50, y);
                    xogo.fichaActual.getCadrados().get(2).actualizarCoordenada(x + 50, y);
                    xogo.fichaActual.getCadrados().get(3).actualizarCoordenada(x, y - 50);
                    posicion = 0;
                }

            }
        }

        return move;

    }
}
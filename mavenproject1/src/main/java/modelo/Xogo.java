/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Iterator;
import iu.VentanaPrincipal;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author a22danielas
 */
public class Xogo {


    private final int LADOCADRADO = 50;
    private final int MAXY = 850;
    private final int MAXX = 450;
    public int numeroLinas = 0;
    public VentanaPrincipal ventanaPricipal;
    public Ficha fichaActual;
    public List<Cadrado> cadradosChan = new ArrayList();
    public List<Cadrado> linea = new ArrayList();

    public Xogo(VentanaPrincipal ventana) {
        ventanaPricipal = ventana;
    }

    public int getNumeroLinas() {
        return numeroLinas;
    }

    public void setNumerolineas(int numerolineas) {
        this.numeroLinas = numerolineas;
    }

    public int getLADOCADRADO() {
        return LADOCADRADO;
    }
    
    
    public List<Cadrado> getCadradosChan() {
        return cadradosChan;
    }

    public void moverEsquerda() {
        boolean flag = true;
        Iterator<Cadrado> ita = fichaActual.cadrados.iterator();
        //Comprobar posicion siguiente de cada cuadrado actual
        while (ita.hasNext()) {
            Cadrado ca = ita.next();
            int x = ca.getX() - LADOCADRADO;
            int y = ca.getY();
            if (ePosicionValida(x, y)) {
            } else {
                flag = false;
            }
        }
        //Si todas las posiciones son validas
        if (flag) {
            fichaActual.moverEsquerda();
        }
    }

    public void moverDereita() {
        boolean flag = true;
        Iterator<Cadrado> ita = fichaActual.cadrados.iterator();
        //Comprobar posicion siguiente de cada cuadrado actual
        while (ita.hasNext()) {
            Cadrado ca = ita.next();
            int x = ca.getX() + LADOCADRADO;
            int y = ca.getY();
            if (ePosicionValida(x, y)) {
            } else {
                flag = false;
            }
        }
        //Si todas las posiciones son validas
        if (flag) {
            fichaActual.moverDereita();
        }
    }

    public void rotarFicha() {
        fichaActual.rotar();
    }

    public void moverFichaAbaixo() {
        boolean flag = true;
        //Si la ficha no toca con el suelo es valido 
        if (!chocaFichaCoChan()) {
        } else {
            flag = false;
        }
        //Si la posicion es valida 
        if (flag) {
            fichaActual.moverAbaixo();
        } else {
            //Añade la ficha actual al suelo
            engadirFichaAoChan();

            //Para despues comprobar si hay lineas completas,y en caso de haberlas,las borra
            borrarLinasCompletas();
            //Y genera una nueva ficha 
            xenerarNovaFicha();
        }
    }

    public void xenerarNovaFicha() {

        ventanaPricipal.getTimer().restart();
        fichaActual = fichaRandom();
        Iterator<Cadrado> ita = fichaActual.cadrados.iterator();
        while (ita.hasNext()) {
            Cadrado actual = ita.next();
            ventanaPricipal.pintarCadrado(actual.getLblCadrado());


        }
       

    }

    private Ficha fichaRandom() {
        int valorDado = (int) Math.floor(Math.random() * 15 + 1);
        Ficha random = null;
        while (random == null) {
            switch (valorDado) {

                case 1,5,6,13 -> {
                    random = new FichaBarra(this);
                }

                case 2,9,10,14 -> {
                    random = new FichaT(this);
                }
                case 3,7,8 -> {
                    random = new FichaCadrada(this);
                }
                case 4,11,12,15 -> {
                    random = new FichaL(this);
                }
            }
        }

        return random;
    }

    public void engadirFichaAoChan() {

        Iterator<Cadrado> ita = fichaActual.cadrados.iterator();
        while (ita.hasNext()) {
            Cadrado c = ita.next();
            cadradosChan.add(c);

        }
        comprobarPerder();
    }

    public boolean chocaFichaCoChan() {

        boolean flag = false;

        Iterator<Cadrado> ite = fichaActual.cadrados.iterator();
        while (ite.hasNext()) {
            Cadrado actual = ite.next();
            if (!ePosicionValida(actual.getX(), actual.getY() + LADOCADRADO)) {
                flag = true;
            }

        }

        return flag;
    }

    public boolean ePosicionValida(int x, int y) {
        boolean tag = true;
        if (x > MAXX || x < 0 || y > MAXY || y < -LADOCADRADO) {
            tag = false;
        }
        Iterator<Cadrado> ita = cadradosChan.iterator();
        while (ita.hasNext()) {
            Cadrado chan = ita.next();
            if ((chan.getX() == x && chan.getY() == y)) {
                tag = false;
            }

        }

        return tag;
    }

    public void borrarLinasCompletas() {
        boolean flag = false;
        Iterator<Cadrado> ite = fichaActual.cadrados.iterator();
        while (ite.hasNext()) {
            Cadrado actual = ite.next();
            Iterator<Cadrado> ita = cadradosChan.iterator();
            while (ita.hasNext()) {
                Cadrado chan = ita.next();

                if (chan.getY() == actual.getY()) {
                    linea.add(chan);
                }
            }
            if (linea.size() == 10) {

                borrarLinas();
                actualizarBloques();
            }

            linea.removeAll(linea);
        }

    }

    public void borrarLinas() {
        Iterator<Cadrado> ita = linea.iterator();
        while (ita.hasNext()) {
            Cadrado este = ita.next();

            ventanaPricipal.borrarCadrado(este.getLblCadrado());
            cadradosChan.removeAll(linea);

        }
        numeroLinas++;
    }

    public void actualizarBloques() {
        int y = linea.get(0).getY();

        Iterator<Cadrado> ita = cadradosChan.iterator();
        while (ita.hasNext()) {
            Cadrado c = ita.next();
            if (y > c.getY()) {
                c.actualizarCoordenada(c.getX(), c.getY() + LADOCADRADO);

            }

        }

    }

    public void comprobarPerder() {
        Iterator<Cadrado> ita = fichaActual.cadrados.iterator();
        while (ita.hasNext()) {
            Cadrado actual = ita.next();
            if (actual.getY() < 100) {

                ventanaPricipal.mostrarFinDoXogo();

            }
        }

    }

}

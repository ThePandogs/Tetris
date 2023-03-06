/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Iterator;
import iu.VentanaPrincipal;
import static java.awt.Color.yellow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public class Xogo {

    private final int LADOCADRADO = 50;
    private final int MAXY = 850;
    private final int MAXX = 450;
    private int numeroLinas = 0;
    private boolean limit = false;
    private VentanaPrincipal ventanaPricipal;
    private Ficha fichaActual;
    private List<Cadrado> cadradosChan = new ArrayList();
    private List<Cadrado> linea = new ArrayList();

    private int level = 0;
    private int LinasNextLevel = 0;

    public Xogo(VentanaPrincipal ventana) {
        ventanaPricipal = ventana;
    }

    public int getNumeroLinas() {
        return numeroLinas;
    }

    public int getLinasNextLevel() {
        return LinasNextLevel;
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

    public int getLevel() {
        return level;
    }

    public Ficha getFichaActual() {
        return fichaActual;
    }

    public void moverEsquerda() {
        boolean flag = true;
        Iterator<Cadrado> ita = fichaActual.cadrados.iterator();
        //Comprobar posicion siguiente de cada cuadrado actual
        while (ita.hasNext()) {
            Cadrado ca = ita.next();
            int x = ca.getX() - LADOCADRADO;
            int y = ca.getY();
            if (!ePosicionValida(x, y)) {
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
            if (!ePosicionValida(x, y)) {
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

        if (!chocaFichaCoChan()) {
            fichaActual.moverAbaixo();
        } else {
            engadeFichaBorraLinasCompletasXeneraNovaFicha();
        }

    }

    public void xenerarNovaFicha() {

        switch (numeroRandom(30)) {

            case 1, 5, 6, 13,30 -> {

                fichaActual = new FichaBarra(this);

            }

            case 2, 9, 10, 14 -> {

                fichaActual = new FichaT(this);

            }
            case 3, 7, 8,28,29 -> {

                fichaActual = new FichaCadrada(this);

            }
            case 4, 11, 12, 15 -> {

                fichaActual = new FichaL(this);

            }
            case 19, 18, 17, 16 -> {
                fichaActual = new FichaLReverse(this);

            }
            case 20, 22, 24, 26 -> {
                fichaActual = new FichaZ(this);

            }
            case 21, 23, 25, 27 -> {
                fichaActual = new FichaZReverse(this);

            }
        }

        Iterator<Cadrado> ita = fichaActual.cadrados.iterator();
        while (ita.hasNext()) {
            Cadrado actual = ita.next();
            ventanaPricipal.pintarCadrado(actual.getLblCadrado());

        }
    }

    private int numeroRandom(int max) {
        return (int) Math.floor(Math.random() * max + 1);
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

        LinasNextLevel++;

        aumentarNivel(numeroLinas,ventanaPricipal.getTimer().getDelay());
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

    private void engadeFichaBorraLinasCompletasXeneraNovaFicha() {
        engadirFichaAoChan();
        borrarLinasCompletas();

        xenerarNovaFicha();

    }

    public boolean aumentarNivel(int lineas,int delay) {
        boolean tag = false;
        if (lineas % 5 == 0 && delay>100) {
            ventanaPricipal.getTimer().setDelay( delay- 100);
            level++;
            LinasNextLevel = 0;
            tag = true;
        }
        return tag;

    }

    public void anadirCuadradosAleatorios() {

        ArrayList<Integer> posiciones = new ArrayList<>();

        Iterator<Cadrado> suelo = cadradosChan.iterator();
        while (suelo.hasNext()) {
            Cadrado siguiente = suelo.next();
            siguiente.actualizarCoordenada(siguiente.getX(), siguiente.getY() - 50);
        }
        for (int i = 0; i < numeroRandom(9); i++) {
            int random = numeroRandom(9);
            while (posiciones.contains(random)) {
                random = numeroRandom(9);

            }
            Cadrado c = new Cadrado(random * 50, MAXY, yellow);
            cadradosChan.add(c);
            ventanaPricipal.pintarCadrado(c.getLblCadrado());
            posiciones.add(random);

        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Iterator;
import iu.VentanaPrincipal;
import java.awt.Color;
import static java.awt.Color.yellow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public final class Xogo {

    //REFERENCIA MAPA JUEGO
    private final int LADOCADRADO = 50;
    private final int MAXY = 850;
    private final int MAXX = 450;
    private final int SAFEZONE = LADOCADRADO * 2;

    //REFERENCIA UI
    private VentanaPrincipal ventanaPricipal;

    //REFERENCIA DIFICULTAD
    //CUANDO MENOS VALOR + RAPIDO EL JUEGO.
    private int dificultadInicioJuego;
    private final int DIFICULTAD_MIN = 1000;
    private final int DIFICULTAD_NIVEL = 40;
    private final int DIFICULTAD_MAX = 200;
    private final int LINEAS_NEXT_LEVEL = 5;

    private List<Cadrado> cadradosChan = new ArrayList();
    private List<Cadrado> linea = new ArrayList();
    private Ficha fichaActual;
    private Ficha fichaSiguiente;
    private int level;
    private int numeroLinas = 0;
    private int LinasNextLevel = 0;

    private boolean gameOver;

    private List<Integer> idFichas = new ArrayList();

    HashMap<Integer, Ficha> listaFichas;

    public Xogo(VentanaPrincipal ventana) {

        ventanaPricipal = ventana;
        comprobarRepeticionFicha();
        fichaStoFichaA();
        ventanaPricipal.mostrarFichaSiguiente(fichaSiguiente.getCadrados().get(0).getLblCadrado());

        this.level = ventanaPricipal.getLevelJSlider().getValue();
        gameOver = false;

    }

    public boolean isGameOver() {
        return gameOver;
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

    public int getDificultadInicioJuego() {
        return dificultadInicioJuego;
    }

    public void setDificultadInicioJuego(int dificultadInicioJuego) {
        this.dificultadInicioJuego = dificultadInicioJuego;
    }

    public int getDIFICULTAD_MIN() {
        return DIFICULTAD_MIN;
    }

    public int getDIFICULTAD_NIVEL() {
        return DIFICULTAD_NIVEL;
    }

    public int getMAXY() {
        return MAXY;
    }

    public int getMAXX() {
        return MAXX;
    }

    public void moverEsquerda() {
        boolean posicionValida = true;
        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();

        while (actual.hasNext()) {
            Cadrado ca = actual.next();
            int x = ca.getX() - LADOCADRADO;
            int y = ca.getY();
            if (!ePosicionValida(x, y)) {
                posicionValida = false;
            }
        }

        if (posicionValida) {
            fichaActual.moverEsquerda();
        }
    }

    public void moverDereita() {
        boolean posicionValida = true;
        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();

        while (actual.hasNext()) {
            Cadrado ca = actual.next();
            int x = ca.getX() + LADOCADRADO;
            int y = ca.getY();
            if (!ePosicionValida(x, y)) {
                posicionValida = false;
            }
        }

        if (posicionValida) {
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

    private void xenerarNovaFicha() {
        Xogo xogoActual = this;
        listaFichas = new HashMap<Integer, Ficha>() {
            {
                put(1, new FichaBarra(xogoActual));
                put(2, new FichaT(xogoActual));
                put(3, new FichaCadrada(xogoActual));
                put(4, new FichaL(xogoActual));
                put(5, new FichaLReverse(xogoActual));
                put(6, new FichaZ(xogoActual));
                put(7, new FichaZReverse(xogoActual));
            }
        };

        fichaSiguiente = listaFichas.get(numeroRandom(7));

    }

    private void comprobarRepeticionFicha() {
        xenerarNovaFicha();
        while (idFichas.contains(fichaSiguiente.getId())) {
            xenerarNovaFicha();
        }
        idFichas.add(fichaSiguiente.id);
        if (idFichas.size() == listaFichas.size() ) {
            idFichas.removeAll(idFichas);
        }

    }

    public void pintarFichaActual() {
        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();
        while (actual.hasNext()) {
            Cadrado cactual = actual.next();
            ventanaPricipal.pintarCadrado(cactual.getLblCadrado());
        }
    }

    private int numeroRandom(int max) {
        return (int) Math.floor(Math.random() * max + 1);
    }

    public void engadirFichaAoChan() {

        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();
        while (actual.hasNext()) {
            Cadrado c = actual.next();
            cadradosChan.add(c);

        }

    }

    public boolean chocaFichaCoChan() {

        boolean choca = false;

        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();

        while (actual.hasNext()) {
            Cadrado cactual = actual.next();

            if (!ePosicionValida(cactual.getX(), cactual.getY() + LADOCADRADO)) {
                choca = true;
            }

        }

        return choca;
    }

    public boolean ePosicionValida(int x, int y) {
        boolean posicionValida = true;
        if (x > MAXX || x < 0 || y > MAXY || y < -LADOCADRADO) {
            posicionValida = false;
        }
        Iterator<Cadrado> chan = cadradosChan.iterator();
        while (chan.hasNext()) {
            Cadrado cchan = chan.next();
            if ((cchan.getX() == x && cchan.getY() == y)) {
                posicionValida = false;
            }

        }

        return posicionValida;
    }

    public void borrarLinasCompletas() {
         int lineaCompleta=10;
        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();
        while (actual.hasNext()) {
            Cadrado cactual = actual.next();
            Iterator<Cadrado> chan = cadradosChan.iterator();
            while (chan.hasNext()) {
                Cadrado cchan = chan.next();

                if (cchan.getY() == cactual.getY()) {
                    linea.add(cchan);
                }
            }
            if (linea.size() == lineaCompleta) {

                borrarLinas();
                numeroLinas++;
                ventanaPricipal.scoreLineaCompleta();
                LinasNextLevel++;
                aumentarNivel(numeroLinas, ventanaPricipal.getTimer().getDelay());
                actualizarBloques();
            }

            linea.removeAll(linea);
        }

    }

    public void borrarLinas() {

        Iterator<Cadrado> blinea = linea.iterator();
        while (blinea.hasNext()) {
            Cadrado este = blinea.next();

            ventanaPricipal.borrarCadrado(este.getLblCadrado());
            cadradosChan.removeAll(linea);

        }
        ventanaPricipal.getSonido().ReproducirSonidoLinea();

    }

    public void actualizarBloques() {
        int y = linea.get(0).getY();

        Iterator<Cadrado> chan = cadradosChan.iterator();
        while (chan.hasNext()) {
            Cadrado c = chan.next();
            if (y > c.getY()) {
                c.actualizarCoordenada(c.getX(), c.getY() + LADOCADRADO);

            }
        }
    }

    private boolean comprobarPerder() {
        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();
        while (actual.hasNext()) {
            Cadrado cactual = actual.next();

            if (cactual.getY() < SAFEZONE) {

                return true;
            }
        }
        return false;

    }

    private void fichaStoFichaA() {
        fichaActual = fichaSiguiente;
        comprobarRepeticionFicha();
    }

    private void engadeFichaBorraLinasCompletasXeneraNovaFicha() {

        if (!comprobarPerder()) {
            engadirFichaAoChan();
            ventanaPricipal.getSonido().ReproducirSuelo();
            borrarLinasCompletas();
            fichaStoFichaA();
            pintarFichaActual();
            ventanaPricipal.mostrarFichaSiguiente(fichaSiguiente.getCadrados().get(0).getLblCadrado());

        } else {
            ventanaPricipal.mostrarFinDoXogo();
            gameOver = true;
        }

    }

    public boolean aumentarNivel(int lineas, int delayActual) {
        boolean aumentaNivel = false;
        if (lineas % LINEAS_NEXT_LEVEL == 0 && delayActual > DIFICULTAD_MAX) {
            ventanaPricipal.getTimer().setDelay(delayActual - DIFICULTAD_NIVEL);
            level++;
            LinasNextLevel = 0;
            aumentaNivel = true;
        }
        return aumentaNivel;
    }

    public void anadirCuadradosAleatorios() {

        ArrayList<Integer> posiciones = new ArrayList<>();

        Iterator<Cadrado> suelo = cadradosChan.iterator();
        while (suelo.hasNext()) {
            Cadrado siguiente = suelo.next();
            siguiente.actualizarCoordenada(siguiente.getX(), siguiente.getY() - LADOCADRADO);
        }

        //Elige la posicion donde incluira un cuadrado y el numero de cuadrados que incluira 
        for (int i = 0; i < numeroRandom(MAXX/LADOCADRADO); i++) {
            int random = numeroRandom(MAXX/LADOCADRADO);

            //Si la posicion escogida ya esta ocupada
            while (posiciones.contains(random)) {
                random = numeroRandom(MAXX/LADOCADRADO);

            }
            //Añade el cuadrado
            Cadrado cadradoPenalty = new Cadrado(random * LADOCADRADO, MAXY, yellow);
            cadradosChan.add(cadradoPenalty);
            ventanaPricipal.pintarCadrado(cadradoPenalty.getLblCadrado());
            posiciones.add(random);

        }
    }
}

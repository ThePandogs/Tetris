/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Iterator;
import iu.VentanaPrincipal;
import static java.awt.Color.yellow;
import java.util.ArrayList;
import java.util.Arrays;
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

    List<Ficha> fichas = new ArrayList<>(Arrays.asList(
            new FichaT(this),
            new FichaBarra(this),
            new FichaCadrada(this),
            new FichaL(this),
            new FichaLReverse(this),
            new FichaZ(this),
            new FichaZReverse(this)));

    public Xogo(VentanaPrincipal ventana) {

        ventanaPricipal = ventana;
        fichaSiguiente = xenerarNovaFicha();
        fichaActual = xenerarNovaFicha();

        ventanaPricipal.mostrarFichaSiguiente(fichaSiguiente.getCadrados().get(0).getLblCadrado());

        this.level = ventanaPricipal.getLevelJSlider().getValue();

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

    public void moverEsquerda() {
        boolean posicionValida = true;
        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();
        //Comprobar posicion siguiente de cada cuadrado actual
        while (actual.hasNext()) {
            Cadrado ca = actual.next();
            int x = ca.getX() - LADOCADRADO;
            int y = ca.getY();
            if (!ePosicionValida(x, y)) {
                posicionValida = false;
            }
        }
        //Si todas las posiciones son validas
        if (posicionValida) {
            fichaActual.moverEsquerda();
        }
    }

    public void moverDereita() {
        boolean posicionValida = true;
        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();
        //Comprobar posicion siguiente de cada cuadrado actual
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

    public Ficha xenerarNovaFicha() {
        Ficha obj = null;
        switch (numeroRandom(30)) {

            case 1, 5, 6, 13, 30 -> {

                obj = new FichaBarra(this);

            }

            case 2, 9, 10, 14 -> {

                obj = new FichaT(this);

            }
            case 3, 7, 8, 28, 29 -> {

                obj = new FichaCadrada(this);

            }
            case 4, 11, 12, 15 -> {

                obj = new FichaL(this);

            }
            case 19, 18, 17, 16 -> {
                obj = new FichaLReverse(this);

            }
            case 20, 22, 24, 26 -> {
                obj = new FichaZ(this);

            }
            case 21, 23, 25, 27 -> {
                obj = new FichaZReverse(this);

            }
        }
        return obj;
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
            if (linea.size() == 10) {

                borrarLinas();
                numeroLinas++;
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
        while (fichaSiguiente.id == fichaActual.id) {
            fichaSiguiente = xenerarNovaFicha();
        }
    }

    private void engadeFichaBorraLinasCompletasXeneraNovaFicha() {

        engadirFichaAoChan();

        ventanaPricipal.getSonido().ReproducirSuelo();

        if (!comprobarPerder()) {

            borrarLinasCompletas();
            fichaStoFichaA();
            pintarFichaActual();
            ventanaPricipal.mostrarFichaSiguiente(fichaSiguiente.getCadrados().get(0).getLblCadrado());

        } else {
            ventanaPricipal.mostrarFinDoXogo();
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
            siguiente.actualizarCoordenada(siguiente.getX(), siguiente.getY() - 50);
        }

        //Elige la posicion donde incluira un cuadrado y el numero de cuadrados que incluira 
        for (int i = 0; i < numeroRandom(9); i++) {
            int random = numeroRandom(9);

            //Si la posicion escogida ya esta ocupada
            while (posiciones.contains(random)) {
                random = numeroRandom(9);

            }
            //Añade el cuadrado
            Cadrado c = new Cadrado(random * 50, MAXY, yellow);
            cadradosChan.add(c);
            ventanaPricipal.pintarCadrado(c.getLblCadrado());
            posiciones.add(random);

        }
    }
}

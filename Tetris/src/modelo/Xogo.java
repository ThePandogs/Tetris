/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Iterator;
import iu.VentanaPrincipal;

import static java.awt.Color.gray;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public final class Xogo {

    //REFERENCIA MAPA JUEGO
    private final int LADOCADRADO = 50;
    private final int MAXY = 900;
    private final int MAXX = 500;
    private final int SAFEZONE = LADOCADRADO * 2;

    //REFERENCIA UI
    private VentanaPrincipal ventanaPrincipal;

    //REFERENCIA DIFICULTAD
    //CUANDO MENOS VALOR + RAPIDO EL JUEGO.
    private int dificultadInicioJuego;
    private final int DIFICULTAD_MIN = 1000;
    private final int DIFICULTAD_NIVEL = 40;
    private final int DIFICULTAD_MAX = 200;
    private final int LINEAS_NEXT_LEVEL = 5;

    //Fichas
    private Ficha fichaActual;
    private Ficha fichaFantasma;
    private Ficha fichaSiguiente;
    private int contador = 0;

    private List<Cadrado> cadradosChan = new ArrayList();
    private List<Cadrado> linea = new ArrayList();

    private int level;
    private int numeroLinas = 0;
    private int LinesNextLevel = 0;

    Random random = new Random();
    private boolean gameOver;

    List<Class<? extends Ficha>> listaFichas = Arrays.asList(
            FichaBarra.class,
            FichaCadrada.class,
            FichaL.class,
            FichaLReverse.class,
            FichaT.class,
            FichaZ.class,
            FichaZReverse.class
    );

    public Xogo(VentanaPrincipal ventana) {

        ventanaPrincipal = ventana;

        this.level = ventanaPrincipal.getLevelJSlider().getValue();
        gameOver = false;

    }

    public void iniciarXogo() {
        desordenarArray(listaFichas);
        fichaSiguiente = xenerarNovaFicha(ventanaPrincipal.getPanelNextFigure());
        nextFichaToActualFicha(ventanaPrincipal.getPanelXogo());
        pintarFicha(fichaSiguiente);
        pintarFicha(fichaActual);
        pintarFichaFanstama(fichaFantasma);

        actualizarFichaFantasma();

    }

    // <editor-fold defaultstate="collapsed" desc="GettersAndSetters">      
    public boolean isGameOver() {
        return gameOver;
    }

    public int getNumeroLinas() {
        return numeroLinas;
    }

    public int getLinesNextLevel() {
        return LinesNextLevel;
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
    // </editor-fold>  

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
            actualizarFichaFantasma();
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
            actualizarFichaFantasma();
        }
    }

    public void rotarFicha() {
        if (fichaActual.rotar()) {
            actualizarFichaFantasma();
        }
    }

    public void moverFichaAbaixo() {

        if (!chocaFichaCoChan(fichaActual)) {
            fichaActual.moverAbaixo();
        } else {
            engadeFichaBorraLinasCompletasXeneraNovaFicha();
        }
    }

    private void actualizarFichaFantasma() {

        for (int i = 0; i < fichaActual.cadrados.size(); i++) {
            fichaFantasma.cadrados.get(i).actualizarCoordenada(fichaActual.cadrados.get(i).getX(), fichaActual.cadrados.get(i).getY());
        }

        moverFichaAbaixoAtaChan(fichaFantasma);

    }

    public void moverFichaAbaixoAtaChan(Ficha ficha) {

        while (!chocaFichaCoChan(ficha)) {
            ficha.moverAbaixo();
        }

    }

    private Ficha xenerarNovaFicha(JPanel panel) {
        Ficha ficha = null;
        Class<? extends Ficha> claseFichaSeleccionada;

        claseFichaSeleccionada = listaFichas.get(contador);
        contador++;
        try {
            Constructor<? extends Ficha> constructor = claseFichaSeleccionada.getDeclaredConstructor(Xogo.class, JPanel.class);
            ficha = constructor.newInstance(this, panel);

        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | IllegalArgumentException e) {
            ventanaPrincipal.getLogExcepcion().anadirExcepcionLog(e);
        }
        if (contador >= listaFichas.size()) {
            contador = 0;
            desordenarArray(listaFichas);
        }
        return ficha;
    }

    private void desordenarArray(List array) {
        Collections.shuffle(array);
    }

    public void pintarFicha(Ficha ficha) {
        Iterator<Cadrado> actual = ficha.cadrados.iterator();
        while (actual.hasNext()) {
            Cadrado cactual = actual.next();
            ventanaPrincipal.pintarCadrado(cactual.getLblCadrado(), ficha.panel);
        }
    }

    public void pintarFichaFanstama(Ficha ficha) {

        Iterator<Cadrado> actual = ficha.cadrados.iterator();
        while (actual.hasNext()) {
            Cadrado cactual = actual.next();
            ventanaPrincipal.pintarCadradoFantasma(cactual.getLblCadrado(), ficha.panel);
        }
    }

    public void engadirFichaAoChan() {

        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();
        while (actual.hasNext()) {
            Cadrado c = actual.next();
            cadradosChan.add(c);

        }

    }

    public boolean chocaFichaCoChan(Ficha ficha) {

        boolean choca = false;

        Iterator<Cadrado> actual = ficha.cadrados.iterator();

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
        if (x > MAXX - LADOCADRADO || x < 0 || y > MAXY - LADOCADRADO || y < -LADOCADRADO) {
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
        int lineaCompleta = 10;
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
                ventanaPrincipal.AumentarPuntuacionPendiente(ventanaPrincipal.getSCORELINEA());
                LinesNextLevel++;

                aumentarNivel(numeroLinas, ventanaPrincipal.getTimer().getDelay());

                actualizarBloques();
            }

            linea.removeAll(linea);
        }

    }

    public void borrarLinas() {

        Iterator<Cadrado> blinea = linea.iterator();
        while (blinea.hasNext()) {
            Cadrado este = blinea.next();

            ventanaPrincipal.borrarCadrado(este.getLblCadrado());
            cadradosChan.removeAll(linea);

        }
        ventanaPrincipal.getSonido().ReproducirSonidoLinea();

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

    private void nextFichaToActualFicha(JPanel panel) {

        Class<? extends Ficha> claseFicha = fichaSiguiente.getClass();

        try {

            Constructor<? extends Ficha> constructor = claseFicha.getDeclaredConstructor(Xogo.class, JPanel.class);
            fichaActual = constructor.newInstance(this, panel);
            fichaFantasma = constructor.newInstance(this, panel);

        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {

            ventanaPrincipal.getLogExcepcion().anadirExcepcionLog(e);
        }

        fichaSiguiente = xenerarNovaFicha(ventanaPrincipal.getPanelNextFigure());
        ventanaPrincipal.getPanelNextFigure().removeAll();
        pintarFicha(fichaSiguiente);

        actualizarFichaFantasma();
    }

    private void engadeFichaBorraLinasCompletasXeneraNovaFicha() {

        if (!comprobarPerder()) {
            engadirFichaAoChan();
            ventanaPrincipal.getSonido().ReproducirSuelo();
            ventanaPrincipal.AumentarPuntuacionPendiente(ventanaPrincipal.getSCORECHOCACHAN());
            borrarLinasCompletas();
            borrarCadradosFantasma();
            nextFichaToActualFicha(ventanaPrincipal.getPanelXogo());
            pintarFicha(fichaActual);
            pintarFichaFanstama(fichaFantasma);

        } else {
            ventanaPrincipal.mostrarFinDoXogo();
            gameOver = true;
        }

    }

    private void borrarCadradosFantasma() {

        for (Cadrado cadrado : fichaFantasma.getCadrados()) {
            ventanaPrincipal.borrarCadrado(cadrado.getLblCadrado());
        }

    }

    public boolean aumentarNivel(int lineas, int delayActual) {
        boolean aumentaNivel = false;
        if (lineas % LINEAS_NEXT_LEVEL == 0 && delayActual > DIFICULTAD_MAX) {
            ventanaPrincipal.getTimer().setDelay(delayActual - DIFICULTAD_NIVEL);
            level++;
            ventanaPrincipal.AumentarPuntuacionPendiente(ventanaPrincipal.getSCORECHOCACHAN());
            LinesNextLevel = 0;
            aumentaNivel = true;
        }
        return aumentaNivel;
    }

    private int randomNumber(int min, int max) {

        return random.nextInt(min, max);
    }

    public void anadirCuadradosAleatorios() {

        ArrayList<Integer> posiciones = new ArrayList<>();
        int minimoCadrados = 1;
        Iterator<Cadrado> suelo = cadradosChan.iterator();
        while (suelo.hasNext()) {
            Cadrado siguiente = suelo.next();
            siguiente.actualizarCoordenada(siguiente.getX(), siguiente.getY() - LADOCADRADO);
        }

        //Elige la posicion donde incluira un cuadrado y el numero de cuadrados que incluira 
        for (int i = 0; i < randomNumber(minimoCadrados, (MAXX - LADOCADRADO) / LADOCADRADO); i++) {
            int posicionAleatoria = randomNumber(0, (MAXX - LADOCADRADO) / LADOCADRADO);

            //Si la posicion escogida ya esta ocupada
            while (posiciones.contains(posicionAleatoria)) {
                posicionAleatoria = randomNumber(minimoCadrados, (MAXX - LADOCADRADO) / LADOCADRADO);

            }
            //Añade el cuadrado
            Cadrado cadradoPenalty = new Cadrado(posicionAleatoria * LADOCADRADO, MAXY - LADOCADRADO, gray);
            cadradosChan.add(cadradoPenalty);
            ventanaPrincipal.pintarCadrado(cadradoPenalty.getLblCadrado(), ventanaPrincipal.getPanelXogo());
            posiciones.add(posicionAleatoria);

        }
    }
}

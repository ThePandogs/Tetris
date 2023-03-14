/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Iterator;
import iu.VentanaPrincipal;
import static java.awt.Color.yellow;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public final class Xogo {

    private final int LADOCADRADO = 50;
    private final int MAXY = 850;
    private final int MAXX = 450;
    private int numeroLinas = 0;
    private VentanaPrincipal ventanaPricipal;
    private Ficha fichaActual;
    private List<Cadrado> cadradosChan = new ArrayList();
    private List<Cadrado> linea = new ArrayList();
private Ficha fichaSiguiente;
    private int level = 0;
    private int LinasNextLevel = 0;

    public Xogo(VentanaPrincipal ventana) {
        ventanaPricipal = ventana;
        fichaSiguiente=xenerarNovaFicha();
        fichaActual=xenerarNovaFicha();
        pintarFichaActual();
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
        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();
        //Comprobar posicion siguiente de cada cuadrado actual
        while (actual.hasNext()) {
            Cadrado ca = actual.next();
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
        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();
        //Comprobar posicion siguiente de cada cuadrado actual
        while (actual.hasNext()) {
            Cadrado ca = actual.next();
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

    public Ficha xenerarNovaFicha() {
Ficha obj = null;
        switch (numeroRandom(30)) {

            case 1, 5, 6, 13,30 -> {

                obj = new FichaBarra(this);

            }

            case 2, 9, 10, 14 -> {

                obj = new FichaT(this);

            }
            case 3, 7, 8,28,29 -> {

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
private void pintarFichaActual(){
 Iterator<Cadrado> actual = fichaActual.cadrados.iterator();
        while (actual.hasNext()) {
            Cadrado cactual = actual.next();
            ventanaPricipal.pintarCadrado(cactual.getLblCadrado());
   System.out.println("Fichaa: "+fichaActual.id + "fichas: "+fichaSiguiente.id);
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

        boolean flag = false;

        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();

        while (actual.hasNext()) {
            Cadrado cactual = actual.next();

            if (!ePosicionValida(cactual.getX(), cactual.getY() + LADOCADRADO)) {
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
        Iterator<Cadrado> chan = cadradosChan.iterator();
        while (chan.hasNext()) {
            Cadrado cchan = chan.next();
            if ((cchan.getX() == x && cchan.getY() == y)) {
                tag = false;
            }

        }

        return tag;
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
        try {
            Iterator<Cadrado> blinea = linea.iterator();
            while (blinea.hasNext()) {
                Cadrado este = blinea.next();
                
                ventanaPricipal.borrarCadrado(este.getLblCadrado());
                cadradosChan.removeAll(linea);
                
            }
            ventanaPricipal.ReproducirSonido();
        } catch (IOException ex) {
            Logger.getLogger(Xogo.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public boolean comprobarPerder() {
        boolean tag = false;
        Iterator<Cadrado> actual = fichaActual.cadrados.iterator();
        while (actual.hasNext()) {
            Cadrado cactual = actual.next();
            if (cactual.getY() < 100) {

                ventanaPricipal.mostrarFinDoXogo();
                
                tag = true;
            }
        }
        return tag;

    }
private void fichaStoFichaA(){
fichaActual=fichaSiguiente;
while(fichaSiguiente.id==fichaActual.id){
fichaSiguiente=xenerarNovaFicha();
}}
    private void engadeFichaBorraLinasCompletasXeneraNovaFicha() {
        try {
            engadirFichaAoChan();
            ventanaPricipal.ReproducirSuelo();
            if (!comprobarPerder()) {
                borrarLinasCompletas();
                fichaStoFichaA();
                pintarFichaActual();
            }
        } catch (IOException ex) {
            Logger.getLogger(Xogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean aumentarNivel(int lineas, int delay) {
        boolean tag = false;
        if (lineas % 5 == 0 && delay > 100) {
            ventanaPricipal.getTimer().setDelay(delay - 100);
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

   
     
    
    
    
    
    
    
    
    
    
    
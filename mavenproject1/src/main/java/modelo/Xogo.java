/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import iu.VentanaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author a22danielas
 */
public class Xogo {

    public int getLADOCADRADO() {
        return LADOCADRADO;
    }

    private final int LADOCADRADO = 50;
    private final int MAXY = 900;
    private final int MAXX = 500;
    private int numerolineas = 0;
    public VentanaPrincipal ventanaPricipal;
    Ficha fichaActual;
    private ArrayList<Cadrado> cadradosChan;

    public int getMAXY() {
        return MAXY;
    }

    public int getMAXX() {
        return MAXX;
    }

    public Xogo(VentanaPrincipal ventana) {
        ventanaPricipal = ventana;
        cadradosChan = new ArrayList<>();
    }

    public int getNumerolineas() {
        return numerolineas;
    }

    public void moverEsquerda() {

        boolean posible = true;

        for (int i = 0; i < fichaActual.getCadrados().size(); i++) {
            if (!ePosicionValida(fichaActual.getCadrados().get(i).getX() - LADOCADRADO, fichaActual.getCadrados().get(i).getY())) {
                posible = false;
            }
        }

        if (posible) {
            fichaActual.moverEsquerda();
        }

    }

    public void moverDereita() {
        boolean posible = true;

        for (int i = 0; i < fichaActual.getCadrados().size(); i++) {
            if (!ePosicionValida(fichaActual.getCadrados().get(i).getX() + LADOCADRADO, fichaActual.getCadrados().get(i).getY())) {
                posible = false;
            }
        }

        if (posible) {
            fichaActual.moverDereita();
        }

    }

    public void moverFichaAbaixo() {
        boolean posible = true;

        for (int i = 0; i < fichaActual.getCadrados().size(); i++) {
            if (!ePosicionValida(fichaActual.getCadrados().get(i).getX(), fichaActual.getCadrados().get(i).getY() + LADOCADRADO)) {
                posible = false;
            }
        }

        if (posible) {

            fichaActual.moverAbaixo();
            if (chocaFichaCoChan()) {
                borrarLinaCompletas();
                xenerarNovaFicha();

            }

        }
    }

    public void xenerarNovaFicha() {

        switch ((int) (Math.random() * 4 + 1)) {

            case 1 ->
                fichaActual = new FichaBarra(this);
            case 2 ->
                fichaActual = new FichaCadrada(this);
            case 3 ->
                fichaActual = new FichaT(this);
            case 4 ->
                fichaActual = new FichaL(this);
        }

        for (int i = 0; i < fichaActual.getCadrados().size(); i++) {

            ventanaPricipal.pintarCadrado(fichaActual.getCadrados().get(i).getLblCadrado());
        }

    }

    public void rotarFicha() {

        fichaActual.rotar();

    }

    public boolean ePosicionValida(int x, int y) {
        boolean valido = false;
        if (x < MAXX && x >= 0 && y < MAXY + LADOCADRADO && y >= 0) {
            valido = true;
        }
        for (int i = 0; i < cadradosChan.size(); i++) {
            if (cadradosChan.get(i).getX() == x && cadradosChan.get(i).getY() + LADOCADRADO == y) {
                valido = false;
            }
        }

        return valido;
    }

    public boolean chocaFichaCoChan() {
        boolean choca = false;

        for (int i = 0; i < fichaActual.getCadrados().size(); i++) {
            if (fichaActual.getCadrados().get(i).getY() == MAXY - LADOCADRADO || !ePosicionValida(fichaActual.getCadrados().get(i).getX(), fichaActual.getCadrados().get(i).getY() + LADOCADRADO * 2)) {
                choca = true;
            }
        }

        if (choca) {
            engadirFichaAoChan();

        }

        return choca;
    }

    public void engadirFichaAoChan() {

        cadradosChan.addAll(fichaActual.getCadrados());

    }

    public void borrarLinaCompletas() {

        int filas = MAXY - LADOCADRADO;

        while (filas > 100) {
            int contador = 0;
            int j = 0;
            System.out.println(cadradosChan.size());
            while (j < cadradosChan.size()) {

                if (cadradosChan.get(j).getY() == filas) {
                    contador++;
                }
                j++;
            }

            if (contador == 10) {
                ArrayList<Cadrado> CuadradosParaEliminar = new ArrayList();
                for (int i = 0; i < cadradosChan.size(); i++) {

                    if (cadradosChan.get(i).getY() == filas) {
                        ventanaPricipal.borrarCadrado(cadradosChan.get(i).getLblCadrado());
                        CuadradosParaEliminar.add(cadradosChan.get(i));

                    }
                }
                cadradosChan.removeAll(CuadradosParaEliminar);
                CuadradosParaEliminar.removeAll(CuadradosParaEliminar);

                for (Cadrado bajarLineasSuperiores : cadradosChan) {
                    if (bajarLineasSuperiores.getY() < filas) {
                        bajarLineasSuperiores.setCoordenadas(bajarLineasSuperiores.getX(), bajarLineasSuperiores.getY() + LADOCADRADO);
                    }
                }
            }
            filas -= LADOCADRADO;
            contador = 0;
        }
    }

}

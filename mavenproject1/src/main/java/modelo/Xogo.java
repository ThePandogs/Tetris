/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Iterator;
import javax.swing.JLabel;
import iu.VentanaPrincipal;

/**
 *
 * @author a22danielas
 */
public class Xogo {

    private final int LADOCADRADO = 50;
    private final int MAXY = 900;
    private final int MAXX = 500;
    public int numerolineas = 0;
    public VentanaPrincipal ventanaPricipal;
    FichaBarra fichaActual;

    public Xogo(VentanaPrincipal ventana) {
        ventanaPricipal = ventana;
    }

    public int getNumerolineas() {
        return numerolineas;
    }

    public void setNumerolineas(int numerolineas) {
        this.numerolineas = numerolineas;
    }

    public void moverEsquerda() {
        for (Cadrado cadrado : fichaActual.getCadrados()) {
            cadrado.setX(cadrado.getX() - LADOCADRADO);
        }
    }

    public void moverDereita() {
        for (Cadrado cadrado : fichaActual.getCadrados()) {
            cadrado.setX(cadrado.getX() + LADOCADRADO);
        }
    }

    public void moverFichaAbaixo() {
        for (Cadrado cadrado : fichaActual.getCadrados()) {
            cadrado.setY(cadrado.getY() + LADOCADRADO);
        }
    }

    public void xerarNovaFicha() {

        fichaActual = new FichaBarra();
        for (int i = 0; i < fichaActual.cadrados.size(); i++) {
            System.out.println(fichaActual.cadrados.get(i).cor);

            ventanaPricipal.pintarCadrado(fichaActual.cadrados.get(i).getLblCadrado());

        }

    }

    public void rotarFicha() {
//
//        switch (fichaactual.id) {
//
//            case 1:
//                //Rotacion de Barra
//                int y = fichaactual.getCadrados().get(1).lblCadrado.getY();
//                int x = fichaactual.getCadrados().get(1).lblCadrado.getX();
//
//                //Si la ficha esta tumbada 
//                if (fichaactual.getCadrados().get(2).lblCadrado.getX() != fichaactual.getCadrados().get(3).lblCadrado.getX()) {
//                    fichaactual.getCadrados().get(0).lblCadrado.setLocation(x, y - 50);
//                    fichaactual.getCadrados().get(2).lblCadrado.setLocation(x, y + 50);
//                    fichaactual.getCadrados().get(3).lblCadrado.setLocation(x, y + 100);
//                } //Si esta en vertical
//                else {
//                    fichaactual.getCadrados().get(0).lblCadrado.setLocation(x - 50, y);
//                    fichaactual.getCadrados().get(2).lblCadrado.setLocation(x + 50, y);
//                    fichaactual.getCadrados().get(3).lblCadrado.setLocation(x + 100, y);
//                }
//            case 2:
//
//        }

    }

}

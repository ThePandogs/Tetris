/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import iu.VentanaPrincipal;

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

    public int getMAXY() {
        return MAXY;
    }

    public int getMAXX() {
        return MAXX;
    }
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

    }

    public void moverDereita() {
        for (Cadrado cadrado : fichaActual.getCadrados()) {
            cadrado.setX(cadrado.getX() + LADOCADRADO);
        }
    }

    public void moverFichaAbaixo() {

    }

    public void xerarNovaFicha() {

        fichaActual = new FichaBarra();
        for (int i = 0; i < fichaActual.getCadrados().size(); i++) {
            System.out.println(fichaActual.getCadrados().get(i).cor);

            ventanaPricipal.pintarCadrado(fichaActual.getCadrados().get(i).getLblCadrado());

        }

    }

    public void rotarFicha() {
//

    }

}

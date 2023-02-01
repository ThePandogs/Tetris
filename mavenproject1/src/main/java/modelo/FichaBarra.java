/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import modelo.Xogo;
import java.awt.Color;

/**
 *
 * @author a22danielas
 */
public class FichaBarra extends Ficha {

    public Cadrado c = new Cadrado(150, 25, yellow);
    public Cadrado c1 = new Cadrado(200, 25, yellow);
    public Cadrado c2 = new Cadrado(250, 25, yellow);
    public Cadrado c3 = new Cadrado(300, 25, yellow);

    public FichaBarra() {

        cadrados.add(c);
        cadrados.add(c1);
        cadrados.add(c2);
        cadrados.add(c3);

        id = 1;

    }

    public List<Cadrado> getCadrados() {
        return cadrados;
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

        return move;

    }

}

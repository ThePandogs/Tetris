/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author ThePandogs
 *
 */
public abstract class Ficha {

    protected List<Cadrado> cadrados;
    protected int posicion;
    protected Xogo xogo;
    protected JPanel panel;

    public Ficha(Xogo xogo, JPanel panel) {
        cadrados = new ArrayList<>();
        this.xogo = xogo;
        this.panel = panel;

    }

    public List<Cadrado> getCadrados() {
        return cadrados;
    }

    public void setCadrados(List<Cadrado> cadrados) {
        this.cadrados = cadrados;
    }

    public boolean moverDereita() {

        boolean move = false;

        //Ejecutar movimiento
        Iterator<Cadrado> it = cadrados.iterator();

        while (it.hasNext()) {

            Cadrado c = it.next();

            c.actualizarCoordenada(c.getX() + xogo.getLADOCADRADO(), c.getY());

            move = true;
        }
        return move;

    }

    public abstract boolean rotar();

    public boolean moverEsquerda() {
        boolean move = false;

        Iterator<Cadrado> it = xogo.getFichaActual().cadrados.iterator();
        while (it.hasNext()) {
            Cadrado c = it.next();
            c.actualizarCoordenada(c.getX() - xogo.getLADOCADRADO(), c.getY());
            move = true;
        }
        return move;

    }

    public boolean moverAbaixo() {
        boolean move = false;

        Iterator<Cadrado> it = cadrados.iterator();
        while (it.hasNext()) {
            Cadrado c = it.next();
            c.actualizarCoordenada(c.getX(), c.getY() + xogo.getLADOCADRADO());
            move = true;
        }
        return move;

    }

}

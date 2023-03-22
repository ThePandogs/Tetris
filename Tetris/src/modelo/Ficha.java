/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public abstract class Ficha {

    protected List<Cadrado> cadrados;
    protected int posicion ;
    protected Xogo xogo;
    protected int id;

    public Ficha(Xogo x) {
        cadrados = new ArrayList<>();
        xogo = x;

    }

    public List<Cadrado> getCadrados() {
        return cadrados;
    }

    public int getId() {
        return id;
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

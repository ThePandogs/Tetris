/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.red;

/**
 *
 * @author a22danielas
 */
public class FichaT extends Ficha {

    public Cadrado c = new Cadrado(150, 25, red);
    public Cadrado c1 = new Cadrado(150, 75, red);
    public Cadrado c2 = new Cadrado(150, 125, red);
    public Cadrado c3 = new Cadrado(200, 75, red);

    public FichaT(Xogo xogo) {
        super(xogo);
    }

    @Override
    public boolean rotar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Color;

/**
 *
 * @author a22danielas
 */
public class FichaCadrada extends Ficha {

    Cadrado firstCadrado = new Cadrado((xogo.getMAXX() / 2) - xogo.getLADOCADRADO(), 0, Color.BLUE);

    public FichaCadrada(Xogo xogo) {
        super(xogo);

        cadrados.add(firstCadrado);
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY(), Color.BLUE));
        cadrados.add(new Cadrado(firstCadrado.getX(), firstCadrado.getY() + xogo.getLADOCADRADO(), Color.BLUE));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY() + xogo.getLADOCADRADO(), Color.BLUE));
    }

    @Override
    public boolean rotar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

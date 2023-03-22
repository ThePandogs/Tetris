/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.blue;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public class FichaCadrada extends Ficha {

    Cadrado firstCadrado = new Cadrado(xogo.getMAXX() / 2 - xogo.getLADOCADRADO(), 0, blue);

    public FichaCadrada(Xogo x) {
        super(x);
        cadrados.add(firstCadrado);
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY(), blue));
        cadrados.add(new Cadrado(firstCadrado.getX(), firstCadrado.getY() + xogo.getLADOCADRADO(), blue));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY() + xogo.getLADOCADRADO(), blue));
        id = 2;
    }

    @Override

    public boolean rotar() {

        return true;

    }

}

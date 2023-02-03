/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.*;

import java.util.List;

/**
 *
 * @author a22danielas
 */
public class FichaBarra extends Ficha {

    Cadrado mediumCadrado = new Cadrado(xogo.getMAXX() / 2, xogo.getLADOCADRADO(), yellow);

    public FichaBarra(Xogo xogo) {
        super(xogo);
        cadrados.add(mediumCadrado);
        cadrados.add(new Cadrado(mediumCadrado.getX() - xogo.getLADOCADRADO(), mediumCadrado.getY(), yellow));
        cadrados.add(new Cadrado(mediumCadrado.getX() + xogo.getLADOCADRADO(), mediumCadrado.getY(), yellow));
        cadrados.add(new Cadrado(mediumCadrado.getX() - xogo.getLADOCADRADO() * 2, mediumCadrado.getY(), yellow));
    }

    @Override
    public List<Cadrado> getCadrados() {
        return cadrados;
    }


    @Override
    public boolean rotar() {

        boolean move = true;

        return move;

    }

}

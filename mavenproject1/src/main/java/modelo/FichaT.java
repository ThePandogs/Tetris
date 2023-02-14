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
public class FichaT extends Ficha {

    Cadrado firstCadrado = new Cadrado((xogo.getMAXX() / 2) - xogo.getLADOCADRADO() * 2, xogo.getLADOCADRADO(), Color.RED);
    private int posicion;

    public FichaT(Xogo xogo) {
        super(xogo);
        cadrados.add(firstCadrado);
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY(), Color.RED));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO() * 2, firstCadrado.getY(), Color.RED));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY() - xogo.getLADOCADRADO(), Color.RED));
        posicion = 3;
    }

    @Override
    public boolean rotar() {

        switch (posicion) {

            case 0 -> {
                cadrados.get(0).setCoordenadas(cadrados.get(1).getX() - xogo.getLADOCADRADO(), cadrados.get(1).getY());
                cadrados.get(2).setCoordenadas(cadrados.get(1).getX() + xogo.getLADOCADRADO(), cadrados.get(1).getY());
                cadrados.get(3).setCoordenadas(cadrados.get(1).getX(), cadrados.get(1).getY() + xogo.getLADOCADRADO());
                posicion = 1;
            }

            case 1 -> {
                cadrados.get(0).setCoordenadas(cadrados.get(1).getX(), cadrados.get(1).getY() - xogo.getLADOCADRADO());
                cadrados.get(2).setCoordenadas(cadrados.get(1).getX(), cadrados.get(1).getY() + xogo.getLADOCADRADO());
                cadrados.get(3).setCoordenadas(cadrados.get(1).getX() - xogo.getLADOCADRADO(), cadrados.get(1).getY());
                posicion = 2;
            }

            case 2 -> {
                cadrados.get(0).setCoordenadas(cadrados.get(1).getX() - xogo.getLADOCADRADO(), cadrados.get(1).getY());
                cadrados.get(2).setCoordenadas(cadrados.get(1).getX() + xogo.getLADOCADRADO(), cadrados.get(1).getY());
                cadrados.get(3).setCoordenadas(cadrados.get(1).getX(), cadrados.get(1).getY() - xogo.getLADOCADRADO());
                posicion = 3;
            }

            case 3 -> {
                cadrados.get(0).setCoordenadas(cadrados.get(1).getX(), cadrados.get(1).getY() - xogo.getLADOCADRADO());
                cadrados.get(2).setCoordenadas(cadrados.get(1).getX(), cadrados.get(1).getY() + xogo.getLADOCADRADO());
                cadrados.get(3).setCoordenadas(cadrados.get(1).getX() + xogo.getLADOCADRADO(), cadrados.get(1).getY());
                posicion = 0;
            }
        }

        return true;
    }
}

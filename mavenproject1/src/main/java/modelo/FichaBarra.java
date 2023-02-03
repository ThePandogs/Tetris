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

    Cadrado firstCadrado = new Cadrado((xogo.getMAXX() / 2) - xogo.getLADOCADRADO() * 2, xogo.getLADOCADRADO(), yellow);

    public FichaBarra(Xogo xogo) {
        super(xogo);
        cadrados.add(firstCadrado);
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY(), yellow));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO() * 2, firstCadrado.getY(), yellow));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO() * 3, firstCadrado.getY(), yellow));
    }

    @Override
    public List<Cadrado> getCadrados() {
        return cadrados;
    }

    @Override
    public boolean rotar() {

        cadrados.get(0).setCoordenadas(cadrados.get(1).getX()+ xogo.getLADOCADRADO(), cadrados.get(1).getY()+ xogo.getLADOCADRADO());
        cadrados.get(2).setCoordenadas(cadrados.get(1).getX()+ xogo.getLADOCADRADO(), cadrados.get(1).getY()- xogo.getLADOCADRADO());
        cadrados.get(3).setCoordenadas(cadrados.get(1).getX()+ xogo.getLADOCADRADO()*2, cadrados.get(1).getY()- xogo.getLADOCADRADO());
        
        return true;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.blue;
import javax.swing.JPanel;

/**
 *
 * @author ThePandogs
 *
 */
public class FichaCadrada extends Ficha {

    Cadrado firstCadrado;

    public FichaCadrada(Xogo x, JPanel panel) {
        super(x, null);
        firstCadrado = new Cadrado(panel.getWidth() / 2 - xogo.getLADOCADRADO(), 0, blue);
        cadrados.add(firstCadrado);
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY(), blue));
        cadrados.add(new Cadrado(firstCadrado.getX(), firstCadrado.getY() + xogo.getLADOCADRADO(), blue));
        cadrados.add(new Cadrado(firstCadrado.getX() + xogo.getLADOCADRADO(), firstCadrado.getY() + xogo.getLADOCADRADO(), blue));

    }

 
    @Override
    public boolean rotar() {

        return true;

    }

  

}

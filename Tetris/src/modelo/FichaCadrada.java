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

   

    public FichaCadrada(Xogo x) {
        super(x);
        cadrados.add(new Cadrado( xogo.getLADOCADRADO()*4, 0, blue));
        cadrados.add(new Cadrado( xogo.getLADOCADRADO()*5, 0, blue));
        cadrados.add(new Cadrado( xogo.getLADOCADRADO()*4,  xogo.getLADOCADRADO(), blue));
        cadrados.add(new Cadrado( xogo.getLADOCADRADO()*5,  xogo.getLADOCADRADO(), blue));
        id = 2;
    }

    @Override

    public boolean rotar() {
      
        return true;

    }

}

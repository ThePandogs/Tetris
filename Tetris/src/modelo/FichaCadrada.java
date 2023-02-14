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
    public Cadrado c = new Cadrado(200, 0, blue);
    public Cadrado c1 = new Cadrado(250, 0, blue);
    public Cadrado c2 = new Cadrado(200, 50, blue);
    public Cadrado c3 = new Cadrado(250, 50, blue);
    public FichaCadrada(Xogo x) {
          super(x);
         cadrados.add(c);
          cadrados.add(c1);
            cadrados.add(c2);
              cadrados.add(c3);
    }

    @Override
    public boolean rotar() {
        throw new UnsupportedOperationException("Ficha cuadrada no implementa rotacion."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

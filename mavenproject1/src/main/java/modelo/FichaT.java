/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.red;
import static java.awt.Color.yellow;
import java.util.List;

/**
 *
 * @author a22danielas
 */
public class FichaT extends Ficha {
    public Cadrado c=new Cadrado(150, 25,red);
 public Cadrado c1=new Cadrado(150, 75,red);
public  Cadrado c2=new Cadrado(150, 125,red);
 public Cadrado c3=new Cadrado(200, 75,red);

    public FichaT() {
      
        cadrados.add(c);
          cadrados.add(c1);
            cadrados.add(c2);
              cadrados.add(c3);
        id=2;
        
    }

    public Cadrado getC() {
        return c;
    }

    public Cadrado getC1() {
        return c1;
    }

    public Cadrado getC2() {
        return c2;
    }

    public Cadrado getC3() {
        return c3;
    }

    public List<Cadrado> getCadrados() {
        return cadrados;
    }

    public void setC(Cadrado c) {
        this.c = c;
    }

    public void setC1(Cadrado c1) {
        this.c1 = c1;
    }

    public void setC2(Cadrado c2) {
        this.c2 = c2;
    }

    public void setC3(Cadrado c3) {
        this.c3 = c3;
    }

    public void setCadrados(List<Cadrado> cadrados) {
        this.cadrados = cadrados;
    }

    @Override
    public boolean rotar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

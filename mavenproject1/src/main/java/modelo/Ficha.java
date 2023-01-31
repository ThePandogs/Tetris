/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a22danielas
 */
public abstract class Ficha {
    
  List <Cadrado> cadrados;         
int id;
    public Ficha() {
        cadrados=new ArrayList <>();
       
    }

    public List<Cadrado> getCadrados() {
        return cadrados;
    }

    public void setCadrados(List<Cadrado> cadrados) {
        this.cadrados = cadrados;
    }
    
    public boolean moverDereita() {
        boolean move = false;

        return move;

    }
  
  public abstract boolean rotar();
            
          public boolean moverEsquerda() {
        boolean move = false;

        return move;

    }  
            
            
    
    public boolean moverAbaixo() {
        boolean move = false;

        return move;

    }
    
    
    
          
}

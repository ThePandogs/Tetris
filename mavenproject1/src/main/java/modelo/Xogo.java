/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Color;
import static java.awt.Color.yellow;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import iu.VentanaPrincipal;

/**
 *
 * @author a22danielas
 */
public class Xogo {

    public int ladocadrado = 50;
    public int maxY = 825;
    public int maxX = 500;
    public boolean pausa = false;
    public int numerolineas = 0;
    public Ficha fichaactual = new FichaBarra();
    public VentanaPrincipal v;

    public Xogo() {

    }

    public int getLadocadrado() {
        return ladocadrado;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getMaxX() {
        return maxX;
    }

    public boolean isPausa() {
        return pausa;
    }

    public int getNumerolineas() {
        return numerolineas;
    }

    public Ficha getFichaactual() {
        return fichaactual;
    }

    public void setLadocadrado(int ladocadrado) {
        this.ladocadrado = ladocadrado;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }

    public void setNumerolineas(int numerolineas) {
        this.numerolineas = numerolineas;
    }

    public void setFichaactual(Ficha fichaactual) {
        this.fichaactual = fichaactual;
    }

    public void moverFichaAbaixo() {
//Ejemplo de mover hacia abajo automaticamente
        //Hacemos un timer con una tarea que cada cierto tiempo sume a la ficha valor en y para bajar constantemente
//        TimerTask speedGame;
//
//        Timer timer = new Timer();
//
//        speedGame = new TimerTask() {
//            @Override
//            public void run() {
//                boolean flag=false;
//                
               
//                
//                  Iterator<Cadrado> itera = fichaactual.getCadrados().iterator();
//                while (itera.hasNext() ) {
//                    JLabel ca = itera.next().getLblCadrado();
//                    if(ca.getY()>=825){
//                     flag=true;
//                    
//                    }
//
//                }
//                
//                
//                
//                
//                Iterator<Cadrado> iter = fichaactual.getCadrados().iterator();
//                while (iter.hasNext() && flag==false) {
//                    JLabel c = iter.next().getLblCadrado();
//                    int y = c.getY() + 50;
//                    c.setLocation(c.getX(), y);
//
//                }
//            }
//        };
//        timer.schedule(speedGame, 1500, 2000);










    }
   

    public void rotarFicha() {
        
        switch (fichaactual.id){
        
            case 1:
        //Rotacion de Barra
        int y = fichaactual.getCadrados().get(1).lblCadrado.getY();
        int x = fichaactual.getCadrados().get(1).lblCadrado.getX();

        //Si la ficha esta tumbada 
        if (fichaactual.getCadrados().get(2).lblCadrado.getX() != fichaactual.getCadrados().get(3).lblCadrado.getX()) {
            fichaactual.getCadrados().get(0).lblCadrado.setLocation(x, y - 50);
            fichaactual.getCadrados().get(2).lblCadrado.setLocation(x, y + 50);
            fichaactual.getCadrados().get(3).lblCadrado.setLocation(x, y + 100);
        } //Si esta en vertical
        else {
            fichaactual.getCadrados().get(0).lblCadrado.setLocation(x - 50, y);
            fichaactual.getCadrados().get(2).lblCadrado.setLocation(x + 50, y);
            fichaactual.getCadrados().get(3).lblCadrado.setLocation(x + 100, y);
        }
            case 2:
        
        
        
        }
        
        
 

    }

    public void moverEsquerda() {
//Movimiento ficha actual hacia la izqueirda
       

        Iterator<Cadrado> iter = fichaactual.getCadrados().iterator();
        while (iter.hasNext()) {
            JLabel c = iter.next().getLblCadrado();
            int x = c.getX() - 50;
            c.setLocation(x, c.getY());

        }

    }
 public void moverDereita() {
//Movimiento ficha actual hacia la derecha
       

        Iterator<Cadrado> iter = fichaactual.getCadrados().iterator();
        while (iter.hasNext()) {
            JLabel c = iter.next().getLblCadrado();
            int x = c.getX() +50;
            c.setLocation(x, c.getY());
            

        }System.out.println(fichaactual.cadrados.get(3).lblCadrado.getY());

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author a22danielas
 */
public class Cadrado {

    

    int x;
    int y;
    public Color cor;
    public JLabel lblCadrado = new JLabel();

    public Cadrado(int x, int y, Color cor) {
        this.x = x;
        this.y = y;

        lblCadrado.setBackground(cor);
        lblCadrado.setOpaque(true);
        lblCadrado.setBounds(x, y, 50, 50);
        lblCadrado.setVisible(true);
        lblCadrado.updateUI();

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getCorR() {
        return cor;
    }

    public JLabel getLblCadrado() {
        return lblCadrado;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCorR(Color corR) {
        this.cor = corR;
    }

    public void setLblCadrado(JLabel lblCadrado) {
        this.lblCadrado = lblCadrado;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public String getCoordenadas() {

        String cor = "x= " + x + " : " + "y=" + y;

        return cor;

    }
    public void  actualizarCoordenada(int x,int y){
    
    this.x=x;
    this.y=y;
    lblCadrado.setLocation(x, y);
    
    
    
    }

}

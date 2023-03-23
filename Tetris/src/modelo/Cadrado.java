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
 * @author a14carlosfd
 *
 */
public class Cadrado {

    private int x;
    private int y;
    private Color cor;
    private JLabel lblCadrado = new JLabel();

    public Cadrado(int x, int y, Color cor) {
        this.x = x;
        this.y = y;

        lblCadrado.setBackground(cor);
        lblCadrado.setLocation(x, y);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getCorR() {
        return getCor();
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
        this.setCor(corR);
    }

    public void setLblCadrado(JLabel lblCadrado) {
        this.lblCadrado = lblCadrado;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public String getCoordenadas() {

        String cordenadas = "x= " + getX() + " : " + "y=" + getY();

        return cordenadas;

    }

    public void actualizarCoordenada(int x, int y) {

        this.setX(x);
        this.setY(y);
        getLblCadrado().setLocation(x, y);

    }

    /**
     * @return the cor
     */
    public Color getCor() {
        return cor;
    }
}

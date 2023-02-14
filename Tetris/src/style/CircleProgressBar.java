/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package style;

import java.awt.Color;
import javax.swing.JProgressBar;

/**
 *
 * @author a14carlosfd
 * 
 */
public class CircleProgressBar extends JProgressBar {

    public CircleProgressBar() {
        setOpaque(false);
        setBackground(new Color(220, 220, 220));
        setForeground(new Color(97, 97, 97));
        setStringPainted(true);
        setUI(new ProgressCircleUI(this));
    }

}
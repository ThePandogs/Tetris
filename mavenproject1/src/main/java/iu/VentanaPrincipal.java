/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iu;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author a14carlosfd
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        panelXogo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBackgroundGame = new javax.swing.JLabel();
        panelScore = new javax.swing.JPanel();
        lblScore = new javax.swing.JLabel();
        panelNextFigure = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelLevel = new javax.swing.JPanel();
        lblLevel = new javax.swing.JLabel();
        lbllinesNextLevel = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tglPause = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        panelLine = new javax.swing.JPanel();
        lblLine = new javax.swing.JLabel();
        panelTime = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 950));
        setMinimumSize(new java.awt.Dimension(1100, 950));
        setPreferredSize(new java.awt.Dimension(1100, 950));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 950));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(102, 102, 102));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelXogo.setBackground(new java.awt.Color(204, 204, 255));
        panelXogo.setName(""); // NOI18N
        panelXogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Documents\\NetBeansProjects\\Tetris\\mavenproject1\\src\\main\\images\\blocks\\morado.png")); // NOI18N
        jLabel3.setText("jLabel3");
        panelXogo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 50, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Documents\\NetBeansProjects\\Tetris\\mavenproject1\\src\\main\\images\\blocks\\morado.png")); // NOI18N
        jLabel4.setText("jLabel3");
        panelXogo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 50, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Documents\\NetBeansProjects\\Tetris\\mavenproject1\\src\\main\\images\\blocks\\morado.png")); // NOI18N
        jLabel5.setText("jLabel3");
        panelXogo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 50, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Documents\\NetBeansProjects\\Tetris\\mavenproject1\\src\\main\\images\\blocks\\morado.png")); // NOI18N
        jLabel7.setText("jLabel3");
        panelXogo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 50, 50));

        lblBackgroundGame.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Documents\\NetBeansProjects\\Tetris\\mavenproject1\\src\\main\\images\\backgroundGameSafeZone.png")); // NOI18N
        panelXogo.add(lblBackgroundGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 850));

        mainPanel.add(panelXogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 500, 850));

        panelScore.setMinimumSize(new java.awt.Dimension(53, 53));
        panelScore.setPreferredSize(new java.awt.Dimension(110, 110));
        panelScore.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblScore.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblScore.setText("Score");
        panelScore.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 5, -1, -1));

        mainPanel.add(panelScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 130));

        panelNextFigure.setMaximumSize(new java.awt.Dimension(220, 260));
        panelNextFigure.setMinimumSize(new java.awt.Dimension(220, 260));
        panelNextFigure.setPreferredSize(new java.awt.Dimension(220, 260));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Next");
        panelNextFigure.add(jLabel2);

        mainPanel.add(panelNextFigure, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 220, 280));

        panelLevel.setPreferredSize(new java.awt.Dimension(220, 220));
        panelLevel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLevel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLevel.setText("Level");
        panelLevel.add(lblLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        lbllinesNextLevel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbllinesNextLevel.setText("Lines for next level:");
        panelLevel.add(lbllinesNextLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        mainPanel.add(panelLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 220, 240));

        panelMenu.setMaximumSize(new java.awt.Dimension(220, 260));
        panelMenu.setMinimumSize(new java.awt.Dimension(220, 260));
        panelMenu.setPreferredSize(new java.awt.Dimension(220, 260));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Menu");
        panelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 20, 91, 41));

        tglPause.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tglPause.setText("Pause");
        tglPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglPauseActionPerformed(evt);
            }
        });
        panelMenu.add(tglPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 90, 150, 40));

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExit.setText("Exit");
        panelMenu.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 190, 150, 40));

        btnRestart.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRestart.setText("Restart");
        panelMenu.add(btnRestart, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 140, 150, 40));

        mainPanel.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 640, 220, 240));

        lblLine.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLine.setText("Lines");
        panelLine.add(lblLine);

        mainPanel.add(panelLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 220, 130));

        panelTime.setMaximumSize(new java.awt.Dimension(220, 130));
        panelTime.setMinimumSize(new java.awt.Dimension(220, 130));
        panelTime.setPreferredSize(new java.awt.Dimension(220, 130));

        lblTime.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTime.setText("Time");
        panelTime.add(lblTime);

        mainPanel.add(panelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 220, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Desktop\\4249454.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        mainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 900));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tglPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglPauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglPauseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRestart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblBackgroundGame;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblLine;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lbllinesNextLevel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelLevel;
    private javax.swing.JPanel panelLine;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNextFigure;
    private javax.swing.JPanel panelScore;
    private javax.swing.JPanel panelTime;
    private javax.swing.JPanel panelXogo;
    private javax.swing.JToggleButton tglPause;
    // End of variables declaration//GEN-END:variables
}

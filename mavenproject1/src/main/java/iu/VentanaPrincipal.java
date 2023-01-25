/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iu;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author a14carlosfd
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    int time = 0;
    int score = 0;

    public VentanaPrincipal() {
        initComponents();
        startSpeedGame(600);
        startChrono();
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
        bloque3 = new javax.swing.JLabel();
        bloque2 = new javax.swing.JLabel();
        bloque1 = new javax.swing.JLabel();
        bloque4 = new javax.swing.JLabel();
        lblBackgroundGame = new javax.swing.JLabel();
        panelScore = new javax.swing.JPanel();
        lblScoreTitle = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        panelNextFigure = new javax.swing.JPanel();
        lblNextTitle = new javax.swing.JLabel();
        panelLevel = new javax.swing.JPanel();
        lblLevelTitle = new javax.swing.JLabel();
        lbllinesNextLevelTitle = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        lblMenuTitle = new javax.swing.JLabel();
        tglPause = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        panelLine = new javax.swing.JPanel();
        lblLine = new javax.swing.JLabel();
        panelTime = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblTimeTitle = new javax.swing.JLabel();
        backgroundProgram = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 950));
        setMinimumSize(new java.awt.Dimension(1100, 950));
        setPreferredSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 950));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(102, 102, 102));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelXogo.setBackground(new java.awt.Color(204, 204, 255));
        panelXogo.setMinimumSize(new java.awt.Dimension(500, 900));
        panelXogo.setName(""); // NOI18N
        panelXogo.setLayout(null);

        bloque3.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Documents\\NetBeansProjects\\Tetris\\mavenproject1\\src\\main\\images\\blocks\\morado.png")); // NOI18N
        bloque3.setText("jLabel3");
        panelXogo.add(bloque3);
        bloque3.setBounds(150, 300, 50, 50);

        bloque2.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Documents\\NetBeansProjects\\Tetris\\mavenproject1\\src\\main\\images\\blocks\\morado.png")); // NOI18N
        bloque2.setText("jLabel3");
        panelXogo.add(bloque2);
        bloque2.setBounds(200, 300, 50, 50);

        bloque1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Documents\\NetBeansProjects\\Tetris\\mavenproject1\\src\\main\\images\\blocks\\morado.png")); // NOI18N
        bloque1.setText("jLabel3");
        panelXogo.add(bloque1);
        bloque1.setBounds(200, 250, 50, 50);

        bloque4.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Documents\\NetBeansProjects\\Tetris\\mavenproject1\\src\\main\\images\\blocks\\morado.png")); // NOI18N
        bloque4.setText("jLabel3");
        panelXogo.add(bloque4);
        bloque4.setBounds(100, 300, 50, 50);

        lblBackgroundGame.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Documents\\NetBeansProjects\\Tetris\\mavenproject1\\src\\main\\images\\backgroundsGame\\10x18backgroundGameSafeZone.png")); // NOI18N
        lblBackgroundGame.setMinimumSize(new java.awt.Dimension(500, 900));
        lblBackgroundGame.setPreferredSize(new java.awt.Dimension(500, 900));
        panelXogo.add(lblBackgroundGame);
        lblBackgroundGame.setBounds(0, 0, 500, 900);

        mainPanel.add(panelXogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 500, 900));

        panelScore.setMinimumSize(new java.awt.Dimension(53, 53));
        panelScore.setPreferredSize(new java.awt.Dimension(110, 110));
        panelScore.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblScoreTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblScoreTitle.setText("Score");
        panelScore.add(lblScoreTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 5, -1, -1));

        lblScore.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScore.setText("0");
        panelScore.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 70, 180, -1));

        mainPanel.add(panelScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 130));

        panelNextFigure.setMaximumSize(new java.awt.Dimension(220, 260));
        panelNextFigure.setMinimumSize(new java.awt.Dimension(220, 260));
        panelNextFigure.setPreferredSize(new java.awt.Dimension(220, 260));

        lblNextTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblNextTitle.setText("Next");
        panelNextFigure.add(lblNextTitle);

        mainPanel.add(panelNextFigure, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 220, 280));

        panelLevel.setPreferredSize(new java.awt.Dimension(220, 220));
        panelLevel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLevelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLevelTitle.setText("Level");
        panelLevel.add(lblLevelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        lbllinesNextLevelTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbllinesNextLevelTitle.setText("Lines for next level:");
        panelLevel.add(lbllinesNextLevelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        mainPanel.add(panelLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 220, 240));

        panelMenu.setMaximumSize(new java.awt.Dimension(220, 260));
        panelMenu.setMinimumSize(new java.awt.Dimension(220, 260));
        panelMenu.setPreferredSize(new java.awt.Dimension(220, 260));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblMenuTitle.setText("Menu");
        panelMenu.add(lblMenuTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 20, 91, 41));

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
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        panelMenu.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 190, 150, 40));

        btnRestart.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRestart.setText("Restart");
        panelMenu.add(btnRestart, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 140, 150, 40));

        mainPanel.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 690, 220, 240));

        lblLine.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLine.setText("Lines");
        panelLine.add(lblLine);

        mainPanel.add(panelLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 220, 130));

        panelTime.setMaximumSize(new java.awt.Dimension(220, 130));
        panelTime.setMinimumSize(new java.awt.Dimension(220, 130));
        panelTime.setPreferredSize(new java.awt.Dimension(220, 130));
        panelTime.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTime.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("0");
        panelTime.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, -1));

        lblTimeTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTimeTitle.setText("Time");
        panelTime.add(lblTimeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 5, -1, -1));

        mainPanel.add(panelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 220, 130));

        backgroundProgram.setIcon(new javax.swing.ImageIcon("C:\\Users\\fraid\\Desktop\\4249454.jpg")); // NOI18N
        backgroundProgram.setText("jLabel6");
        mainPanel.add(backgroundProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 950));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 950));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tglPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglPauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglPauseActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
    private javax.swing.JLabel backgroundProgram;
    private javax.swing.JLabel bloque1;
    private javax.swing.JLabel bloque2;
    private javax.swing.JLabel bloque3;
    private javax.swing.JLabel bloque4;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRestart;
    private javax.swing.JLabel lblBackgroundGame;
    private javax.swing.JLabel lblLevelTitle;
    private javax.swing.JLabel lblLine;
    private javax.swing.JLabel lblMenuTitle;
    private javax.swing.JLabel lblNextTitle;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblScoreTitle;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeTitle;
    private javax.swing.JLabel lbllinesNextLevelTitle;
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

    private void startSpeedGame(int speed) {

        TimerTask speedGame;

        Timer timer = new Timer();

        speedGame = new TimerTask() {
            @Override
            public void run() {
                score ++;
                testMueveFichas();
                lblScore.setText(String.valueOf(score));
                mainPanel.updateUI();
            }
        };
        timer.schedule(speedGame, 1020, speed);

    }

    private void startChrono() {
        Timer timer = new Timer();
        TimerTask chrono = new TimerTask() {
            @Override
            public void run() {
                lblTime.setText(String.valueOf(time));
                time++;

            }
        };
        timer.schedule(chrono, 1000, 1000);

    }

    private void testMueveFichas() {

        bloque1.setLocation((int) bloque1.getLocation().getX(), (int) bloque1.getLocation().getY() + 50);
        bloque2.setLocation((int) bloque2.getLocation().getX(), (int) bloque2.getLocation().getY() + 50);
        bloque3.setLocation((int) bloque3.getLocation().getX(), (int) bloque3.getLocation().getY() + 50);
        bloque4.setLocation((int) bloque4.getLocation().getX(), (int) bloque4.getLocation().getY() + 50);
    }
}

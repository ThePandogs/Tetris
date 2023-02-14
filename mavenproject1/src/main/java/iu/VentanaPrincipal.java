/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iu;

import java.awt.event.ActionEvent;
import static java.lang.Thread.sleep;
import javax.swing.JLabel;
import javax.swing.Timer;
import modelo.Xogo;

/**
 *
 * @author a14carlosfd
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    private int time = 0;
    private int score = 0;
    private int speed = 900;
    private int speedDefault = 900;
    private Xogo xogo;

    Timer timerCrono;
    Timer timer;
    // Timer timer;
    private boolean pause;

    public VentanaPrincipal() {

        initComponents();
        iniciarPartida();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        extraFrame = new javax.swing.JFrame();
        pausePanel = new javax.swing.JPanel();
        pauseTitle = new javax.swing.JLabel();
        restartPause = new javax.swing.JButton();
        mainMenuPause = new javax.swing.JButton();
        gameOverPanel = new javax.swing.JPanel();
        YouLoseTitle = new javax.swing.JLabel();
        levelTile = new javax.swing.JLabel();
        timeTitle = new javax.swing.JLabel();
        scoreTitle = new javax.swing.JLabel();
        scoreGameOver = new javax.swing.JLabel();
        timeGameOver = new javax.swing.JLabel();
        levelGameOver = new javax.swing.JLabel();
        linesTitle = new javax.swing.JLabel();
        linesGameOver = new javax.swing.JLabel();
        restartGameOver = new javax.swing.JButton();
        mainMenuGameOver = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        panelXogo = new javax.swing.JPanel();
        lblBackgroundGame = new javax.swing.JLabel();
        panelScore = new javax.swing.JPanel();
        lblScoreTitle = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        panelNextFigure = new javax.swing.JPanel();
        lblNextTitle = new javax.swing.JLabel();
        panelLevel = new javax.swing.JPanel();
        lblLevelTitle = new javax.swing.JLabel();
        lbllinesNextLevelTitle = new javax.swing.JLabel();
        panelLine = new javax.swing.JPanel();
        lblLine = new javax.swing.JLabel();
        panelTime = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblTimeTitle = new javax.swing.JLabel();
        tglPause = new javax.swing.JToggleButton();
        backgroundProgram = new javax.swing.JLabel();

        extraFrame.setAlwaysOnTop(true);
        extraFrame.setLocation(new java.awt.Point(0, 0));
        extraFrame.setMaximumSize(new java.awt.Dimension(460, 340));
        extraFrame.setMinimumSize(new java.awt.Dimension(460, 340));
        extraFrame.setUndecorated(true);
        extraFrame.setResizable(false);
        extraFrame.setSize(new java.awt.Dimension(450, 330));
        extraFrame.getContentPane().setLayout(null);
        extraFrame.setLocationRelativeTo(panelXogo);

        pausePanel.setMinimumSize(new java.awt.Dimension(450, 330));
        pausePanel.setLayout(null);
        pausePanel.setVisible(false);

        pauseTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pauseTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pauseTitle.setText("Pause");
        pausePanel.add(pauseTitle);
        pauseTitle.setBounds(130, 80, 200, 48);

        restartPause.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        restartPause.setText("Restart");
        restartPause.setFocusable(false);
        restartPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartPauseActionPerformed(evt);
            }
        });
        pausePanel.add(restartPause);
        restartPause.setBounds(150, 200, 150, 40);

        mainMenuPause.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mainMenuPause.setText("MainMenu");
        mainMenuPause.setFocusable(false);
        pausePanel.add(mainMenuPause);
        mainMenuPause.setBounds(150, 250, 150, 40);

        extraFrame.getContentPane().add(pausePanel);
        pausePanel.setBounds(0, 0, 450, 330);

        gameOverPanel.setMaximumSize(new java.awt.Dimension(450, 330));
        gameOverPanel.setMinimumSize(new java.awt.Dimension(450, 330));
        gameOverPanel.setPreferredSize(new java.awt.Dimension(450, 330));
        gameOverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gameOverPanel.setVisible(false);

        YouLoseTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        YouLoseTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YouLoseTitle.setText("Game Over");
        gameOverPanel.add(YouLoseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 10, 200, -1));

        levelTile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        levelTile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levelTile.setText("Level");
        gameOverPanel.add(levelTile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 59, 30));

        timeTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        timeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeTitle.setText("Time");
        gameOverPanel.add(timeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 59, 30));

        scoreTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        scoreTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreTitle.setText("Score");
        gameOverPanel.add(scoreTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 59, 30));

        scoreGameOver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        scoreGameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreGameOver.setText("0");
        gameOverPanel.add(scoreGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, -1));

        timeGameOver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        timeGameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeGameOver.setText("0");
        gameOverPanel.add(timeGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 60, -1));

        levelGameOver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        levelGameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levelGameOver.setText("0");
        gameOverPanel.add(levelGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 60, -1));

        linesTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        linesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linesTitle.setText("Lines");
        gameOverPanel.add(linesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 59, 30));

        linesGameOver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        linesGameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linesGameOver.setText("0");
        gameOverPanel.add(linesGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 60, -1));

        restartGameOver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        restartGameOver.setText("Restart");
        restartGameOver.setFocusable(false);
        restartGameOver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartGameOverActionPerformed(evt);
            }
        });
        gameOverPanel.add(restartGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 150, 40));

        mainMenuGameOver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mainMenuGameOver.setText("MainMenu");
        mainMenuGameOver.setFocusable(false);
        gameOverPanel.add(mainMenuGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, 40));

        extraFrame.getContentPane().add(gameOverPanel);
        gameOverPanel.setBounds(0, 0, 0, 0);

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
        panelXogo.setFocusable(false);
        panelXogo.setMaximumSize(new java.awt.Dimension(500, 900));
        panelXogo.setMinimumSize(new java.awt.Dimension(500, 900));
        panelXogo.setName(""); // NOI18N
        panelXogo.setOpaque(false);
        panelXogo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelXogoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                panelXogoKeyTyped(evt);
            }
        });
        panelXogo.setLayout(null);
        mainPanel.add(panelXogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 500, 900));

        lblBackgroundGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundsGame/10x18backgroundGameSafeZone.png"))); // NOI18N
        lblBackgroundGame.setText("lblBackgroundGame");
        lblBackgroundGame.setMaximumSize(new java.awt.Dimension(500, 900));
        lblBackgroundGame.setMinimumSize(new java.awt.Dimension(500, 900));
        lblBackgroundGame.setPreferredSize(new java.awt.Dimension(500, 900));
        mainPanel.add(lblBackgroundGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 500, 900));
        lblBackgroundGame.getAccessibleContext().setAccessibleParent(mainPanel);

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

        tglPause.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tglPause.setText("Pause");
        tglPause.setFocusable(false);
        tglPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglPauseActionPerformed(evt);
            }
        });
        mainPanel.add(tglPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 730, 150, 40));

        backgroundProgram.setText("backgroundProgram");
        mainPanel.add(backgroundProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 950));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 950));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tglPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglPauseActionPerformed
        if (!pause) {
            pauseMenu();
        } else {
            resumeMenu();
        }
    }//GEN-LAST:event_tglPauseActionPerformed

    private void panelXogoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelXogoKeyTyped

    }//GEN-LAST:event_panelXogoKeyTyped

    private void panelXogoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelXogoKeyPressed

        switch (evt.getKeyCode()) {
            case 37, 65 ->
                xogo.moverEsquerda();
            case 38, 87 ->
                xogo.rotarFicha();
            case 39, 68 ->
                xogo.moverDereita();
            case 40, 83 -> {
                xogo.moverFichaAbaixo();
                mainPanel.updateUI();
                //reiniciamos timer para que la ficha no baje 2 posiciones seguidas.
                timer.restart();
            }
            default -> {
            }
        }

    }//GEN-LAST:event_panelXogoKeyPressed

    public Timer getTimer() {
        return timer;
    }

    private void restartGameOverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartGameOverActionPerformed
        reiniciarPartida();
    }//GEN-LAST:event_restartGameOverActionPerformed

    private void restartPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartPauseActionPerformed
        reiniciarPartida();
    }//GEN-LAST:event_restartPauseActionPerformed

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
    private javax.swing.JLabel YouLoseTitle;
    private javax.swing.JLabel backgroundProgram;
    private javax.swing.JFrame extraFrame;
    private javax.swing.JPanel gameOverPanel;
    private javax.swing.JLabel lblBackgroundGame;
    private javax.swing.JLabel lblLevelTitle;
    private javax.swing.JLabel lblLine;
    private javax.swing.JLabel lblNextTitle;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblScoreTitle;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeTitle;
    private javax.swing.JLabel lbllinesNextLevelTitle;
    private javax.swing.JLabel levelGameOver;
    private javax.swing.JLabel levelTile;
    private javax.swing.JLabel linesGameOver;
    private javax.swing.JLabel linesTitle;
    private javax.swing.JButton mainMenuGameOver;
    private javax.swing.JButton mainMenuPause;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelLevel;
    private javax.swing.JPanel panelLine;
    private javax.swing.JPanel panelNextFigure;
    private javax.swing.JPanel panelScore;
    private javax.swing.JPanel panelTime;
    private javax.swing.JPanel panelXogo;
    private javax.swing.JPanel pausePanel;
    private javax.swing.JLabel pauseTitle;
    private javax.swing.JButton restartGameOver;
    private javax.swing.JButton restartPause;
    private javax.swing.JLabel scoreGameOver;
    private javax.swing.JLabel scoreTitle;
    private javax.swing.JToggleButton tglPause;
    private javax.swing.JLabel timeGameOver;
    private javax.swing.JLabel timeTitle;
    // End of variables declaration//GEN-END:variables

    public void pintarCadrado(JLabel lblCadrado) {
        panelXogo.add(lblCadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(lblCadrado.getX(), lblCadrado.getY(), 50, 50));
    }

    public void borrarCadrado(JLabel lblCadrado) {
        panelXogo.remove(lblCadrado);
    }

    public void mostrarNumeroLinas() {
        lblLine.setText(String.valueOf(xogo.getNumeroLinas()));
    }

    public void mostrarFinDoXogo() {
        pauseMenu();
        extraFrame.setVisible(true);
    }

    private void iniciarPartida() {

        startCrono();
        startSpeed();

        xogo = new Xogo(this);
        xogo.xenerarNovaFicha();
        panelXogo.setFocusable(true);
        pause = false;
    }

//    private void reiniciar () {
//    }
    private void pauseMenu() {
        pause = true;
        timerCrono.stop();
        timer.stop();

        extraFrame.setVisible(true);
        pausePanel.setVisible(true);
    }

    private void resumeMenu() {
        pause = false;
        timerCrono.start();
        timer.start();

        extraFrame.setVisible(false);
        pausePanel.setVisible(false);
    }

    private void reiniciarPartida() {

        pause = false;

        extraFrame.setVisible(false);
        pausePanel.setVisible(false);
        gameOverPanel.setVisible(false);
        time = 5;
        score = 0;
        speed = speedDefault;
        xogo.getCadradosChan().clear();
        panelXogo.removeAll();
        xogo.xenerarNovaFicha();
        timer.start();
        timerCrono.start();

    }

    private void gameOverMenu() {

        timerCrono.stop();
        timer.stop();
        pause = true;
        extraFrame.setVisible(true);
        gameOverPanel.setVisible(true);
    }

    private void startCrono() {

        timerCrono = new Timer(1000, (ActionEvent e) -> {
            if (time < 10) {
                lblTime.setText(String.valueOf("0" + time));
            } else {
                lblTime.setText(String.valueOf(time));
            }
            time++;

        });
        timerCrono.start();
    }

    private void startSpeed() {

        timer = new Timer(speed, (ActionEvent e) -> {
            score++;
            lblScore.setText(String.valueOf(score));
            xogo.moverFichaAbaixo();
            mainPanel.updateUI();
        });
        timer.start();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.Timer;
import modelo.Xogo;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;

/**
 *
 * @author a22danielas
 * @author a14carlosfd
 *
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    private int time;
    private int score;
    private int timeCooldown = 0;
    private int speed;
    private final int SPEEDEFAULT = 900;

    private Xogo xogo;

    private Timer timerCrono;
    private Timer timer;
    private Timer timerFPS;

    private boolean pause;
    private Clip clip;
    private Clip effect2;

    public VentanaPrincipal() {

        initComponents();
        gameJPanel.setVisible(false);
        gameJPanel.requestFocus();
        gameJPanel.requestFocusInWindow();

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
        MenuJPanel = new javax.swing.JPanel();
        Playlbl = new javax.swing.JLabel();
        Exitlbl = new javax.swing.JLabel();
        levelJSlider = new javax.swing.JSlider();
        levelLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JLabel();
        gameJPanel = new javax.swing.JPanel();
        panelXogo = new javax.swing.JPanel();
        lblBackgroundGame = new javax.swing.JLabel();
        panelScore = new javax.swing.JPanel();
        lblScoreTitle = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        panelNextFigure = new javax.swing.JPanel();
        lblNextTitle = new javax.swing.JLabel();
        panelLevel = new javax.swing.JPanel();
        lblLevelTitle = new javax.swing.JLabel();
        progressLevel = new style.CircleProgressBar();
        lblLevel = new javax.swing.JLabel();
        panelLine = new javax.swing.JPanel();
        lblLineTitle = new javax.swing.JLabel();
        lblLine = new javax.swing.JLabel();
        panelTime = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblTimeTitle = new javax.swing.JLabel();
        tglPause = new javax.swing.JToggleButton();
        backgroundProgram = new javax.swing.JLabel();

        extraFrame.setAlwaysOnTop(true);
        extraFrame.setBounds(new java.awt.Rectangle(450, 330, 0, 0));
        extraFrame.setLocation(new java.awt.Point(0, 0));
        extraFrame.setMinimumSize(new java.awt.Dimension(460, 340));
        extraFrame.setUndecorated(true);
        extraFrame.setSize(new java.awt.Dimension(450, 330));
        extraFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        extraFrame.setLocationRelativeTo(panelXogo);

        pausePanel.setAlignmentX(0.0F);
        pausePanel.setAlignmentY(0.0F);
        pausePanel.setMaximumSize(new java.awt.Dimension(450, 330));
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
        mainMenuPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuPauseActionPerformed(evt);
            }
        });
        pausePanel.add(mainMenuPause);
        mainMenuPause.setBounds(150, 250, 150, 40);

        extraFrame.getContentPane().add(pausePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 330));

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

        scoreGameOver.setBackground(new java.awt.Color(102, 0, 102));
        scoreGameOver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        scoreGameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreGameOver.setText("0");
        scoreGameOver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gameOverPanel.add(scoreGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 25));

        timeGameOver.setBackground(new java.awt.Color(102, 0, 102));
        timeGameOver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        timeGameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeGameOver.setText("0");
        timeGameOver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gameOverPanel.add(timeGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 90, 25));

        levelGameOver.setBackground(new java.awt.Color(102, 0, 102));
        levelGameOver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        levelGameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levelGameOver.setText("0");
        levelGameOver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gameOverPanel.add(levelGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 90, 25));

        linesTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        linesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linesTitle.setText("Lines");
        gameOverPanel.add(linesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 59, 30));

        linesGameOver.setBackground(new java.awt.Color(102, 0, 102));
        linesGameOver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        linesGameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linesGameOver.setText("0");
        linesGameOver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gameOverPanel.add(linesGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 90, 25));

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
        mainMenuGameOver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuGameOverActionPerformed(evt);
            }
        });
        gameOverPanel.add(mainMenuGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, 40));

        extraFrame.getContentPane().add(gameOverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 320));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 950));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 950));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Playlbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 90)); // NOI18N
        Playlbl.setForeground(new java.awt.Color(255, 255, 255));
        Playlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Playlbl.setText("Play");
        Playlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Playlbl.setFocusable(false);
        Playlbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Playlbl.setNextFocusableComponent(panelXogo);
        Playlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlaylblMouseClicked(evt);
            }
        });
        MenuJPanel.add(Playlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 170, 90));

        Exitlbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 90)); // NOI18N
        Exitlbl.setForeground(new java.awt.Color(255, 255, 255));
        Exitlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exitlbl.setText("Exit");
        Exitlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exitlbl.setFocusable(false);
        Exitlbl.setNextFocusableComponent(panelXogo);
        Exitlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitlblMouseClicked(evt);
            }
        });
        MenuJPanel.add(Exitlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 810, 140, 60));

        levelJSlider.setMaximum(20);
        levelJSlider.setMinimum(1);
        levelJSlider.setValue(1);
        levelJSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                levelJSliderStateChanged(evt);
            }
        });
        MenuJPanel.add(levelJSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 710, -1, -1));

        levelLbl.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        levelLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levelLbl.setText("1");
        MenuJPanel.add(levelLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 700, 30, 40));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        MenuJPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 290, 400));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgroundApp.jpg"))); // NOI18N
        background.setText("jLabel1");
        background.setFocusable(false);
        background.setMaximumSize(new java.awt.Dimension(1100, 950));
        background.setMinimumSize(new java.awt.Dimension(1100, 950));
        background.setPreferredSize(new java.awt.Dimension(1100, 950));
        MenuJPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 950));

        getContentPane().add(MenuJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 950));

        gameJPanel.setBackground(new java.awt.Color(102, 102, 102));
        gameJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelXogo.setBackground(new java.awt.Color(204, 204, 255));
        panelXogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        gameJPanel.add(panelXogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 500, 900));

        lblBackgroundGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10x18backgroundGameSafeZone.png"))); // NOI18N
        lblBackgroundGame.setText("lblBackgroundGame");
        lblBackgroundGame.setMaximumSize(new java.awt.Dimension(500, 900));
        lblBackgroundGame.setMinimumSize(new java.awt.Dimension(500, 900));
        lblBackgroundGame.setPreferredSize(new java.awt.Dimension(500, 900));
        gameJPanel.add(lblBackgroundGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 500, 900));
        lblBackgroundGame.getAccessibleContext().setAccessibleParent(gameJPanel);

        panelScore.setBackground(new java.awt.Color(231, 231, 231));
        panelScore.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelScore.setMinimumSize(new java.awt.Dimension(53, 53));
        panelScore.setPreferredSize(new java.awt.Dimension(110, 110));
        panelScore.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblScoreTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblScoreTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScoreTitle.setText("Score");
        lblScoreTitle.setMaximumSize(new java.awt.Dimension(100, 40));
        lblScoreTitle.setMinimumSize(new java.awt.Dimension(100, 40));
        lblScoreTitle.setPreferredSize(new java.awt.Dimension(100, 40));
        panelScore.add(lblScoreTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, -1, -1));

        lblScore.setBackground(new java.awt.Color(102, 0, 102));
        lblScore.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScore.setText("0");
        lblScore.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblScore.setMaximumSize(new java.awt.Dimension(100, 40));
        lblScore.setMinimumSize(new java.awt.Dimension(100, 40));
        lblScore.setPreferredSize(new java.awt.Dimension(100, 40));
        panelScore.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, -1));

        gameJPanel.add(panelScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 130));

        panelNextFigure.setBackground(new java.awt.Color(231, 231, 231));
        panelNextFigure.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelNextFigure.setMaximumSize(new java.awt.Dimension(220, 260));
        panelNextFigure.setMinimumSize(new java.awt.Dimension(220, 260));
        panelNextFigure.setPreferredSize(new java.awt.Dimension(220, 260));
        panelNextFigure.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNextTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblNextTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNextTitle.setText("Next");
        lblNextTitle.setMaximumSize(new java.awt.Dimension(100, 40));
        lblNextTitle.setMinimumSize(new java.awt.Dimension(100, 40));
        lblNextTitle.setPreferredSize(new java.awt.Dimension(100, 40));
        panelNextFigure.add(lblNextTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, -1, -1));

        gameJPanel.add(panelNextFigure, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 220, 280));

        panelLevel.setBackground(new java.awt.Color(231, 231, 231));
        panelLevel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelLevel.setPreferredSize(new java.awt.Dimension(220, 220));
        panelLevel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLevelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLevelTitle.setText("Level");
        panelLevel.add(lblLevelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        progressLevel.setMaximum(5);
        progressLevel.setToolTipText("");
        progressLevel.setFocusable(false);
        panelLevel.add(progressLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 110));

        lblLevel.setBackground(new java.awt.Color(102, 0, 102));
        lblLevel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLevel.setText("0");
        lblLevel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblLevel.setMaximumSize(new java.awt.Dimension(100, 40));
        lblLevel.setMinimumSize(new java.awt.Dimension(100, 40));
        lblLevel.setPreferredSize(new java.awt.Dimension(100, 40));
        panelLevel.add(lblLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, -1));

        gameJPanel.add(panelLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 220, 240));

        panelLine.setBackground(new java.awt.Color(231, 231, 231));
        panelLine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelLine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLineTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLineTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLineTitle.setText("Lines");
        lblLineTitle.setMaximumSize(new java.awt.Dimension(100, 40));
        lblLineTitle.setMinimumSize(new java.awt.Dimension(100, 40));
        lblLineTitle.setPreferredSize(new java.awt.Dimension(100, 40));
        panelLine.add(lblLineTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, -1, -1));

        lblLine.setBackground(new java.awt.Color(102, 0, 102));
        lblLine.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLine.setText("0");
        lblLine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblLine.setMaximumSize(new java.awt.Dimension(100, 40));
        lblLine.setMinimumSize(new java.awt.Dimension(100, 40));
        lblLine.setPreferredSize(new java.awt.Dimension(100, 40));
        panelLine.add(lblLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, -1));

        gameJPanel.add(panelLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 220, 130));

        panelTime.setBackground(new java.awt.Color(231, 231, 231));
        panelTime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTime.setMaximumSize(new java.awt.Dimension(220, 130));
        panelTime.setMinimumSize(new java.awt.Dimension(220, 130));
        panelTime.setPreferredSize(new java.awt.Dimension(220, 130));
        panelTime.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTime.setBackground(new java.awt.Color(102, 0, 102));
        lblTime.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("0");
        lblTime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTime.setMaximumSize(new java.awt.Dimension(100, 40));
        lblTime.setMinimumSize(new java.awt.Dimension(100, 40));
        lblTime.setPreferredSize(new java.awt.Dimension(100, 40));
        panelTime.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, -1));

        lblTimeTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTimeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimeTitle.setText("Time");
        lblTimeTitle.setMaximumSize(new java.awt.Dimension(100, 40));
        lblTimeTitle.setMinimumSize(new java.awt.Dimension(100, 40));
        lblTimeTitle.setPreferredSize(new java.awt.Dimension(100, 40));
        panelTime.add(lblTimeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, 100, 40));

        gameJPanel.add(panelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 220, 130));

        tglPause.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tglPause.setText("Pause");
        tglPause.setFocusable(false);
        tglPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglPauseActionPerformed(evt);
            }
        });
        gameJPanel.add(tglPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 730, 150, 40));

        backgroundProgram.setBackground(new java.awt.Color(204, 204, 204));
        backgroundProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgroundApp.jpg"))); // NOI18N
        backgroundProgram.setText("backgroundProgram");
        gameJPanel.add(backgroundProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 950));

        getContentPane().add(gameJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 950));

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
                timer.restart();
            }
            case 80, 27 -> {
                if (!pause) {
                    pauseMenu();
                } else {
                    resumeMenu();
                }
            }

            default -> {
            }
        }

    }//GEN-LAST:event_panelXogoKeyPressed

    private void restartGameOverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartGameOverActionPerformed
        restartGame();
    }//GEN-LAST:event_restartGameOverActionPerformed

    private void restartPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartPauseActionPerformed
        restartGame();
    }//GEN-LAST:event_restartPauseActionPerformed

    private void PlaylblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaylblMouseClicked

        MenuJPanel.setVisible(false);
        gameJPanel.setVisible(true);
        iniciarPartida();


    }//GEN-LAST:event_PlaylblMouseClicked

    private void mainMenuGameOverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuGameOverActionPerformed
        pause();
        tglPause.setVisible(true);
        MenuJPanel.setVisible(true);
        gameJPanel.setVisible(false);
        extraFrame.setVisible(false);
    }//GEN-LAST:event_mainMenuGameOverActionPerformed

    private void mainMenuPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuPauseActionPerformed
        pause();
        MenuJPanel.setVisible(true);
        gameJPanel.setVisible(false);
        extraFrame.setVisible(false);
        closeActualGame();
    }//GEN-LAST:event_mainMenuPauseActionPerformed

    private void ExitlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitlblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitlblMouseClicked

    private void levelJSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_levelJSliderStateChanged
        levelLbl.setText(String.valueOf(levelJSlider.getValue()));
    }//GEN-LAST:event_levelJSliderStateChanged

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
    private javax.swing.JLabel Exitlbl;
    private javax.swing.JPanel MenuJPanel;
    private javax.swing.JLabel Playlbl;
    private javax.swing.JLabel YouLoseTitle;
    private javax.swing.JLabel background;
    private javax.swing.JLabel backgroundProgram;
    private javax.swing.JFrame extraFrame;
    private javax.swing.JPanel gameJPanel;
    private javax.swing.JPanel gameOverPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackgroundGame;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblLevelTitle;
    private javax.swing.JLabel lblLine;
    private javax.swing.JLabel lblLineTitle;
    private javax.swing.JLabel lblNextTitle;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblScoreTitle;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeTitle;
    private javax.swing.JLabel levelGameOver;
    private javax.swing.JSlider levelJSlider;
    private javax.swing.JLabel levelLbl;
    private javax.swing.JLabel levelTile;
    private javax.swing.JLabel linesGameOver;
    private javax.swing.JLabel linesTitle;
    private javax.swing.JButton mainMenuGameOver;
    private javax.swing.JButton mainMenuPause;
    private javax.swing.JPanel panelLevel;
    private javax.swing.JPanel panelLine;
    private javax.swing.JPanel panelNextFigure;
    private javax.swing.JPanel panelScore;
    private javax.swing.JPanel panelTime;
    private javax.swing.JPanel panelXogo;
    private javax.swing.JPanel pausePanel;
    private javax.swing.JLabel pauseTitle;
    private style.CircleProgressBar progressLevel;
    private javax.swing.JButton restartGameOver;
    private javax.swing.JButton restartPause;
    private javax.swing.JLabel scoreGameOver;
    private javax.swing.JLabel scoreTitle;
    private javax.swing.JToggleButton tglPause;
    private javax.swing.JLabel timeGameOver;
    private javax.swing.JLabel timeTitle;
    // End of variables declaration//GEN-END:variables

    private void iniciarPartida() {
        xogo = new Xogo(this);
        inicializarContadores();
        startRefreshScreen();
        startCrono();
        startSpeed();
        cleanPanelXogo();
        xogo.xenerarNovaFicha();
        pause = false;
        tglPause.setSelected(false);
        panelXogo.setFocusable(true);
        panelXogo.requestFocus();
        try {

            inicializarContadores();
            startRefreshScreen();
            startCrono();
            startSpeed();
            cleanPanelXogo();
            
            xogo = new Xogo(this);

            pause = false;
            tglPause.setSelected(false);
            panelXogo.setFocusable(true);
            panelXogo.requestFocus();

            ReproducirBSO();

        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pintarCadrado(JLabel lblCadrado) {
        panelXogo.add(lblCadrado);

        iconarCadrado(lblCadrado);

        lblCadrado.setOpaque(false);
        lblCadrado.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
    }

    private void iconarCadrado(JLabel lblCadrado) {

        if (lblCadrado.getBackground() == Color.BLUE) {
            lblCadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/azul.png")));
        } else if (lblCadrado.getBackground() == Color.RED) {
            lblCadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rojo.png")));
        } else if (lblCadrado.getBackground() == Color.YELLOW) {
            lblCadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amarillo.png")));
        } else if (lblCadrado.getBackground() == Color.GREEN) {
            lblCadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verde.png")));
        } else if (lblCadrado.getBackground() == Color.WHITE) {
            lblCadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blanco.png")));
        } else if (lblCadrado.getBackground() == Color.MAGENTA) {
            lblCadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/morado.png")));
        } else if (lblCadrado.getBackground() == Color.ORANGE) {
            lblCadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naranja.png")));
        }

    }

    public void borrarCadrado(JLabel lblCadrado) {
        panelXogo.remove(lblCadrado);
    }

    public void mostrarNumeroLinas() {
        lblLineTitle.setText(String.valueOf(xogo.getNumeroLinas()));
    }

    public void mostrarFinDoXogo() {
        timerCrono.stop();
        timer.stop();
        pause = true;
        pausePanel.setVisible(false);
        gameOverPanel.setVisible(true);
        extraFrame.setVisible(true);

        scoreGameOver.setText(lblScore.getText());
        timeGameOver.setText(lblTime.getText());
        linesGameOver.setText(lblLine.getText());
        levelGameOver.setText(lblLevel.getText());
        tglPause.setVisible(false);
        clip.close();
        effect2.close();
    }

    public boolean isPause() {
        return pause;
    }

    private void pause() {
        pause = true;
        timerCrono.stop();
        timer.stop();
        timerFPS.stop();
    }

    private void resume() {
        pause = false;
        timerCrono.start();
        timer.start();
    }

    private void pauseMenu() {
        pause();
        pausePanel.setVisible(true);
        extraFrame.setVisible(true);
        clip.stop();

    }

    private void resumeMenu() {
        resume();
        extraFrame.setVisible(false);
        pausePanel.setVisible(false);
        clip.start();
    }

    private void restartGame() {

        pause = false;

        extraFrame.setVisible(false);
        pausePanel.setVisible(false);
        gameOverPanel.setVisible(false);
        tglPause.setVisible(true);

        iniciarPartida();

    }

    private void inicializarContadores() {
        timeCooldown = 0;
        time = 0;
        score = 0;
        xogo.setDificultadInicioJuego(xogo.getDIFICULTAD_MIN() - (xogo.getDIFICULTAD_NIVEL() * levelJSlider.getValue()));
        speed = xogo.getDificultadInicioJuego();
        progressLevel.setValue(0);

    }

    private void startCrono() {

        timerCrono = new Timer(1000, (ActionEvent e) -> {

            time++;
            score = score + 1 * speed / 100;

            if (xogo.getLevel() > 3 && time % 20 == 0) {
                xogo.anadirCuadradosAleatorios();
            }
        });
        timerCrono.start();
    }

    private void startSpeed() {

        timer = new Timer(speed, (ActionEvent e) -> {

            xogo.moverFichaAbaixo();

        });
        timer.start();
    }

    private void startRefreshScreen() {

        timerFPS = new Timer(20, (ActionEvent e) -> {
            lblScore.setText(String.valueOf(score));
            lblLine.setText(String.valueOf(xogo.getNumeroLinas()));
            lblLevel.setText(String.valueOf(xogo.getLevel()));
            progressLevel.setValue(xogo.getLinasNextLevel());
            if (time < 10) {
                lblTime.setText(String.valueOf("0" + time));
            } else {
                lblTime.setText(String.valueOf(time));
            }
            gameJPanel.updateUI();
        });
        timerFPS.start();
    }

    private void cleanPanelXogo() {
        panelXogo.removeAll();
    }

    private void closeActualGame() {

        xogo = null;

    }

    public Timer getTimer() {
        return timer;
    }

    public int getTimeCooldown() {
        return timeCooldown;
    }

    public void setTimeCooldown(int timeCooldown) {
        this.timeCooldown = timeCooldown;
    }

    public int getTime() {
        return time;
    }

    public void ReproducirSonido() throws IOException {

        try {
            File prueba = new File("./src/resources/audio/shot2.wav");

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(prueba);
            Clip effect = AudioSystem.getClip();
            effect.open(audioInputStream);
            effect.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }

    public void ReproducirBSO() throws IOException {

        try {
            File prueba = new File("./src/resources/audio/bso.wav");

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(prueba);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(ABORT);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }

    public void ReproducirSuelo() throws IOException {

        try {
            File prueba = new File("./src/resources/audio/suelo.wav");

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(prueba);
            effect2 = AudioSystem.getClip();
            effect2.open(audioInputStream);
            effect2.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }
}

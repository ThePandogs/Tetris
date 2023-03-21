/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iu;

import Log.LogExcepcion;
import static java.awt.image.ImageObserver.ABORT;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author a14carlosfd
 */
public class Sound {

    private VentanaPrincipal ventanaPricipal;
    private final File BSOFile = new File("./src/resources/audio/bso.wav");
    private Clip BSO;
    private Clip sonidoSuelo;
    private Clip sonidoLinea;
    private final File sueloFile = new File("./src/resources/audio/suelo3.wav");
    private final File lineaFile = new File("./src/resources/audio/shot2.wav");
    AudioInputStream sueloAudio;
    AudioInputStream BSOAudio;
    AudioInputStream lineaAudio;
    LogExcepcion logExcepcion;

    public Sound(VentanaPrincipal ventanaPricipal) {

        try {
            this.ventanaPricipal = ventanaPricipal;
            logExcepcion = ventanaPricipal.getLogExcepcion();
            BSOAudio = AudioSystem.getAudioInputStream(BSOFile);
            BSO = AudioSystem.getClip();
            BSO.open(BSOAudio);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            logExcepcion.anadirExcepcionLog(ex);
        }

    }

    public Clip getBSO() {
        return BSO;
    }

    public Clip getSonidoSuelo() {
        return sonidoSuelo;
    }

    public Clip getSonidoLinea() {
        return sonidoLinea;
    }

    public void ReproducirBSO() {
        BSO.loop(ABORT);
    }

    public void ReproducirSuelo() {

        try {
            sueloAudio = AudioSystem.getAudioInputStream(sueloFile);
            sonidoSuelo = AudioSystem.getClip();
            sonidoSuelo.open(sueloAudio);
            sonidoSuelo.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            logExcepcion.anadirExcepcionLog(ex);
        }
    }

    public void ReproducirSonidoLinea() {
        try {
            lineaAudio = AudioSystem.getAudioInputStream(lineaFile);
            sonidoLinea = AudioSystem.getClip();
            sonidoLinea.open(lineaAudio);
            sonidoLinea.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            logExcepcion.anadirExcepcionLog(ex);
        }
    }

    public void PararSonidoLinea() {

        sonidoLinea.stop();

    }

    public void PararSonidoSuelo() {

        sonidoSuelo.close();
    }

    public void PararBSO() {

        BSO.stop();
    }

    public void STOP() {
        BSO.close();

    }
}

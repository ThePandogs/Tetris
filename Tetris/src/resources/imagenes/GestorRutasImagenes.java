/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imagenes;

import java.awt.Color;
import java.util.HashMap;

/**
 *
 * @author a14carlosfd
 */
public class GestorRutasImagenes {

    private HashMap<Color, String> imagenesFichas;
    private HashMap<Color, String> imagenesCadrados;

    public GestorRutasImagenes() {
        imagenesFichas = cargarImagenesFichas();
        imagenesCadrados = cargarImagenesCadrados();
    }

    public HashMap<Color, String> getImagenesFichas() {
        return imagenesFichas;
    }

    public HashMap<Color, String> getImagenesCadrados() {
        return imagenesCadrados;
    }

    private HashMap cargarImagenesCadrados() {

        HashMap RutasImagenesCadrados = new HashMap<Color, String>() {
            {
                put(Color.BLUE, "/resources/imagenes/azul.png");
                put(Color.RED, "/resources/imagenes/rojo.png");
                put(Color.YELLOW, "/resources/imagenes/amarillo.png");
                put(Color.GREEN, "/resources/imagenes/verde.png");
                put(Color.WHITE, "/resources/imagenes/blanco.png");
                put(Color.MAGENTA, "/resources/imagenes/morado.png");
                put(Color.ORANGE, "/resources/imagenes/naranja.png");
            }
        };
        return RutasImagenesCadrados;

    }

    private HashMap cargarImagenesFichas() {

        HashMap RutasImagenesFichas = new HashMap<Color, String>() {
            {
                put(Color.BLUE, "/resources/imagenes/cuadrado.png");
                put(Color.RED, "/resources/imagenes/zderecha.png");
                put(Color.YELLOW, "/resources/imagenes/barra.png");
                put(Color.GREEN, "/resources/imagenes/lizquierda.png");
                put(Color.WHITE, "/resources/imagenes/lderecha.png");
                put(Color.MAGENTA, "/resources/imagenes/zizquierda.png");
                put(Color.ORANGE, "/resources/imagenes/t.png");
            }
        };

        return RutasImagenesFichas;
    }

}

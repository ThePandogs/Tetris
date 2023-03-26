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

    private HashMap<Color, String> imagenesCadrados;

    public GestorRutasImagenes() {

        imagenesCadrados = cargarImagenesCadrados();
    }
    public HashMap<Color, String> getImagenesCadrados() {
        return imagenesCadrados;
    }

    /**
     * Devuelve un HashMap con las rutas de imagenes de cuadrados
     */
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

}

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
                put(Color.BLUE, "/resources/imagenes/cadrados/azul.png");
                put(Color.RED, "/resources/imagenes/cadrados/rojo.png");
                put(Color.YELLOW, "/resources/imagenes/cadrados/amarillo.png");
                put(Color.GREEN, "/resources/imagenes/cadrados/verde.png");
                put(Color.WHITE, "/resources/imagenes/cadrados/blanco.png");
                put(Color.MAGENTA, "/resources/imagenes/cadrados/morado.png");
                put(Color.ORANGE, "/resources/imagenes/cadrados/naranja.png");
            }
        };
        return RutasImagenesCadrados;

    }

}

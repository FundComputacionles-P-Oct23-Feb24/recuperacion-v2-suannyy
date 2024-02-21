/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensaje;

/**
 *
 * @author natsu
 */
public class CrearMensaje {
    public static String obtenerMensaje(int base, int mult, int div) {
        String cadenaFinal = "";
        for (int i = 0; i < 6; i++) {
            // recorremos las veces necesarias para llenar la cadena
            // de la informacion enviada
            cadenaFinal = String.format("%s(%d*%d)/%d\n", cadenaFinal,
                    base, mult, div);
            base++;
            // cambiamos los valores iniciales siguiendo las secuencias
            mult = mult + 2;
            div = div + 7;
        }
        return cadenaFinal;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearCadena;

/**
 *
 * @author natsu
 */
public class Cadena {
    public static String obtenerCadena(String m,
            int t, int c) {
            String cadena = String.format("%s: televisores %d - celulares %d\n",
                    m,t,c);
            // llenamos una cadena para presentar el reporte
            return cadena;
    }
}

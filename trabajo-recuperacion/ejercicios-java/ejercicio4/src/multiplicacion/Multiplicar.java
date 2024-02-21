/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplicacion;

/**
 *
 * @author natsu
 */
public class Multiplicar {
    public static double[] obtenerMultiplicacion(int base, int mult, int div) {
        double[] resultado = new double[6]; 
        // creamos un arreglo para poder tener los resultados de las secuencias
        for (int i = 0; i < 6; i++) {
            resultado[i] = (base * mult) / div;
            base++;
            // aumentamos los valores iniciales siguiendo las secuencias
            mult = mult + 2;
            div = div + 7;
        }
        return resultado;
    }
}

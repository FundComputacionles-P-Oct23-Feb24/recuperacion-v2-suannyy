/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;
import mensaje.CrearMensaje;
import multiplicacion.Multiplicar;  
/**
 *
 * @author romer
 */
public class FuncionPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String p1;
        double[] p2 = new double[6];
        int base = 1;
        int mult = 2;
        int div = 7;
        p1 = CrearMensaje.obtenerMensaje(base, mult, div);
        // usamos la funcion obtenerMensaje para llenar la presentacion
        p2 = Multiplicar.obtenerMultiplicacion(base, mult, div);
        // usamos la funcino obtenerMultiplicacion para obtener los resultados
        System.out.print("Presentacion:\n" + p1 + "Resultados:\n");
        // presentamos la secuencia y usamos un ciclo repetitivo para poder
        // presentar los resultados de manera mas limpia
        for (int i = 0; i < p2.length; i++) {
            System.out.print(p2[i] + "\n");
        }
    }

    

    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;
import crearCadena.Cadena;
/**
 *
 * @author natsu
 */
public class FuncionPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] meses = {"Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio"
                , "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
            "Diciembre"};
        int[] ventaNumeroTelevisores = {100,
             130, 150, 200, 100, 190, 200, 200, 300, 100, 400, 1000};
        int[] ventaNumeroCelulares = {20,
             30, 22, 50, 100, 35, 90, 80, 10, 40, 50, 60};
        for (int i = 0; i < meses.length; i++) {
            // recorremos los arreglos 
            if (ventaNumeroCelulares[i]<= 35) {
                // aqui descartamos que el numero de celulares vendidos
                // sea menor o igual a 35
                System.out.printf("%s",Cadena.obtenerCadena(meses[i],
                        ventaNumeroTelevisores[i],ventaNumeroCelulares[i]));
                // imprimimos la cadena que devuelve la funcion obtenerCadena
            }
        }
    }

}

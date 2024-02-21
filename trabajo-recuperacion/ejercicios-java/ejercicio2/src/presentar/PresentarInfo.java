/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentar;

/**
 *
 * @author natsu
 */
public class PresentarInfo {
    public static void presentarReporte(String equipo, int gol1, int gol2,
            int gol3, int gol4) {
        int totalPuntos = gol1 + gol2 + gol3 + gol4;
        // sacamos el total de goles por equipo con los datos que enviamos de la
        // funcion principal
        System.out.println("Equipo: " + equipo);
        System.out.println("Goles: " + gol1 + ", " + gol2 + ", " 
                + gol3 + ", " + gol4);
        System.out.println("Total de puntos: " + totalPuntos);
        System.out.println("--------------------");
    }
}

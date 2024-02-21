/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;
import presentar.PresentarInfo;
/**
 *
 * @author natsu
 */
public class FuncionPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] equipos = {"Barcelona", "Emelec", "Liga de Quito", 
            "Independiente del Valle", "Delfin", "Macará", "Deportivo Cuenca"
                , "Orense"};
        int[][] goles = {{1, 2, 2, 5}, {4, 1, 1, 4}, {8, 0, 1, 3}, {7, 1, 1, 2},
            {6, 0, 1, 2}, {5, 2, 1, 1}, {4, 0, 3, 2}, {3, 1, 2, 1}};

        for (int i = 0; i < equipos.length; i++) {
            // recorremos los arreglos recorriendo las filas
            // para mandar los datos al procedimiento presentarReporte
            // teniendo que cada fila del arreglo goles pertenece a un equipo
            PresentarInfo.presentarReporte(equipos[i], goles[i][0], goles[i][1]
                    , goles[i][2], goles[i][3]);
        }
    }

    
}


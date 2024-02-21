/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;
import obtenerInformacion.Informacion;

import java.util.Scanner;

/**
 *
 * @author natsu
 */
public class FuncionPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String acumulador = ""; // creamos un acumulador para poder presentar
                                // la informacion
        int n;
         System.out.println("¿Cuántos pescadores desea ingresar?");
            n = scanner.nextInt(); // aqui hacemos el limite de usuarios a ingresar
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                // usamos un ciclo repetitivo para llenar el acumulador
            acumulador = String.format("%s%s",acumulador
                    ,Informacion.obtenerInformacion());
            // llenamos el acumulador usando la funcion obtenerInformacion
        }
            System.out.printf("%s",acumulador);
    }
}

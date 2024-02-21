/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obtenerInformacion;

import java.util.Scanner;

/**
 *
 * @author natsu
 */
public class Informacion {

    public static String obtenerInformacion() {
        // usamos esta funcion para llenar los datos de los usuarios
        Scanner scanner = new Scanner(System.in);
        String acumulador = "";
        System.out.println("Ingrese el nombre del pescador:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el número de libras de camarón:");
        double librasCamaron = scanner.nextDouble();
        System.out.println("Ingrese el número de libras de bacalao:");
        double librasBacalao = scanner.nextDouble();
        double costoCamaron = librasCamaron * 1.1;
        // le damos el precio a las libras por vender
        // con el precio dado en el pdf
        double costoBacalao = librasBacalao * 1.2;
        double totalPagar = costoCamaron + costoBacalao;
        // sacamos la suma total de los costos para ver el total a pagar para
        // el pescador
        acumulador = String.format("Pescador: %s\nLibras de camaron: %.1f"
                + " - costo $%.2f\nLibras de bacalao: %.1f - costo $%.2f\n"
                + "Total a pagar al pescador $%.2f\n",nombre,librasCamaron,
                 costoCamaron, librasBacalao, costoBacalao, totalPagar);
        return acumulador;
        // es una funcion que retorna un String por eso retornamos
    }
}

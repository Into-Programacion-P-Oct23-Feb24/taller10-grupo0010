/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        double suma = 0;

        for (int f = 0; f < vendedores.length; f++) {
            for (int c = 0; c < ventas[f].length; c++) {
                System.out.printf("Ingrese las ventas de %s del dia %d\n",
                        vendedores[f], c + 1);
                ventas[f][c] = entrada.nextDouble();
            }
        }
        for (int f = 0; f < vendedores.length; f++) {

            for (int c = 0; c < ventas[f].length; c++) {
                suma += ventas[f][c];
            }
        }
        for (int f = 0; f < vendedores.length; f++) {
            System.out.printf("Verdedor(a) %s\n", vendedores[f]);
        }
        System.out.printf("Ha realizado un total de %.2f en ventas ", 
                suma);

    }
}

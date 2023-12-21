/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] datos = new double[2][2];
        double dato;
        int contador = 0;
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.println("Ingrese los valores");
                dato = entrada.nextDouble();
                if (dato >= 1000 && dato <= 1199) {
                    datos[f][c] = dato;
                } else {
                    datos[f][c] = 10;
                    contador++;
                }
            }
        }
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.printf("El valor en la posicion [%d][%d] es "
                        + "%.2f\n",
                        f, c, datos[f][c], contador);
            }
        }
        System.out.printf("Los datos ingresados fuera de rango son %d\n",
                contador);
    }

}

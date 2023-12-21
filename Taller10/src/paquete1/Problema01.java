/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] notas = {{9, 10, 7, 8},
        {10, 5, 7, 9},
        {7, 9.4, 10, 9}};
        String[] estudent = {"Jerry Ponce", "Gabriela Lewis",
            "David Bell"};
        double[] sumaNotas = new double[3];
        double[] promedio = new double[3];

        double suma = 0;

        for (int f = 0; f < notas.length; f++) {
            suma = 0;

            for (int c = 0; c < notas[f].length; c++) {
                suma = suma + notas[f][c];
                sumaNotas[f] = suma;
                 
            }
            promedio[f] = (sumaNotas[f]) / 4;
        }
       
        for (int f = 0; f < notas.length; f++) {
            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n", estudent[f], promedio[f]);
        }

    }

}

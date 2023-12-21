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
        String[] nombresEstudiante = {"Jerry Ponce", "Gabriela Lewis",
            "David Bell"};
        double[] sumaNotas = new double[3];
        double[] promedio = new double[3];
        double prom = 0;
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma = suma + notas[i][j];

            }
            sumaNotas[i] = suma; //     
        }
        for (int i = 0; i < notas.length; i++) {

            for (int j = 0; j < notas[i].length; j++) {
                prom = (sumaNotas[i]) / 4;
                promedio[i] = prom;

            }
        }

        // Resultados
        for (int i = 0; i < nombresEstudiante.length; i++) {
            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n",
                    nombresEstudiante[i],
                    promedio[i]);

        }
    }
}

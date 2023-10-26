/* Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
 * y muestre la suma de sus elementos.*/

// @Author Roxana Rolon

import java.util.Arrays;

public class rellenarMatriz {

    public static void main(String[] args) {
        int n = 3; // número de filas
        int m = 4; // número de columnas
        int[][] matriz = new int[n][m];
        int suma = 0;

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        // Calcular la suma de los elementos de la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }

        // Imprimir la matriz y la suma de sus elementos
        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
}
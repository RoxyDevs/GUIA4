/* Realice un programa que compruebe si una matriz dada
* es antisimétrica. Se dice que una matriz A es antisimétrica
* cuando ésta es igual a su propia traspuesta, pero cambiada
* de signo. Es decir, A es antisimétrica si A = -AT.
*
* La matriz traspuesta de una matriz A se denota por AT
* y se obtiene cambiando sus filas por columnas (o viceversa).
*
* *Matriz:
* | 0|-2| 4|
* | 2| 0| 2|
* |-4|-2| 0|
*
* * *Matriz Transpuesta:
*| 0|2|-4|
*|-2|0|-2|
*| 4|2| 0|
*/
// @Author Roxana Rolon

import java.util.Random;

public class MatrizAntisimetrica {
    public static void main(String[] args) {
        int[][] matrizA = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);

        int[][] matrizB = transponerMatriz(matrizA);

        System.out.println("Matriz B:");
        imprimirMatriz(matrizB);

        if (esAntisimetrica(matrizA)) {
            System.out.println("La matriz A es antisimétrica");
        } else {
            System.out.println("La matriz A no es antisimétrica");
        }
    }

    public static int[][] transponerMatriz(int[][] matriz) {
        int[][] matrizT = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }

        return matrizT;
    }

    public static boolean esAntisimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}



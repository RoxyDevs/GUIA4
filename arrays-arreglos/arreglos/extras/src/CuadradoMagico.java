/* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada
* por números del 1 al 9 donde la suma de sus filas, sus
* columnas y sus diagonales son idénticas. Crear un programa
* que permita introducir un cuadrado por teclado y determine
* si este cuadrado es mágico o no. El programa deberá
* comprobar que los números introducidos son correctos,
* es decir, están entre el 1 y el 9.
*
* Ejemplo:
*
* 2 7 6
* 9 5 1
* 4 3 8
*/

// @Author Roxana Rolon

import java.util.Scanner;

public class CuadradoMagico {
    public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca los números del cuadrado
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.print("Introduce el número en la posición [" + i + "][" + j + "]: ");
                int numero = scanner.nextInt();

                // Comprobar que el número sea válido
                if (numero < 1 || numero > 9) {
                    System.out.println("El número introducido no es válido. Inténtalo de nuevo.");
                    j--;
                } else {
                    cuadrado[i][j] = numero;
                }
            }
        }

        // Calcular la suma de las filas, columnas y diagonales del cuadrado
        int sumaFila1 = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        int sumaFila2 = cuadrado[1][0] + cuadrado[1][1] + cuadrado[1][2];
        int sumaFila3 = cuadrado[2][0] + cuadrado[2][1] + cuadrado[2][2];
        int sumaColumna1 = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
        int sumaColumna2 = cuadrado[0][1] + cuadrado[1][1] + cuadrado[2][1];
        int sumaColumna3 = cuadrado[0][2] + cuadrado[1][2] + cuadrado[2][2];
        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];

        // Comprobar si el cuadrado es mágico o no
        if (sumaFila1 == sumaFila2 && sumaFila2 == sumaFila3 && sumaFila3 == sumaColumna1 && sumaColumna1 == sumaColumna2 && sumaColumna2 == sumaColumna3 && sumaColumna3 == sumaDiagonal1 && sumaDiagonal1 == sumaDiagonal2) {
            System.out.println("¡El cuadrado es mágico!");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }
}


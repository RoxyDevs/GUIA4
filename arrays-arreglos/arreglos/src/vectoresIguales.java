/* Escriba un programa que averigüe si dos vectores de N enteros son iguales
*(la comparación deberá detenerse en cuanto se detecte alguna diferencia
* entre los elementos).*/

/* @Author Roxana Rolon */

import java.util.Scanner;

public class vectoresIguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño de los vectores: ");
        int n = scanner.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        boolean iguales = true;
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el valor para la posición " + i + " del primer vector: ");
            vector1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el valor para la posición " + i + " del segundo vector: ");
            vector2[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores no son iguales.");
        }
    }
}

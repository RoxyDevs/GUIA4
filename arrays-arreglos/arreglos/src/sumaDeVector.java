/*
* Realizar un algoritmo que calcule la suma de todos los elementos de un vector
* de tamaño N, con los valores ingresados por el usuario.
*/

/* @Author Roxana Rolon */
import java.util.Scanner;

public class sumaDeVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del vector: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el valor para la posición " + i + ": ");
            vector[i] = scanner.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        System.out.println("La suma de todos los elementos del vector es: " + suma);
    }
}

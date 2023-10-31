/* Realizar un algoritmo que llene un vector de tamaño N
* con valores aleatorios y le pida al usuario un número a
* buscar en el vector. El programa mostrará dónde se encuentra
* el numero y si se encuentra repetido*/

/* @Author Roxana Rolon*/

import java.util.Scanner;
import java.util.Random;

public class RellenarVector {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingrese el tamaño del vector: ");
        int n = input.nextInt();

        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(100);
        }

        System.out.print("Ingrese un número a buscar en el vector: ");
        int num = input.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                System.out.println("El número " + num + " se encuentra en la posición " + i + " del vector.");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        } else if (count == 1) {
            System.out.println("El número " + num + " aparece una vez en el vector.");
        } else {
            System.out.println("El número " + num + " aparece " + count + " veces en el vector.");
        }
    }
}
/* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/

/* @Author Roxana Rolon*/

import java.util.Random;

public class RecorrerVector {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = 100;
        int[] vector = new int[n];
        int[] digitCount = new int[6];

        // Llenamos el vector con números enteros aleatorios
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(99999) + 1;
        }

        // Contamos cuántos números tienen 1, 2, 3, 4 o 5 dígitos
        for (int i = 0; i < n; i++) {
            int digits = String.valueOf(vector[i]).length();
            digitCount[digits]++;
        }

        // Mostramos los resultados por pantalla
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hay " + digitCount[i] + " números con " + i + " dígito(s).");
        }
    }
}

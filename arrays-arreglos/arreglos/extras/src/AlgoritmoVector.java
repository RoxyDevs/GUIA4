/* Realizar un algoritmo que llene un vector con los 100 primeros números enteros
* y los muestre por pantalla en orden descendente.*/

/* @Author Roxana Rolon*/

public class AlgoritmoVector {
    public static void main(String[] args) {
        int[] vector = new int[100];

        // Llenamos el vector con los primeros 100 números enteros
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }

        // Ordenamos el vector en orden descendente
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] < vector[j]) {
                    int temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
            }
        }

        // Mostramos el vector por pantalla en orden descendente
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}

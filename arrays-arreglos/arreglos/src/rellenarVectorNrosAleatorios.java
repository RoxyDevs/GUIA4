/* Crear una función rellene un vector con números aleatorios,
* pasándole un arreglo por parámetro. Después haremos otra función o procedimiento
* que imprima el vector */

/* @Author Roxana Rolon */
import java.util.Arrays;

public class rellenarVectorNrosAleatorios {

    public static void main(String[] args) {
        int[] vector = new int[10];
        llenarVector(vector);
        System.out.println(Arrays.toString(vector));
    }

    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
    }
}
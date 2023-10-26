/* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
* a medida que el usuario las va ingresando, construya una “sopa de letras para niños”
* de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal
* en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación
* de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
* Finalmente imprima por pantalla la sopa de letras creada.
* Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
* funciones de Java substring(), Length() y Math.random().*/

import java.util.Scanner;

// @Author Roxana Rolon
public class sopaDeLetrasParaNinos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] sopa = new char[20][20];
        String[] palabras = new String[5];

        // Pedir al usuario que ingrese las palabras
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("La palabra debe tener entre 3 y 5 caracteres. Ingrese la palabra " + (i + 1) + ": ");
                palabras[i] = scanner.nextLine();
            }
        }

        // Ubicar las palabras en la sopa de letras
        int fila = (int) (Math.random() * 20);
        int columna = (int) (Math.random() * (20 - palabras[0].length()));
        for (int i = 0; i < palabras[0].length(); i++) {
            sopa[fila][columna + i] = palabras[0].charAt(i);
        }

        // Rellenar los espacios no utilizados con números aleatorios del 0 al 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == '\u0000') {
                    sopa[i][j] = (char) ('0' + (int) (Math.random() * 10));
                }
            }
        }

        // Imprimir la sopa de letras creada
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}

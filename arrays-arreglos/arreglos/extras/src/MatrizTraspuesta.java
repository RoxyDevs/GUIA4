import java.util.Random;

public class MatrizTraspuesta {

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

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


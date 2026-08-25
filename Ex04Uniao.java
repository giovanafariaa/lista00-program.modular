import java.util.Scanner;


public class Ex04Uniao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de elementos de X (n): ");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Digite os elementos de X:");
        for (int i = 0; i < n; i++) {
            System.out.print("X[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("Digite o número de elementos de Y (m): ");
        int m = sc.nextInt();
        int[] y = new int[m];
        System.out.println("Digite os elementos de Y:");
        for (int i = 0; i < m; i++) {
            System.out.print("Y[" + i + "]: ");
            y[i] = sc.nextInt();
        }

        // Tamanho máximo possível para Z é n + m
        int[] z = new int[n + m];
        int tamZ = 0;

        // Adiciona todos os elementos de X, evitando duplicados dentro de X
        for (int i = 0; i < n; i++) {
            if (!contem(z, tamZ, x[i])) {
                z[tamZ++] = x[i];
            }
        }

        // Adiciona os elementos de Y que ainda não estão em Z
        for (int i = 0; i < m; i++) {
            if (!contem(z, tamZ, y[i])) {
                z[tamZ++] = y[i];
            }
        }

        System.out.print("\nVetor união Z: ");
        for (int i = 0; i < tamZ; i++) {
            System.out.print(z[i] + " ");
        }
        System.out.println();

        sc.close();
    }

    private static boolean contem(int[] vetor, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
}

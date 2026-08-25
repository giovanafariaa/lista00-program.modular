import java.util.Scanner;

public class Ex09ParesImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nRELATÓRIO");

        System.out.println("Os números pares são:");
        int somaPares = 0;
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("número " + numeros[i] + " na posição " + (i + 1));
                somaPares += numeros[i];
            }
        }
        System.out.println("Soma dos pares = " + somaPares);

        System.out.println("\nOs números ímpares são:");
        int quantidadeImpares = 0;
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("número " + numeros[i] + " na posição " + (i + 1));
                quantidadeImpares++;
            }
        }
        System.out.println("Quantidade de ímpares = " + quantidadeImpares);

        sc.close();
    }
}

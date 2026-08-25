import java.util.Scanner;

public class Ex02TresValores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[3];

        System.out.print("Digite o valor de x: ");
        valores[0] = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        valores[1] = sc.nextInt();
        System.out.print("Digite o valor de z: ");
        valores[2] = sc.nextInt();

        int x = valores[0];
        int y = valores[1];
        int z = valores[2];

        int maior = Math.max(x, Math.max(y, z));
        int menor = Math.min(x, Math.min(y, z));

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        int limInf = Math.min(y, z);
        int limSup = Math.max(y, z);

        if (x >= limInf && x <= limSup) {
            System.out.println("x está dentro do intervalo [" + y + ", " + z + "]");
        } else {
            System.out.println("x está fora do intervalo [" + y + ", " + z + "]");
        }

        // Divisibilidade (evitando divisão por zero)
        if (y != 0 && x % y == 0) {
            System.out.println("x é divisível por y");
        } else {
            System.out.println("x não é divisível por y");
        }

        if (z != 0 && x % z == 0) {
            System.out.println("x é divisível por z");
        } else {
            System.out.println("x não é divisível por z");
        }

        sc.close();
    }
}

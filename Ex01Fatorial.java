import java.util.Scanner;


public class Ex01Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Fatorial não definido para números negativos.");
        } else {
            long fatorial = 1;
            for (int i = 2; i <= x; i++) {
                fatorial *= i;
            }
            System.out.println(x + "! = " + fatorial);
        }

        sc.close();
    }
}

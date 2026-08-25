import java.util.Scanner;

public class Ex03Intersecao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de alunos (n): ");
        int n = sc.nextInt();

        int[] progModular = new int[n];
        int[] calculo = new int[n];

        System.out.println("Digite as matrículas dos alunos de Programação Modular:");
        for (int i = 0; i < n; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            progModular[i] = sc.nextInt();
        }

        System.out.println("Digite as matrículas dos alunos de Cálculo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            calculo[i] = sc.nextInt();
        }

        System.out.println("\nMatrículas de alunos matriculados nas duas disciplinas:");
        boolean encontrouAlgum = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (progModular[i] == calculo[j]) {
                    System.out.println(progModular[i]);
                    encontrouAlgum = true;
                    break;
                }
            }
        }

        if (!encontrouAlgum) {
            System.out.println("Nenhum aluno está matriculado nas duas disciplinas.");
        }

        sc.close();
    }
}

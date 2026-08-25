import java.util.Scanner;

public class Ex06Provas {

    private static final int NUM_QUESTOES = 8;
    private static final int NUM_ALUNOS = 10;
    private static final int NOTA_MINIMA = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] gabarito = new char[NUM_QUESTOES];
        System.out.println("Digite o gabarito (" + NUM_QUESTOES + " respostas, ex: A B C D):");
        for (int i = 0; i < NUM_QUESTOES; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = sc.next().toUpperCase().charAt(0);
        }

        int[] numerosAlunos = new int[NUM_ALUNOS];
        int[] notas = new int[NUM_ALUNOS];
        int aprovados = 0;

        for (int a = 0; a < NUM_ALUNOS; a++) {
            System.out.println("\n--- Aluno " + (a + 1) + " ---");
            System.out.print("Número do aluno: ");
            numerosAlunos[a] = sc.nextInt();

            int nota = 0;
            for (int q = 0; q < NUM_QUESTOES; q++) {
                System.out.print("Resposta da questão " + (q + 1) + ": ");
                char resposta = sc.next().toUpperCase().charAt(0);
                if (resposta == gabarito[q]) {
                    nota++;
                }
            }
            notas[a] = nota;

            if (nota >= NOTA_MINIMA) {
                aprovados++;
            }
        }

        System.out.println("\n--- Relatório Final ---");
        for (int a = 0; a < NUM_ALUNOS; a++) {
            System.out.println("Aluno " + numerosAlunos[a] + " - Nota: " + notas[a]);
        }

        double percentualAprovacao = (aprovados / (double) NUM_ALUNOS) * 100;
        System.out.printf("Percentual de aprovação: %.2f%%\n", percentualAprovacao);

        sc.close();
    }
}

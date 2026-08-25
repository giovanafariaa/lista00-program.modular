import java.util.Scanner;

public class Ex05Pesquisa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int contadorEspecial = 0;
        boolean primeiroHabitante = true;

        while (true) {
            System.out.print("\nDigite a idade do habitante (-1 para encerrar): ");
            int idade = sc.nextInt();

            if (idade == -1) {
                break;
            }

            System.out.print("Sexo (M - masculino / F - feminino): ");
            String sexo = sc.next();

            System.out.print("Cor dos olhos (azuis/verdes/castanhos): ");
            String olhos = sc.next();

            System.out.print("Cor dos cabelos (louros/castanhos/pretos): ");
            String cabelos = sc.next();

            if (primeiroHabitante) {
                maiorIdade = idade;
                menorIdade = idade;
                primeiroHabitante = false;
            } else {
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
                if (idade < menorIdade) {
                    menorIdade = idade;
                }
            }

            boolean feminino = sexo.equalsIgnoreCase("F");
            boolean faixaEtaria = idade >= 18 && idade <= 35;
            boolean olhosVerdes = olhos.equalsIgnoreCase("verdes");
            boolean cabelosLouros = cabelos.equalsIgnoreCase("louros");

            if (feminino && faixaEtaria && olhosVerdes && cabelosLouros) {
                contadorEspecial++;
            }
        }

        System.out.println("\n--- Resultados ---");
        if (primeiroHabitante) {
            System.out.println("Nenhum habitante foi cadastrado.");
        } else {
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
        }
        System.out.println("Mulheres entre 18 e 35 anos, olhos verdes e cabelos louros: " + contadorEspecial);

        sc.close();
    }
}

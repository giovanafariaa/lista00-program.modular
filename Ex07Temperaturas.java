import java.util.Scanner;


public class Ex07Temperaturas {

    private static final String[] MESES = {
        "janeiro", "fevereiro", "março", "abril", "maio", "junho",
        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[12];

        System.out.println("Digite a temperatura média de cada mês:");
        for (int i = 0; i < 12; i++) {
            System.out.print(MESES[i] + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        int mesMaior = 0;
        int mesMenor = 0;

        for (int i = 1; i < 12; i++) {
            if (temperaturas[i] > temperaturas[mesMaior]) {
                mesMaior = i;
            }
            if (temperaturas[i] < temperaturas[mesMenor]) {
                mesMenor = i;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Maior temperatura: " + temperaturas[mesMaior] + " (" + MESES[mesMaior] + ")");
        System.out.println("Menor temperatura: " + temperaturas[mesMenor] + " (" + MESES[mesMenor] + ")");

        sc.close();
    }
}

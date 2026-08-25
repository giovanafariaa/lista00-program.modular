import java.util.Scanner;

 
public class Ex10Matriz {

    private static final int MESES_DO_ANO = 12;
    private static final int SEMANAS_DO_MES = 4;

    private static final String[] MESES = {
        "janeiro", "fevereiro", "março", "abril", "maio", "junho",
        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] vendas = new double[MESES_DO_ANO][SEMANAS_DO_MES];

        for (int mes = 0; mes < MESES_DO_ANO; mes++) {
            System.out.println("\n--- " + MESES[mes] + " ---");
            for (int semana = 0; semana < SEMANAS_DO_MES; semana++) {
                System.out.print("Vendas da semana " + (semana + 1) + ": ");
                vendas[mes][semana] = sc.nextDouble();
            }
        }

        System.out.println("\n--- Total vendido por mês ---");
        double totalAno = 0;
        for (int mes = 0; mes < MESES_DO_ANO; mes++) {
            double totalMes = 0;
            for (int semana = 0; semana < SEMANAS_DO_MES; semana++) {
                totalMes += vendas[mes][semana];
            }
            System.out.printf("%s: R$ %.2f%n", MESES[mes], totalMes);
            totalAno += totalMes;
        }

        System.out.println("\n--- Total vendido por semana (ano todo) ---");
        for (int semana = 0; semana < SEMANAS_DO_MES; semana++) {
            double totalSemana = 0;
            for (int mes = 0; mes < MESES_DO_ANO; mes++) {
                totalSemana += vendas[mes][semana];
            }
            System.out.printf("Semana %d: R$ %.2f%n", (semana + 1), totalSemana);
        }

        System.out.printf("%nTotal vendido pela loja no ano: R$ %.2f%n", totalAno);

        sc.close();
    }
}

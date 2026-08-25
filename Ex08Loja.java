import java.util.Scanner;


public class Ex08Loja {

    private static final int NUM_OBJETOS = 10;
    private static final double SALARIO_BASE = 545.00;
    private static final double PERCENTUAL_COMISSAO = 0.05;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precos = new double[NUM_OBJETOS];
        int[] quantidades = new int[NUM_OBJETOS];

        for (int i = 0; i < NUM_OBJETOS; i++) {
            System.out.println("\n--- Objeto " + (i + 1) + " ---");
            System.out.print("Preço unitário: ");
            precos[i] = sc.nextDouble();
            System.out.print("Quantidade vendida: ");
            quantidades[i] = sc.nextInt();
        }

        System.out.println("\n--- Relatório de Vendas ---");
        double valorGeralVendas = 0;
        int posicaoMaisVendido = 0;

        for (int i = 0; i < NUM_OBJETOS; i++) {
            double valorTotalObjeto = precos[i] * quantidades[i];
            valorGeralVendas += valorTotalObjeto;

            System.out.printf("Objeto %d - Qtd: %d, Valor unitário: R$ %.2f, Valor total: R$ %.2f%n",
                    (i + 1), quantidades[i], precos[i], valorTotalObjeto);

            if (quantidades[i] > quantidades[posicaoMaisVendido]) {
                posicaoMaisVendido = i;
            }
        }

        double comissao = valorGeralVendas * PERCENTUAL_COMISSAO;
        double salarioTotal = SALARIO_BASE + comissao;

        System.out.printf("%nValor geral das vendas: R$ %.2f%n", valorGeralVendas);
        System.out.printf("Comissão do vendedor: R$ %.2f%n", comissao);
        System.out.printf("Salário total do vendedor: R$ %.2f%n", salarioTotal);

        System.out.printf("%nObjeto mais vendido: posição %d, valor unitário R$ %.2f%n",
                (posicaoMaisVendido + 1), precos[posicaoMaisVendido]);

        sc.close();
    }
}

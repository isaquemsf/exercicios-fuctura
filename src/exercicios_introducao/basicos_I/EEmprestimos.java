package exercicios_introducao.basicos_I;

import java.util.Scanner;

public class EEmprestimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double taxaJurosMes = 1.51 / 100; //1,51%
        System.out.println("Digite o valor do empréstimo:");
        double valorEmprestimo = scanner.nextDouble();

        System.out.println("Informe a quantidade de meses para pagamento:");
        int meses = scanner.nextInt();

        double valorParcela = valorEmprestimo / meses;
        double valorTaxaEmReal = valorParcela * taxaJurosMes;
        double parcelaComTaxa = valorParcela + valorTaxaEmReal;

        System.out.println("------------------------------------------");
        System.out.println("TAXA MENSAL: " + (taxaJurosMes * 100) + "%");
        System.out.printf("VALOR DO EMPRESTIMO: R$%.2f%n", valorEmprestimo);
        System.out.println("QUANTIDADE DE MESES PARA PAGAMENTO: " + meses + " MESES");
        System.out.printf("VALOR DA PARCELA (SEM TAXA): R$%.2f%n", valorParcela);
        System.out.printf("VALOR DA TAXA (EM R$): R$%.2f%n", valorTaxaEmReal);
        System.out.printf("VALOR TOTAL DA PARCELA: R$%.2f", parcelaComTaxa);

        System.out.println("testando commit2");
    }
}

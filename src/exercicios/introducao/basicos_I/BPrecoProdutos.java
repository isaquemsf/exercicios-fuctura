package exercicios.introducao.basicos_I;

import java.util.Scanner;

public class BPrecoProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro produto:");
        double valor1 = scanner.nextDouble();

        System.out.println("Informe o valor do segundo produto:");
        double valor2 = scanner.nextDouble();

        double valorTotal = valor1 + valor2;

        System.out.printf("Valor do produto 1: R$ %.2f%n", valor1);
        System.out.printf("Valor do produto 2: R$ %.2f%n", valor2);
        System.out.printf("Valor total da compra: R$ %.2f", valorTotal);
    }
}

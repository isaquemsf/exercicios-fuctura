package exercicios.introducao.basicos_I;

import java.util.Scanner;

public class HRealEmDollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a cotação do dólar:");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Informe um valor em R$:");
        double valorEmReal = scanner.nextDouble();

        double valorEmDolar = valorEmReal / cotacaoDolar;

        System.out.printf("1 DÓLAR EQUIVALE A R$%.2f%n", cotacaoDolar);
        System.out.printf("VALOR EM REAL PARA CONVERSÃO: R$%.2f%n", valorEmReal);
        System.out.printf("VALOR EM DÓLAR CONVERTIDO: $%.2f", valorEmDolar);
    }
}

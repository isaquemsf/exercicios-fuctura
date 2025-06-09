package exercicios_introducao.basicos_I;

import java.util.Scanner;

public class FContaDeAgua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de litros d'água usados no mês:");
        double litrosDAgua = scanner.nextDouble();

        double valorLitro = 0.02;
        double valorConta = litrosDAgua * valorLitro;

        System.out.printf("LITROS DE ÁGUA GASTOS NO MÊS: %.2f LITROS%n", litrosDAgua);
        System.out.printf("VALOR POR LITRO: R$%.2f%n", valorLitro);
        System.out.printf("VALOR DA CONTA: R$%.2f", valorConta);
    }
}

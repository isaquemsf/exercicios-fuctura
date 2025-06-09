package exercicios_introducao.basicos_I;

import java.util.Scanner;

public class JParcelasJuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço à vista do produto:");
        double precoAVista = scanner.nextDouble();

        System.out.println("Informe a quantidade de parcelas:");
        int quantParcelas = scanner.nextInt();

        double jurosSimples = 2.0 / 100;
        double valorParcelas = precoAVista / quantParcelas;
        double valorJurosSimples = precoAVista * jurosSimples;
        double parcelasComJuros = valorParcelas + valorJurosSimples;

        System.out.printf("PREÇO DO PRODUTO À VISTA: R$%.2f%n", precoAVista);
        System.out.printf("QUANTIDADE DE PARCELAS: %d%n", quantParcelas);
        System.out.println("JUROS SIMPLES: " + (jurosSimples * 100) + "%");
        System.out.printf("VALOR EM R$ DOS JUROS: R$%.2f%n", valorJurosSimples);
        System.out.printf("VALOR TOTAL DAS PARCELAS: R$%.2f%n", parcelasComJuros);
    }
}

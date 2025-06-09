package exercicios_introducao.basicos_I;

import java.util.Scanner;

public class GValorFrete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o peso da encomenda (em kg):");
        double pesoEncomenda = scanner.nextDouble();

        double valorKg = 5;
        double valorFrete = pesoEncomenda * valorKg;

        System.out.printf("VALOR POR QUILOGRAMA: R$%.2f%n", valorKg);
        System.out.printf("PESO DA ENCOMENDA: %.2fKg%n", pesoEncomenda);
        System.out.printf("VALOR TOTAL DO FRETE: R$%.2f", valorFrete);
    }
}

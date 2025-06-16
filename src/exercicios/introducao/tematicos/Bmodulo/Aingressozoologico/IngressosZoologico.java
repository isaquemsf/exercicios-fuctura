package exercicios.introducao.tematicos.Bmodulo.Aingressozoologico;

import java.util.Scanner;

public class IngressosZoologico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();

        double valorIngresso = 20.0;
        double metadeValorIngresso = valorIngresso / 2;

        if (idade <= 12) {
            System.out.println("Ingresso gratuito para sua idade.");
        } else if (idade <= 60) {
            System.out.printf("Ingresso custa R$ %.2f", valorIngresso);
        } else {
            System.out.printf("Ingresso custa R$ %.2f", metadeValorIngresso);
        }
    }
}

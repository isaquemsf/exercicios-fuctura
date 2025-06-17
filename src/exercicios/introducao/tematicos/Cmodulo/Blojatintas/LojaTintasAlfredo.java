package exercicios.introducao.tematicos.Cmodulo.Blojatintas;

import java.util.Scanner;

public class LojaTintasAlfredo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantas latas de tinta foram vendidas");
        int quantLatasVendidas = scanner.nextInt();

        double valorTinta = 0;
        double somaValores = 0;

        for (int i = 0; i < quantLatasVendidas; i++) {
            System.out.println("Informe o valor da " + (i+1) + "° lata:");
            valorTinta = scanner.nextDouble();
            somaValores += valorTinta;
        }

        System.out.println("Quantidade total de tintas vendidas: " + quantLatasVendidas);
        System.out.printf("Valor do faturamento: R$%.2f", somaValores);
    }
}

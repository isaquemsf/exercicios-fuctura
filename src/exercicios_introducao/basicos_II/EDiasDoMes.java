package exercicios_introducao.basicos_II;

import java.util.Scanner;

public class EDiasDoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor referente ao mês. Considere: 1 = Janeiro | 2 = Fevereiro...");
        int valorMes = scanner.nextInt();

        switch (valorMes) {
            case 1,3,5,7,8,10,12 -> System.out.println("Este mês tem 31 dias.");
            case 4,6,9,11 -> System.out.println("Este mês tem 30 dias.");
            default -> System.out.println("Dígito inválido.");
        }
    }
}

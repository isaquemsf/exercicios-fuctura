package exercicios_introducao.basicos_II;

import java.util.Scanner;

public class LDiasDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor referente a um dia da semana:\n" +
                "1 - Domingo | 2 - Segunda | 3 - Terça | 4 - Quarta | 5 - Quinta | 6 - Sexta | 7 - Sábado");
        int valor = scanner.nextInt();

        switch (valor) {
            case 1 -> System.out.println("Domingo!");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Valor inserido não corresponde. Tente novamente.");
        }
    }
}

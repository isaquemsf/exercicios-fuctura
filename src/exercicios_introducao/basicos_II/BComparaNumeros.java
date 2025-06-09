package exercicios_introducao.basicos_II;

import java.util.Scanner;

public class BComparaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.printf("MAIOR NÚMERO: %d%n", num1);
            System.out.printf("MENOR NÚMERO: %d", num2);
        } else if (num2 > num1) {
            System.out.printf("MAIOR NÚMERO: %d%n", num2);
            System.out.printf("MENOR NÚMERO: %d", num1);
        } else {
            System.out.println("OS NÚMEROS SÃO IGUAIS.");
        }
    }
}

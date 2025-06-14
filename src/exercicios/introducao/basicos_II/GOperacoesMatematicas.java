package exercicios.introducao.basicos_II;

import java.util.Scanner;

public class GOperacoesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo valor:");
        int num2 = scanner.nextInt();

        System.out.println("Informe a operação desejada: (+) = soma | (-) = subtração" +
                " | (*) multiplicação | (/) divisão");
        String operador = scanner.next();

        if (operador.length() == 1) {
            switch (operador) {
                case "+" -> {
                    int valor = num1 + num2;
                    System.out.println("Operação selecionada - Soma\nResultado: " + valor);
                }
                case "-" -> {
                    int valor = num1 - num2;
                    System.out.println("Operação selecionada - Subtração\nResultado: " + valor);
                }
                case "*" -> {
                    int valor = num1 * num2;
                    System.out.println("Operação selecionada - Multiplicação\nResultado: " + valor);
                }
                case "/" -> {
                    int valor = num1 / num2;
                    System.out.println("Operação selecionada - Divisão\nResultado: " + valor);
                }
                default -> System.out.println("Informe um operador válido!");
            }
        } else {
            System.out.println("Digite apenas o operador!");
        }
    }
}

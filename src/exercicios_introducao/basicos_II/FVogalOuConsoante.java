package exercicios_introducao.basicos_II;

import java.util.Scanner;

public class FVogalOuConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        String letra = scanner.next();

        if (letra.length() == 1) {
            if (letra.equals("0") || letra.equals("1") || letra.equals("2") ||
                    letra.equals("3") || letra.equals("4") || letra.equals("5") ||
                    letra.equals("6") || letra.equals("7") || letra.equals("8") ||
                    letra.equals("9")) {
                System.out.println("Formato inválido, digite uma letra!");

            } else if (letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) {
                System.out.printf("A letra (%s) é uma vogal.", letra);

            } else {
                System.out.printf("A letra (%s) é uma consoante.", letra);
            }
        } else {
            System.out.println("Digite apenas uma letra!");
        }
    }
}

package exercicios_introducao.basicos_II;

import java.util.Scanner;

public class MAnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ano:");
        int ano = scanner.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0 && ano % 400 != 0) {
                System.out.printf("O ano %d não é bissexto.", ano);
            } else {
                System.out.printf("O ano %d é bissexto.", ano);
            }
        } else {
            System.out.printf("O ano %d não é bissexto.", ano);
        }
    }
}

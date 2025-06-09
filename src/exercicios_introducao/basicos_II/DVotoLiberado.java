package exercicios_introducao.basicos_II;

import java.util.Scanner;

public class DVotoLiberado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 16) {
            if (idade >= 18 && idade < 65) {
                System.out.println("Voto obrigatório.");
                return;
            }
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Não pode votar.");
        }
    }
}

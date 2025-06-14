package exercicios.introducao.lacorepeticao;

import java.util.Scanner;

public class DTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valor = scanner.nextInt();

        System.out.println("\nTabuada de " + valor + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", valor, i, (valor*i));
        }
    }
}

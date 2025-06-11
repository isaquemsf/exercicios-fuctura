package exercicios_introducao.lacorepeticao;

import java.util.Scanner;

public class CSomaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        int soma = 0;
        int aux = numero;

        while (aux != 0) {
            soma += aux % 10;
            aux /= 10;
        }

        System.out.println("Soma dos dígitos de " + numero + ": " + soma);
    }
}

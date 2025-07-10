package exercicios.recomendados.Bestruturascondicionais.Acondicoesbasicas.Dimparoupar;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valor = scan.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Número " + valor + " é par.");
        } else {
            System.out.println("Número " + valor + " é ímpar.");
        }
    }
}

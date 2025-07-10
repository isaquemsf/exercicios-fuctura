package exercicios.recomendados.Bestruturascondicionais.Acondicoesbasicas.Eanobissexto;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um ano:");
        int ano = scan.nextInt();

        if (ano % 4 == 0 || ano % 100 == 0 && ano % 400 == 0) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }
    }
}

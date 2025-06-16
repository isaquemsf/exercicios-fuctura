package exercicios.introducao.tematicos.Cmodulo.Aaniversariogenesia;

import java.util.Scanner;

public class AniversarioGenesia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de dias que faltam para seu aniversário:");
        int dias = scanner.nextInt();

        for (int i = dias; i != 0; i--) {
            if (i == 1) {
                System.out.println("Seu aniversário é amanhã!");
            } else {
                System.out.println("Faltam " + i + " dias para seu aniversário!");
            }
        }
        System.out.println("Chegou o seu dia! Parabéns!");
    }
}

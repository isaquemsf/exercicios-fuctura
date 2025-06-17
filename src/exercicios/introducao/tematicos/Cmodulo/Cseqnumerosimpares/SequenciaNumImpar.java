package exercicios.introducao.tematicos.Cmodulo.Cseqnumerosimpares;

import java.util.Scanner;

public class SequenciaNumImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor máximo:");
        int numMax = scanner.nextInt();

        System.out.println("Sequência de números ímpares:");
        for (int i = 1; i <= numMax; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

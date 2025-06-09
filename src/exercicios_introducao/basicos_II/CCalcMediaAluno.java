package exercicios_introducao.basicos_II;

import java.util.Scanner;

public class CCalcMediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7 && media <= 10) {
            if (media == 10) {
                System.out.println("ALUNO APROVADO COM NOTA MÁXIMA!");
                return;
            }
            System.out.println("ALUNO APROVADO!");
        } else if (media >= 4) {
            System.out.println("ALUNO TERÁ QUE FAZER A PROVA FINAL!");
        } else {
            System.out.println("ALUNO REPROVADO!");
        }

        System.out.printf("NOTA 1: %.2f%n", nota1);
        System.out.printf("NOTA 2: %.2f%n", nota2);
        System.out.printf("NOTA 3: %.2f%n", nota3);
        System.out.printf("MÉDIA DO ALUNO: %.1f", media);
    }
}

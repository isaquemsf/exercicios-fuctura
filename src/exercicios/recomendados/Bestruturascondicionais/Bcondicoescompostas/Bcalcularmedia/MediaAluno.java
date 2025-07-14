package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Bcalcularmedia;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        double n1 = scan.nextDouble();

        System.out.println("Informe a segunda nota:");
        double n2 = scan.nextDouble();

        double media = (n1 + n2) / 2;
        String mensagem;

        if (media >= 7) {
            mensagem = "Aluno aprovado!";
        } else if (media >= 5) {
            mensagem = "Aluno em recuperação!";
        } else {
            mensagem = "Aluno reprovado!";
        }

        System.out.printf("Média: %.1f%n", media);
        System.out.println(mensagem);
    }
}

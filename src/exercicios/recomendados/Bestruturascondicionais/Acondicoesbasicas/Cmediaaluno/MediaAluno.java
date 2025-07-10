package exercicios.recomendados.Bestruturascondicionais.Acondicoesbasicas.Cmediaaluno;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Informe a segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        String mensagem;

        if (media >= 7) {
            mensagem = "Aluno teve bom aproveitamento";
        } else {
            mensagem = "Aluno não teve bom aproveitamento";
        }

        System.out.printf("Média: %.1f | %s", media, mensagem);
    }
}

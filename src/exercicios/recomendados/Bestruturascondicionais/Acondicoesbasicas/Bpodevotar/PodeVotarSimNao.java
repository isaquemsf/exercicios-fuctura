package exercicios.recomendados.Bestruturascondicionais.Acondicoesbasicas.Bpodevotar;

import java.util.Scanner;

public class PodeVotarSimNao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento:");
        int anoNascimento = scan.nextInt();

        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;
        String mensagem;

        if (idade >= 16) {
            if (idade >= 18 && idade <= 64) {
                mensagem = "Voto obrigatório!";
            } else {
                mensagem = "Pode votar!";
            }
        } else {
            mensagem = "Não pode votar!";
        }

        System.out.println("Idade: " + idade + " | " + mensagem);
    }
}

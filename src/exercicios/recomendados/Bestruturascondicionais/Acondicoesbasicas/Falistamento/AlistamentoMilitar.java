package exercicios.recomendados.Bestruturascondicionais.Acondicoesbasicas.Falistamento;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento:");
        int anoNascimento = scan.nextInt();

        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;
        int idadeAlistamento = 18;
        int tempo = idadeAlistamento - idade;
        String mensagem;

        if (idade < idadeAlistamento) {
            mensagem = "Faltam " + (tempo) + " anos para o alistamento";
        } else {
            mensagem = "Se passaram " + (tempo * -1) + " anos do alistamento";
        }

        System.out.println(mensagem);
    }
}

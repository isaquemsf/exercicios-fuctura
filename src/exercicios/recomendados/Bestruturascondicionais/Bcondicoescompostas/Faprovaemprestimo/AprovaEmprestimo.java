package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Faprovaemprestimo;

import java.util.Scanner;

public class AprovaEmprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da casa:");
        double valorCasa = scan.nextDouble();

        System.out.println("Informe o seu salário:");
        double salario = scan.nextDouble();

        System.out.println("Em quantos anos você irá pagar a casa?");
        int anosPagamento = scan.nextInt();

        int quantidadeParcelas = anosPagamento * 12;
        double valorParcelas = valorCasa / quantidadeParcelas;
        double valorLimiteParcela = salario * 0.3;

        if (valorParcelas <= valorLimiteParcela) {
            System.out.println("Empréstimo autorizado!");
            System.out.printf("""
                Valor da Casa: R$ %.2f
                Salário: R$ %.2f
                Parcelas: %dx de R$ %.2f | (%d anos)
                """, valorCasa, salario, quantidadeParcelas, valorParcelas, anosPagamento);
        } else {
            System.out.println("Empréstimo negado!");
        }

    }
}

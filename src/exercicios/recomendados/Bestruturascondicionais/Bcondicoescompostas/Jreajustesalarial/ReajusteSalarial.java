package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Jreajustesalarial;

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário atual do funcionário:");
        double salarioAtual = scan.nextDouble();

        System.out.println("Informe o gênero do funcionário (Feminino ou Masculino):");
        String genero = scan.next().toUpperCase();

        System.out.println("A quantos anos o funcionário trabalha na empresa?");
        int anosTrabalhados = scan.nextInt();

        double porcentagemAumento = 0;
        double valorPorcentagem = 0.0;
        double novoSalario = 0.0;

        if (genero.charAt(0) == 'F') {
            if (anosTrabalhados < 15) {
                porcentagemAumento = 5.0/100;
            } else if (anosTrabalhados <= 20) {
                porcentagemAumento = 12.0/100;
            } else {
                porcentagemAumento = 23.0/100;
            }
        } else if (genero.charAt(0) == 'M') {
            if (anosTrabalhados < 20) {
                porcentagemAumento = 3.0/100;
            } else if (anosTrabalhados <= 30) {
                porcentagemAumento = 13.0/100;
            } else {
                porcentagemAumento = 25.0/100;
            }
        } else {
            System.out.println("Insira uma resposta válida!");
            return;
        }

        valorPorcentagem = salarioAtual * porcentagemAumento;
        novoSalario = salarioAtual + valorPorcentagem;

        System.out.printf("""
                Gênero do funcionário: %s
                Anos de empresa: %d
                Salário atual: R$ %.2f
                
                Novo salário: R$ %.2f
                """, genero, anosTrabalhados, salarioAtual, novoSalario);
    }
}

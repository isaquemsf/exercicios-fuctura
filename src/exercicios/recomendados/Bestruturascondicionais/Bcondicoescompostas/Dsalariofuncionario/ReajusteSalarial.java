package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Dsalariofuncionario;

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String nome = scan.nextLine();

        System.out.println("Qual o salário do funcionário?");
        double salario = scan.nextDouble();

        System.out.println("A quantos anos o funcionário trabalha na empresa?");
        int anosTrabalhados = scan.nextInt();

        double novoSalario = 0.0;
        double porcentAumento = 0.0;
        double valorPorcent = 0.0;
        String mensagem;

        if (anosTrabalhados > -1 && anosTrabalhados < 3) {
            porcentAumento = 3.0/100;
            valorPorcent = salario * porcentAumento;
            novoSalario = salario + valorPorcent;
            mensagem = "Aumento de 3% aplicado!";
        } else if (anosTrabalhados < 10) {
            porcentAumento = 12.5/100;
            valorPorcent = salario * porcentAumento;
            novoSalario = salario + valorPorcent;
            mensagem = "Aumento de 12,5% aplicado!";
        } else {
            porcentAumento = 20.0/100;
            valorPorcent = salario * porcentAumento;
            novoSalario = salario + valorPorcent;
            mensagem = "Aumento de 20% aplicado!";
        }

        System.out.printf("Salário anterior: R$ %.2f%n", salario);
        System.out.println(mensagem);
        System.out.printf("Salário atualizado: R$ %.2f", novoSalario);
    }
}

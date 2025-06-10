package exercicios_introducao.basicos_II;

import java.util.Scanner;

public class JAumentoSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do salário:");
        double salario = scanner.nextDouble();

        double percentAumento = 0;
        double valorAumento = 0;
        double salarioAumentado = 0;

        if (salario > 1500) {
            if (salario > 2500) {
                percentAumento = 0.05;
                valorAumento = salario * percentAumento;
                salarioAumentado = salario + valorAumento;
            } else {
                percentAumento = 0.1;
                valorAumento = salario * percentAumento;
                salarioAumentado = salario + valorAumento;
            }

        } else if (salario > 0){
            percentAumento = 0.15;
            valorAumento = salario * percentAumento;
            salarioAumentado = salario + valorAumento;
        } else {
            System.out.println("Erro com o valor inserido. Tente novamente.");
        }

        System.out.printf("VALOR DO SALÁRIO: R$%.2f%n", salario);
        System.out.printf("VALOR DO AUMENTO: R$%.2f%n", valorAumento);
        System.out.printf("SALÁRIO ATUALIZADO: R$%.2f", salarioAumentado);
    }
}

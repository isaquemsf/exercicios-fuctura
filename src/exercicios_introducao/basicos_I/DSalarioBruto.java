package exercicios_introducao.basicos_I;

import java.util.Scanner;

public class DSalarioBruto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas trabalhadas:");
        double horasTrab = scanner.nextDouble();

        System.out.println("Informe o valor ganho por hora (R$/h):");
        double valorHora = scanner.nextDouble();

        double salarioBruto = horasTrab * valorHora;

        System.out.printf("Horas trabalhadas: %.1f%n" +
                          "Valor ganho por hora: %.2f%n" +
                          "Salário bruto: %.2f", horasTrab, valorHora, salarioBruto);
    }
}

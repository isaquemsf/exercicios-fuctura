package exercicios.recomendados.Asintaxe.Coperacoesmatematicas.Jcalculosvariados;

import java.util.Scanner;

public class Equacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Informe o segundo valor:");
        double valor2 = scanner.nextDouble();

        System.out.println("Informe o terceiro valor:");
        double valor3 = scanner.nextDouble();

        double somaValores = valor1 + valor2 + valor3;
        double multiplicaValor = somaValores * 3;
        double resto = multiplicaValor % 5;

        System.out.println("Soma dos valores: " + somaValores);
        System.out.println("Resultado multiplicação: " + multiplicaValor);
        System.out.println("Resto: " + resto);
    }
}

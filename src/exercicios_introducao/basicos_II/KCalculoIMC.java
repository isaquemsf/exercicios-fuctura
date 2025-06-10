package exercicios_introducao.basicos_II;

import java.util.Scanner;

public class KCalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Informe sua altura:");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao = "";

        if (imc < 18.5) {
            classificacao = "Abaixo do peso.";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade grau II";
        } else {
            classificacao = "Obesidade grau III";
        }

        System.out.printf("IMC: %.2f%n", imc);
        System.out.println(classificacao);
    }
}

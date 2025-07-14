package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Gcalcularimc;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura:");
        double altura = scan.nextDouble();

        System.out.println("Informe seu peso:");
        double peso = scan.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso.";
        } else if (imc < 25) {
            classificacao = "Peso ideal.";
        } else if (imc < 30) {
            classificacao = "Sobrepeso.";
        } else if (imc <= 40) {
            classificacao = "Obesidade";
        } else {
            classificacao = "Obesidade mórbida";
        }

        System.out.println(classificacao);
    }
}

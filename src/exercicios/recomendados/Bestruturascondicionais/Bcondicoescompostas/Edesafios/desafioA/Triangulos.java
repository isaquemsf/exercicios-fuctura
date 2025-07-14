package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Edesafios.desafioA;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do 1° segmento:");
        int segmento1 = scan.nextInt();

        System.out.println("Informe o valor do 2° segmento:");
        int segmento2 = scan.nextInt();

        System.out.println("Informe o valor do 3° segmento:");
        int segmento3 = scan.nextInt();

        int soma1com2 = segmento1 + segmento2;
        int soma1com3 = segmento1 + segmento3;
        int soma2com3 = segmento2 + segmento3;
        boolean triangulo = false;
        String classificacao = "";

        if (segmento1 <= soma2com3) {
            if (segmento2 <= soma1com3) {
                if (segmento3 <= soma1com2) {
                    System.out.println("Triângulo pode ser criado.");
                    triangulo = true;
                }
            }
        }

        if (triangulo) {
            if (segmento1 == segmento2 && segmento1 == segmento3) {
                classificacao = "TRIÂNGULO EQUILÁTERO - Todos os lados são iguais";
            } else if (segmento2 == segmento3 || segmento2 == segmento1 || segmento1 == segmento3) {
                classificacao = "TRIÂNGULO ISÓSCELES - Dois lados iguais";
            } else {
                classificacao = "TRIÂNGULO ESCALENO - Todos os lados são diferentes";
            }
        } else {
            System.out.println("Triângulo não pode ser criado.");
        }

        System.out.println(classificacao);
    }
}

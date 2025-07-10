package exercicios.recomendados.Bestruturascondicionais.Acondicoesbasicas.Idesafio;

import java.util.Scanner;

public class FormarTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamnho do primeiro segmento:");
        int segmento1 = scan.nextInt();

        System.out.println("Informe o tamnho do segundo segmento:");
        int segmento2 = scan.nextInt();

        System.out.println("Informe o tamnho do terceiro segmento:");
        int segmento3 = scan.nextInt();

        int soma1com2 = segmento1 + segmento2;
        int soma1com3 = segmento1 + segmento3;
        int soma2com3 = segmento2 + segmento3;

        if (segmento1 < soma2com3 && segmento2 < soma1com3 && segmento3 < soma1com2) {
            System.out.println("Triângulo criado!");
        } else {
            System.out.println("Não foi possível criar o triângulo.");
        }
    }
}

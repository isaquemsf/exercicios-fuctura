package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Edesafios.desafioC;

import java.util.Scanner;

public class AdvinharNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorAleatorio = (int) (Math.random() * 5) + 1;
        int contador = 0;

        System.out.println("TENTE DESCOBRIR O NÚMERO ALEATÓRIO ENTRE 1 E 5:");
        int num = scanner.nextInt();

        while(num != valorAleatorio) {
            ++contador;
            if (num > valorAleatorio) {
                System.out.println("Você errou! Informe um valor menor!");
                num = scanner.nextInt();
            } else {
                System.out.println("Você errou! Informe um valor maior!");
                num = scanner.nextInt();
            }
        }
        System.out.println("Você acertou! NÚMERO DE TENTATIVAS " + (contador + 1));
    }
}

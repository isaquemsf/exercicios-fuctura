package exercicios_introducao.lacorepeticao;

import java.util.Scanner;

public class BAdvinharNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * 100) + 1;
        int contador = 0;

        System.out.println("Digite um número entre 1 e 100 e descubra se acertou:");
        int num = scanner.nextInt();

        while (num != numAleatorio) {
            if (num > numAleatorio) {
                System.out.println("Digite um valor menor.");
                num = scanner.nextInt();
                contador++;
            } else {
                System.out.println("Digite um valor maior.");
                num = scanner.nextInt();
                contador++;
            }
        }
        System.out.println("Você acertou! Número de tentativas: " + (contador + 1));
    }
}

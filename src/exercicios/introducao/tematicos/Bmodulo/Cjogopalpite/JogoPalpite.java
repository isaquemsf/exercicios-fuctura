package exercicios.introducao.tematicos.Bmodulo.Cjogopalpite;

import java.util.Scanner;

public class JogoPalpite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * 100) + 1;
        int contador = 0;

        System.out.println("Digite um número entre 1 e 100 e descubra se acertou:");
        int num = scanner.nextInt();

        while (num != numAleatorio) {
            if (num > numAleatorio) {
                System.out.println("Muito alto!");
                num = scanner.nextInt();
                contador++;
            } else {
                System.out.println("Muito baixo!");
                num = scanner.nextInt();
                contador++;
            }
        }
        System.out.println("Parabéns, acertou! Número de tentativas: " + (contador + 1));
    }
}

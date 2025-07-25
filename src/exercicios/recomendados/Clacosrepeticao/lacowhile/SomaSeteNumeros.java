package exercicios.recomendados.Clacosrepeticao.lacowhile;

import java.util.Scanner;

public class SomaSeteNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int c = 1;
        int soma = 0;

        while (c <= 7) {
            System.out.println("Digite o " + c + "° valor:");
            int num = scan.nextInt();

            soma += num;
            c++;
        }

        System.out.println("Soma dos números: " + soma);
    }
}

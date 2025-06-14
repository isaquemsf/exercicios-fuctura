package exercicios.aulas.maiornumero;

import java.util.Scanner;

public class MaiorNumMenorNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Informe o segundo valor:");
        int valor2 = scanner.nextInt();

        System.out.println("Informe o terceiro valor:");
        int valor3 = scanner.nextInt();

        System.out.println("Informe o quarto valor:");
        int valor4 = scanner.nextInt();

//        int maiorNum = valor1;
//        int menorNum = valor1;


        //opcao 1
//        if (valor2 > maiorNum) {
//            maiorNum = valor2;
//        }
//        if (valor3 > maiorNum) {
//            maiorNum = valor3;
//        }
//        if (valor4 > maiorNum) {
//            maiorNum = valor4;
//        }
//
//        if (valor2 < menorNum) {
//            menorNum = valor2;
//        }
//        if (valor3 < menorNum) {
//            menorNum = valor3;
//        }
//        if (valor4 < menorNum) {
//            menorNum = valor4;
//        }

        //opcao 2
        int maior = Math.max(valor1, Math.max(valor2, Math.max(valor3, valor4)));
        int menor = Math.min(valor1, Math.min(valor2, Math.min(valor3, valor4)));

        int diferenca = maior - menor;

        System.out.println("maior numero " + maior);
        System.out.println("menor numero " + menor);
        System.out.println("diferença numero " + diferenca);
    }
}

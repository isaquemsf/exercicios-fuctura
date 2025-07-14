package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Acomparanumeros;

import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        int num1 = scan.nextInt();

        System.out.println("Informe o segundo valor:");
        int num2 = scan.nextInt();

        int maior = 0;
        String mensagem;

        if (num1 > num2) {
            maior = num1;
            mensagem = "O primeiro valor é o maior";
        } else if (num2 > num1) {
            maior = num2;
            mensagem = "O segundo valor é o maior";
        } else  {
            mensagem = "Não existe valor maior, os dois são iguais";
        }

        System.out.println(mensagem);
    }
}

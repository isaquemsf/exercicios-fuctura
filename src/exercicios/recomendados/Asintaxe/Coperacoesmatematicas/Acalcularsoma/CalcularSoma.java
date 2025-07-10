package exercicios.recomendados.Asintaxe.Coperacoesmatematicas.Acalcularsoma;

import java.util.Scanner;

public class CalcularSoma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        int valor1 = scan.nextInt();

        System.out.println("Informe o segundo valor:");
        int valor2 = scan.nextInt();

        int soma = valor1 + valor2;

        System.out.println("Soma dos valores [" + valor1 + "] e [" + valor2 + "] " +
                "é = " + soma);
    }
}

package exercicios.recomendados.Asintaxe.Dsequenciasbasicas.Pdesafio;

import java.util.Scanner;

public class CalculoTempoDeVida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos cigarros você fuma por dia:");
        int qntCigarrosPorDia = scanner.nextInt();

        System.out.println("Informe a quantos anos você fuma:");
        double anosFumando = scanner.nextDouble();

        int diasFumando = (int) (anosFumando * 365);
        int totalCigarros = diasFumando * qntCigarrosPorDia;
        int minutosPerdidos = totalCigarros * 10;
        int minutosDoDia = 24 * 60;
        int diasPerdidos = minutosPerdidos / minutosDoDia;

        System.out.println("Dias perdidos: " + diasPerdidos);
    }
}

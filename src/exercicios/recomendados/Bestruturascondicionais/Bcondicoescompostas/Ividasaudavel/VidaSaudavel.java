package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Ividasaudavel;

import java.util.Scanner;

public class VidaSaudavel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas horas de atividade física você teve neste mês?");
        int horasAtvFisicas = scan.nextInt();

        int pontos = 0;
        double valorPonto = 0.05;
        double valorFaturado = 0.0;

        if (horasAtvFisicas < 10) {
            pontos = horasAtvFisicas * 2;
        } else if (horasAtvFisicas <= 20) {
            pontos = horasAtvFisicas * 5;
        } else {
            pontos = horasAtvFisicas * 10;
        }

        valorFaturado = pontos * valorPonto;

        System.out.printf("""
                RELATÓRIO
                
                - Horas de atv. física: %d
                - Total de pontos: %d
                - Valor faturado: R$ %.2f
                """, horasAtvFisicas, pontos, valorFaturado);
    }
}

package exercicios.recomendados.Bestruturascondicionais.Acondicoesbasicas.Hcalcularcorridauber;

import java.util.Scanner;

public class DevUber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a distância percorrida em Km:");
        double quilometros = scan.nextDouble();

        double precoPassagem = 0.0;

        if (quilometros <= 200) {
            precoPassagem = quilometros * 0.50;
        } else {
            precoPassagem = quilometros * 0.45;
        }

        System.out.printf("Valor da corrida: %.2f", precoPassagem);
    }
}

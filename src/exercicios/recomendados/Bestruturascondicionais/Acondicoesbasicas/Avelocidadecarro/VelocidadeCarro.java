package exercicios.recomendados.Bestruturascondicionais.Acondicoesbasicas.Avelocidadecarro;

import java.util.Scanner;

public class VelocidadeCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a velocidade do carro:");
        int velocidadeCarro = scanner.nextInt();

        int velocidadeLimite = 80;
        double valorMulta = (velocidadeCarro - velocidadeLimite) * 5;

        if (velocidadeCarro > velocidadeLimite) {
            System.out.println("Velocidade excedida! Você foi multado.");
            System.out.printf("Valor da multa: R$ %.2f", valorMulta);
        }
    }
}

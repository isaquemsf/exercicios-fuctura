package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Haluguelcarros;

import java.util.Scanner;

public class AluguelCarros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tipo do carro alugado:\n" +
                "1 - CARRO POPULAR | 2 - CARRO DE LUXO");
        int opcaoCarro = scan.nextInt();

        System.out.println("Por quantos dias o carro foi alugado?");
        int diasAlugados = scan.nextInt();

        System.out.println("Informe quantos quilometros foram percorridos:");
        double kmsPercorridos = scan.nextDouble();

        double diariaCarroPopular = 90.0;
        double diariaCarroLuxo = 150.0;
        double valorDiasAlugados = 0.0;
        double valorKmsPercorridos = 0.0;
        double valorTotal = 0.0;
        String dados = "";

        if (opcaoCarro == 1) {
            valorDiasAlugados = diasAlugados * diariaCarroPopular;

            if (kmsPercorridos <= 100) {
                valorKmsPercorridos = kmsPercorridos * 0.20;
            } else {
                valorKmsPercorridos = kmsPercorridos * 0.10;
            }

            valorTotal = valorDiasAlugados + valorKmsPercorridos;

            dados = """
                FATURAMENTO:
                - Valor do aluguel: R$ %.2f
                - Dias alugados: %d dia(s)
                - Valor total do aluguel: R$ %.2f
                - KMs Percorridos: %.2fkm
                - Valor total dos Kms percorridos: R$ %.2f
                
                VALOR TOTAL: R$ %.2f
                """.formatted(diariaCarroPopular, diasAlugados, valorDiasAlugados,
                    kmsPercorridos, valorKmsPercorridos, valorTotal);
        } else if (opcaoCarro == 2) {
            valorDiasAlugados = diasAlugados * diariaCarroLuxo;

            if (kmsPercorridos <= 200) {
                valorKmsPercorridos = kmsPercorridos * 0.30;
            } else {
                valorKmsPercorridos = kmsPercorridos * 0.25;
            }

            valorTotal = valorDiasAlugados + valorKmsPercorridos;

            dados = """
                FATURAMENTO:
                - Valor do aluguel: R$ %.2f
                - Dias alugados: %d dia(s)
                - Valor total do aluguel: R$ %.2f
                - KMs Percorridos: %.2fkm
                - Valor total dos Kms percorridos: R$ %.2f
                
                VALOR TOTAL: R$ %.2f
                """.formatted(diariaCarroLuxo, diasAlugados, valorDiasAlugados,
                    kmsPercorridos, valorKmsPercorridos, valorTotal);
        }

        System.out.println(dados);
    }
}

package exercicios.introducao.tematicos.Amodulo.DContaluz;

import java.util.Scanner;

public class ContaLuzDonaCida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de kWh consumidos:");
        double kWhConsumidos = scanner.nextDouble();

        double precokWh = 0.74;
        double taxaMinimakWh = 30;

        double valorConta = kWhConsumidos * precokWh;
        double valorContaMinima = taxaMinimakWh * precokWh;

        String mensagem ="";

        if (kWhConsumidos <= taxaMinimakWh) {
            mensagem = """
                    
                    NEOENERGIA PERNAMBUCO
                    
                    Titular: Dona Cida
                    
                    Relatório de Consumo:
                    - Valor kWh: R$%.2f
                    - Taxa mínima de kWh: 30kWh
                    - Quantidade de kWh consumidos: %.1fkWh
                    - Valor Total da Conta: R$%.2f
                    """.formatted(precokWh, kWhConsumidos, valorContaMinima);
        } else {
            mensagem = """
                    30
                    NEOENERGIA PERNAMBUCO
                    
                    Titular: Dona Cida
                    
                    Relatório de Consumo:
                    - Valor kWh: R$%.2f
                    - Taxa mínima de kWh: 30kWh
                    - Quantidade de kWh consumidos: %.1fkWh
                    - Valor Total da Conta: R$%.2f
                    """.formatted(precokWh, kWhConsumidos, valorConta);
        }

        System.out.println(mensagem);
    }
}

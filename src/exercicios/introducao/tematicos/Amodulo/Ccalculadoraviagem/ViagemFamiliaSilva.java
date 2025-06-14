package exercicios.introducao.tematicos.Amodulo.Ccalculadoraviagem;

import java.util.Scanner;

public class ViagemFamiliaSilva {
    public static void main(String[] args) {
        /*A família Silva vai fazer uma viagem de carro e quer saber quanto vai gastar.
          Escreva um programa que receba o número de quilômetros da viagem, o preço médio
          do litro de gasolina e o consumo do carro (km/L), e exiba o valor total que
          será gasto com combustível.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de quilômetros da viagem:");
        double numKmViagem = scanner.nextDouble();

        System.out.println("Informe o preço médio do litro de gasolina:");
        double precoMedioGasolina = scanner.nextDouble();

        System.out.println("Informe o consumo do carro (Km/L):");
        double kmByLitro = scanner.nextDouble();

        double litrosNecessarios = numKmViagem / kmByLitro;
        double valorGastoGasosa = litrosNecessarios * precoMedioGasolina;

        System.out.printf("Valor total gasto com combustível: R$%.2f", valorGastoGasosa);
    }
}

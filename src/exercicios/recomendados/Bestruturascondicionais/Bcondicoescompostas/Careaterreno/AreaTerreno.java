package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Careaterreno;

import java.util.Scanner;

public class AreaTerreno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a largura do terreno:");
        double largura = scan.nextDouble();

        System.out.println("Informe o comprimento do terreno:");
        double comprimento = scan.nextDouble();

        double areaMetrosQuadrados = largura * comprimento;
        String classificacao;

        if (areaMetrosQuadrados < 100) {
            classificacao = "TERRENO POPULAR";
        } else if (areaMetrosQuadrados <= 500) {
            classificacao = "TERRENO MASTER";
        } else {
            classificacao = "TERRENO VIP";
        }

        System.out.println("Área do terreno em m²: " + areaMetrosQuadrados + "m² | " + classificacao);
    }
}

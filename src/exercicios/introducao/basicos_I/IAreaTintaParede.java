package exercicios.introducao.basicos_I;

import java.util.Scanner;

public class IAreaTintaParede {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a altura da parede (em metros):");
        double altura = scanner.nextDouble();

        System.out.println("Informe a largura da parede (em metros):");
        double largura = scanner.nextDouble();

        double areaPorLitroTinta = 2;
        double areaParede = altura * largura;
        double quantLitrosTinta = areaParede / areaPorLitroTinta;

        System.out.printf("ÁREA DA PAREDE: %.1fm²%n", areaParede);
        System.out.printf("COBERTURA DA ÁREA POR LITRO DE TINTA: %.1fm²%n", areaPorLitroTinta);
        System.out.printf("LITROS DE TINTA NECESSÁRIOS: %.1f LITROS", quantLitrosTinta);

    }
}

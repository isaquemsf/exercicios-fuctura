package exercicios.introducao.basicos_II;

import java.util.Scanner;

public class IConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da temperatura (em graus °C):");
        double tempCelsius = scanner.nextDouble();

        System.out.println("Selecione para qual grau você deseja converter:\n" +
                "1 - Graus Fahrenheit | 2 - Graus Kelvin");
        int selecao = scanner.nextInt();

        double toFahrenheit = (tempCelsius * 9/5) + 32;
        double toKelvin = tempCelsius + 273.15;

        switch (selecao) {
            case 1 -> {
                System.out.println("OPÇÃO SELECIONADA: CELSIUS PARA FAHRENHEIT:");
                System.out.printf("%.1f°C equivale a %.1f°F", tempCelsius, toFahrenheit);
            }
            case 2 -> {
                System.out.println("OPÇÃO SELECIONADA: CELSIUS PARA KELVIN:");
                System.out.printf("%.1f°C equivale a %.2fK", tempCelsius, toKelvin);
            }
            default -> System.out.println("OPÇÃO INVÁLIDA!");
        }
    }
}

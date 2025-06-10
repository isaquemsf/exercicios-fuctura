package exercicios_introducao.condicional;

import java.util.Scanner;

public class CConversorMedidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a unidade de medida que atual:\n" +
                "CM - Centímetros | M - Metros | KM - Quilômetros");
        String unidadeMedida = scanner.next().toUpperCase();

        switch (unidadeMedida) {
            case "M" -> {
                System.out.println("Informe o valor em metros:");
                double metros = scanner.nextDouble();

                System.out.println("Informe para qual unidade de medida você deseja converter:\n" +
                        "CM - Centímetros | KM - Quilômetros");
                String conversor = scanner.next().toUpperCase();

                switch (conversor) {
                    case "CM" -> {
                        double metroToCM = metros * 1000;
                        System.out.printf("%.1f metros equivalem a %.1f centímetros.", metros, metroToCM);
                    }
                    case "KM" -> {
                        double metroToKM = metros / 1000;
                        System.out.printf("%.1f metros equivalem a %.2f quilômetros.", metros, metroToKM);
                    }
                    default -> System.out.println("Insira uma opção válida.");
                }
            }

            case "CM" -> {
                System.out.println("Informe o valor em centímetros:");
                double centimetros = scanner.nextDouble();

                System.out.println("Informe para qual unidade de medida você deseja converter:\n" +
                        "M - Metros | KM - Quilômetros");
                String conversor = scanner.next().toUpperCase();

                switch (conversor) {
                    case "M" -> {
                        double centimetrosToM = centimetros / 100;
                        System.out.printf("%.1f centímetros equivalem a %.1f metros.", centimetros, centimetrosToM);
                    }
                    case "KM" -> {
                        double centimetrosToKM = centimetros / 100000;
                        System.out.printf("%.1f metros equivalem a %.1f quilômetros.", centimetros, centimetrosToKM);
                    }
                    default -> System.out.println("Insira uma opção válida.");
                }
            }

            case "KM" -> {
                System.out.println("Informe o valor em quilômetros:");
                double quilometros = scanner.nextDouble();

                System.out.println("Informe para qual unidade de medida você deseja converter:\n" +
                        "CM - Centímetros | M - Metros");
                String conversor = scanner.next().toUpperCase();

                switch (conversor) {
                    case "M" -> {
                        double quilometrosToM = quilometros * 1000;
                        System.out.printf("%.1f quilômetros equivalem a %.1f metros.", quilometros, quilometrosToM);
                    }
                    case "CM" -> {
                        double quilometrosToCM = quilometros * 100000;
                        System.out.printf("%.1f quilômetros equivalem a %.1f centímetros.", quilometros, quilometrosToCM);
                    }
                    default -> System.out.println("Insira uma opção válida.");
                }
            }
        }
    }
}

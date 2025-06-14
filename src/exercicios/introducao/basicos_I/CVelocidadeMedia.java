package exercicios.introducao.basicos_I;

import java.util.Scanner;

public class CVelocidadeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a distancia percorrida pelo carro (em Km):");
        double distanciaKm = scanner.nextInt();

        System.out.println("Informe o tempo gasto no percurso (em horas):");
        double horasGastas = scanner.nextInt();

        double horasParaSegundos = horasGastas * 3600;
        double kmParaMetros = distanciaKm * 1000;
        double velocidadeMedia = kmParaMetros / horasParaSegundos;

        System.out.printf("A velocidade média do carro foi de: %.2fm/s", velocidadeMedia);
    }
}

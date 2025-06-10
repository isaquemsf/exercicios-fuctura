package exercicios_introducao.condicional;

import java.util.Scanner;

public class ASemaforo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a situação do semáforo:\n" +
                "0 - VERMELHO | 1 - VERDE | 2 - AMARELO");
        int semaforo = scanner.nextInt();

        switch (semaforo) {
            case 0 -> System.out.println("SEMÁFORO VERMELHO.\nPARE!");
            case 1 -> System.out.println("SEMÁFORO VERDE.\nSIGA!");
            case 2 -> System.out.println("SEMÁFORO AMARELO.\nATENÇÃO!");
            default -> System.out.println("Insira um dos valores requisitados.");
        }
    }
}

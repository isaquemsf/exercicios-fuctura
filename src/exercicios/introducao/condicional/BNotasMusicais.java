package exercicios.introducao.condicional;

import java.util.Scanner;

public class BNotasMusicais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota musical (A, B, C, D, E, F ou G):");
        String notaMusical = scanner.next().toUpperCase();

        double frequencia = 0;

        switch (notaMusical) {
            case "A" -> {
                System.out.println("Lá");
                frequencia = 440.0;
                System.out.println("Frequência: " + frequencia);
            }
            case "B" -> {
                System.out.println("Si");
                frequencia = 493.88;
                System.out.println("Frequência: " + frequencia);
            }
            case "C" -> {
                System.out.println("Dó");
                frequencia = 523.25;
                System.out.println("Frequência: " + frequencia);
            }
            case "D" -> {
                System.out.println("Ré");
                frequencia = 587.33;
                System.out.println("Frequência: " + frequencia);
            }
            case "E" -> {
                System.out.println("Mi");
                frequencia = 659.25;
                System.out.println("Frequência: " + frequencia);
            }
            case "F" -> {
                System.out.println("Fá");
                frequencia = 698.46;
                System.out.println("Frequência: " + frequencia);
            }
            case "G" -> {
                System.out.println("Sol");
                frequencia = 392.0;
                System.out.println("Frequência: " + frequencia);
            }
            default -> System.out.println("Insira uma entrada válida.");
        }
    }
}

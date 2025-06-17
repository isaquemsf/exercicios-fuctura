package exercicios.introducao.tematicos.Cmodulo.Etabuada;

import java.util.Scanner;

public class TabuadaNumQualquer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número que você deseja saber a tabuada:");
        int num = scanner.nextInt();

        int resultado = 0;

        for(int i = 0; i <= 10; i++) {
            resultado = num * i;
            System.out.printf("%d X %d = %d%n", num, i, resultado);
        }
    }
}

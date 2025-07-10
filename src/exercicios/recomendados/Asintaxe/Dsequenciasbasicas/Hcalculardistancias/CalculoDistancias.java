package exercicios.recomendados.Asintaxe.Dsequenciasbasicas.Hcalculardistancias;

import java.util.Scanner;

public class CalculoDistancias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a distancia em metros:");
        double metros = scanner.nextDouble();

        double metroParaKm = metros / 1000;
        double metroParaHm = metros / 100;
        double metroParaDam = metros / 10;
        double metroParaDm = metros * 10;
        double metroParaCm = metros * 100;
        double metroParaMm = metros * 1000;

        System.out.printf("""
                A distância de %.1fm corresponde a:
                %.2fkm --- %.2fhm
                %.2fdam --- %.2fdm
                %.2fcm --- %.2fmm
                """, metros, metroParaKm, metroParaHm, metroParaDam, metroParaDm,
                metroParaCm, metroParaMm
        );
    }
}

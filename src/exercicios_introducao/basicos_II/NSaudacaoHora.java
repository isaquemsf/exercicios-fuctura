package exercicios_introducao.basicos_II;

import java.util.Scanner;

public class NSaudacaoHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a hora atual:");
        int hora = scanner.nextInt();

        String saudacao = "HORÁRIO: " + hora + "h. ";

        switch (hora) {
            case 0,1,2,3 -> System.out.println(saudacao + "Boa madrugada.");
            case 4,5,6,7,8,9,10,11 -> System.out.println(saudacao + "Bom dia!");
            case 12 -> System.out.println(saudacao + "Meio-dia");
            case 13,14,15,16,17 -> System.out.println(saudacao + "Boa tarde!");
            case 18,19,20,21,22,23 -> System.out.println(saudacao + "Boa noite!");
            default -> System.out.println("Informe um horário válido!");
        }
    }
}

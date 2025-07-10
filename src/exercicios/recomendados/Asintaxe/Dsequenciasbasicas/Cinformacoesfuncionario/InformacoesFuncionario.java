package exercicios.recomendados.Asintaxe.Dsequenciasbasicas.Cinformacoesfuncionario;

import java.util.Scanner;

public class InformacoesFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe seu salário:");
        double salario = scanner.nextDouble();

        System.out.printf("""
                Nome do funcionário: %s
                Salário: R$ %.2f
                
                O funcionário %s tem um salário de R$ %.2f
                """, nome, salario, nome, salario);
    }
}

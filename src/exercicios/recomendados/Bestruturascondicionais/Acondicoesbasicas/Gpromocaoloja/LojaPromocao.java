package exercicios.recomendados.Bestruturascondicionais.Acondicoesbasicas.Gpromocaoloja;

import java.util.Scanner;

public class LojaPromocao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = scan.nextLine();

        System.out.println("Informe seu gênero");
        String genero = scan.nextLine().toUpperCase();

        System.out.println("Informe o valor das compras:");
        double valorCompras = scan.nextDouble();

        double descontoHomens = 5.0/100;
        double descontoMulheres = 13.0/100;
        double valorDesconto = 0.0;

        System.out.printf("Valor da compra: R$ %.2f%n", valorCompras);

        if (genero.charAt(0) == 'M') {
            valorDesconto = valorCompras * descontoHomens;
        } else if (genero.charAt(0) == 'F') {
            valorDesconto = valorCompras * descontoMulheres;
        }
        valorCompras -= valorDesconto;

        System.out.println("Desconto aplicado com sucesso!");
        System.out.printf("Valor da compra atualizado: R$ %.2f", valorCompras);
    }
}

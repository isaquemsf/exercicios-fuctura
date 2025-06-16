package exercicios.introducao.tematicos.Bmodulo.Bdescontomercado;

import java.util.Scanner;

public class FeiraDescontoMixTadeu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos comprados:");
        int quantProdutos = scanner.nextInt();

        System.out.println("Informe o valor total da compra:");
        double valorTotalCompra = scanner.nextDouble();

        double porcentDesconto = 0;
        double valorPorcentDesc = 0;
        double totalComDesconto = 0;

        if (quantProdutos > 0 && quantProdutos <= 5) {
            System.out.println("Quantidade insuficiente para aplicação de desconto.");
        } else if (quantProdutos <= 10) {
            porcentDesconto = 0.05;
            valorPorcentDesc = valorTotalCompra * porcentDesconto;
            totalComDesconto = valorTotalCompra - valorPorcentDesc;
            System.out.printf("""
                    Quantidade de produtos comprados: %d produto(s)
                    Valor total da compra: R$ %.2f
                    Porcentagem de desconto: %.1f
                    Valor do desconto (em R$): %.2f
                    Valor total com desconto: R$%.2f
                    """, quantProdutos, valorTotalCompra, (porcentDesconto*100), valorPorcentDesc, totalComDesconto);
        } else {
            porcentDesconto = 0.1;
            valorPorcentDesc = valorTotalCompra * porcentDesconto;
            totalComDesconto = valorTotalCompra - valorPorcentDesc;
            System.out.printf("""
                    Quantidade de produtos comprados: %d produto(s)
                    Valor total da compra: R$ %.2f
                    Porcentagem de desconto: %.1f
                    Valor do desconto (em R$): %.2f
                    Valor total com desconto: R$%.2f
                    """, quantProdutos, valorTotalCompra, (porcentDesconto*100), valorPorcentDesc, totalComDesconto);
        }
    }
}

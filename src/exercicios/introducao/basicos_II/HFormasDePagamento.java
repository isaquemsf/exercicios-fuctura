package exercicios.introducao.basicos_II;

import java.util.Scanner;

public class HFormasDePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do produto:");
        double valorProduto = scanner.nextDouble();

        System.out.println("Selecione a forma de pagamento:\n" +
                "1 - Em espécie | 2 - Cartão de Crédito | 3 - Cartão de Débito");
        int formaPagamento = scanner.nextInt();

        double porcentDesconto = 0.1;
        double valorDesconto = valorProduto * porcentDesconto;
        double valorTotalCompra = valorProduto - valorDesconto;

        switch (formaPagamento) {
            case 1,3 -> {
                System.out.printf("VALOR DO PRODUTO: R$%.2f%n", valorProduto);
                System.out.println("FORMA DE PAGAMENTO: EM ESPÉCIE/CARTÃO DE DÉBITO");
                System.out.printf("VALOR TOTAL DA COMPRA: R$%.2f", valorTotalCompra);
            }
            case 2 -> {
                System.out.printf("VALOR DO PRODUTO: R$%.2f%n", valorProduto);
                System.out.println("FORMA DE PAGAMENTO: CARTÃO DE CRÉDITO");
                System.out.printf("VALOR TOTAL DA COMPRA: R$%.2f", valorProduto);
            }
            default -> System.out.println("Por favor, selecione uma das opções acima.");
        }
    }
}

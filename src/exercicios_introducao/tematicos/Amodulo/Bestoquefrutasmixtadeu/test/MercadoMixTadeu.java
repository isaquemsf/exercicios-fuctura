package exercicios_introducao.tematicos.Amodulo.Bestoquefrutasmixtadeu.test;

import exercicios_introducao.tematicos.Amodulo.Bestoquefrutasmixtadeu.model.Fruta;

import java.util.Scanner;

public class MercadoMixTadeu {
    public static void main(String[] args) {

        /* No Mercado Mix Tadeu, a seção de frutas precisa registrar o tipo de cada fruta,
          a quantidade em estoque, o preço por quilo e uma informação booleana que
          indique se a fruta está na promoção ou não.
          Escreva um programa que registre esses dados para quatro frutas diferentes e exiba
          uma tabela com as informações para o gerente. */
        Scanner scanner = new Scanner(System.in);

        Fruta fruta1 = new Fruta();
        Fruta fruta2 = new Fruta();
        Fruta fruta3 = new Fruta();
        Fruta fruta4 = new Fruta();

        Fruta[] frutas = {fruta1, fruta2, fruta3, fruta4};

        System.out.println("-----------------------------------");
        System.out.println("         MERCADO MIX TADEU         ");
        System.out.println("-----------------------------------");
        System.out.println();

        for (Fruta fruta : frutas) {
            System.out.println("Informe o tipo da fruta:");
            String tipoFruta = scanner.next();
            fruta.setTipo(tipoFruta);

            System.out.println("Informe a quantidade em estoque da fruta:");
            int quantEstoqueFruta = scanner.nextInt();
            fruta.setQuantEstoque(quantEstoqueFruta);

            System.out.println("Informe o preço por quilo da fruta:");
            double precoFruta = scanner.nextDouble();
            fruta.setPrecoByKg(precoFruta);

            System.out.println("Informe se a fruta está em promoção: (S/N)");
            String snPromocao = scanner.next();
            if (snPromocao.equalsIgnoreCase("S")) {
                fruta.setEmPromocao(true);
            } else if (snPromocao.equalsIgnoreCase("N")) {
                fruta.setEmPromocao(false);
            } else {
                System.out.println("Insira uma opção válida!");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");
        System.out.println("        RELATÓRIO DE ESTOQUE       ");
        System.out.println("-----------------------------------");
        System.out.println();

        for (Fruta fruta : frutas) {
            fruta.imprimeRelatorio();
        }
    }
}

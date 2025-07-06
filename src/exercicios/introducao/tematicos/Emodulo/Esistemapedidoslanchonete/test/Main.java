package exercicios.introducao.tematicos.Emodulo.Esistemapedidoslanchonete.test;

import exercicios.introducao.tematicos.Emodulo.Esistemapedidoslanchonete.dominio.Pedido;
import exercicios.introducao.tematicos.Emodulo.Esistemapedidoslanchonete.dominio.Produto;

public class Main {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 4.90);
        Produto feijao = new Produto("Feijão", 6.00);
        Produto acucar = new Produto("Açucar", 5.00);
        Produto macarrao = new Produto("Macarrão", 3.20);

        Pedido pedido = new Pedido();

        pedido.adicionarProduto(arroz);
        pedido.adicionarProduto(feijao);
        pedido.adicionarProduto(acucar);
        pedido.adicionarProduto(macarrao);

        pedido.listarProdutos();
    }
}

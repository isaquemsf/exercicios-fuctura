package exercicios.introducao.tematicos.Emodulo.Esistemapedidoslanchonete.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        System.out.println("Lista de produtos:");
        for (Produto produto : produtos) {
            if (produto != null) {
                produto.exibirInfo();
                System.out.println("-----------");
            }
        }
        System.out.println("Total de produtos: " + produtos.size());
    }
}

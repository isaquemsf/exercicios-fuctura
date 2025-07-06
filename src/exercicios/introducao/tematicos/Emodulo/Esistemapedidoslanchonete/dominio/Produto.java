package exercicios.introducao.tematicos.Emodulo.Esistemapedidoslanchonete.dominio;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}

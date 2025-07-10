package exercicios.recomendados.Asintaxe.Dsequenciasbasicas.Ldescontoproduto;

public class DescontoProduto {
    public static void main(String[] args) {
        double precoProduto = 100.00;
        double desconto = 5.0/100.0;
        double valorDesconto = precoProduto * desconto;
        double precoPromocional = precoProduto - valorDesconto;

        System.out.printf("""
                Valor do Produto: R$ %.2f
                Porcentagem de desconto: %.1f
                Valor do desconto: R$ %.2f
                Preço promocional: R$ %.2f
                """, precoProduto, (desconto * 100), valorDesconto, precoPromocional
        );
    }
}

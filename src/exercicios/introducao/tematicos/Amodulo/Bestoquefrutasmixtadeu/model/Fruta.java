package exercicios.introducao.tematicos.Amodulo.Bestoquefrutasmixtadeu.model;

public class Fruta {
    private String tipo;
    private int quantEstoque;
    private double precoByKg;
    private boolean emPromocao = false;

    public void imprimeRelatorio() {
        System.out.println("TIPO DA FRUTA: " + tipo);
        System.out.println("QUANTIDADE EM ESTOQUE: " + quantEstoque);
        System.out.printf("PREÇO POR KG: R$%.2f%n", precoByKg);
        if (emPromocao) {
            System.out.println("FRUTA EM PROMOÇÃO? SIM.");
        } else {
            System.out.println("FRUTA EM PROMOÇÃO? NÃO.");
        }
        System.out.println();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public double getPrecoByKg() {
        return precoByKg;
    }

    public void setPrecoByKg(double precoByKg) {
        this.precoByKg = precoByKg;
    }

    public boolean isEmPromocao() {
        return emPromocao;
    }

    public void setEmPromocao(boolean emPromocao) {
        this.emPromocao = emPromocao;
    }
}

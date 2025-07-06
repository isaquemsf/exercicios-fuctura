package exercicios.introducao.tematicos.Emodulo.Cveiculosdafrota.dominio;

public class Carro extends Veiculo {
    public Carro(String marca, int ano) {
        super(marca, ano);
    }

    public void abrirMala() {
        System.out.println("Porta malas aberto");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }
}

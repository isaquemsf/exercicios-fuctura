package exercicios.introducao.tematicos.Emodulo.Cveiculosdafrota.dominio;

public class Moto extends Veiculo {
    public Moto(String marca, int ano) {
        super(marca, ano);
    }

    public void empinar() {
        System.out.println("Empinando moto");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }
}

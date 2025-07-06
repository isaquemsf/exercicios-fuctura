package exercicios.introducao.tematicos.Emodulo.Bpoupancabamerindus.dominio;

public class ContaPoupanca extends ContaBancaria {
    private double juros = 0.1;
    private double valorJuros = 0.0;
    private double saldoAtualizado = 0.0;

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    public void calcularJuros() {
        valorJuros = super.getSaldo() * juros;
        saldoAtualizado = super.getSaldo() - valorJuros;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Valor dos Juros - " + valorJuros);
        System.out.println("Saldo atualizado - " + saldoAtualizado);
    }
}

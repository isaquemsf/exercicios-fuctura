package exercicios.introducao.tematicos.Emodulo.Bpoupancabamerindus.dominio;

public class ContaBancaria {
    private String titular;
    private double saldo = 0.0;
    private double saldoDepositado = 0.0;
    private double saldoSacado = 0.0;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldoDepositado = valor;
        saldo += saldoDepositado;
        System.out.println("Depósito efetuado com sucesso");
    }

    public void sacar(double valor) {
        saldoSacado = valor;
        saldo -= saldoSacado;
        System.out.println("Saque efetuado com sucesso");
    }

    public void exibirInfo() {
        System.out.println("Titular - " + titular);
        System.out.printf("Saldo - R$ %.2f%n", saldo);
        System.out.printf("Saldo Depositado - R$ %.2f%n", saldoDepositado);
        System.out.printf("Saldo Sacado - R$ %.2f%n", saldoSacado);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}

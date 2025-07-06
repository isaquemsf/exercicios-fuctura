package exercicios.introducao.tematicos.Emodulo.Bpoupancabamerindus.test;

import exercicios.introducao.tematicos.Emodulo.Bpoupancabamerindus.dominio.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Junior", 5000);

        contaPoupanca.depositar(5000);
        contaPoupanca.sacar(2000);
        contaPoupanca.calcularJuros();

        contaPoupanca.exibirInfo();
    }
}

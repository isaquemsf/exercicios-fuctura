package exercicios.recomendados.Asintaxe.Coperacoesmatematicas.Hcalcularprecounitario;

public class CalcularPrecoUnitario {
    public static void main(String[] args) {
        double valorTotal = 100.0;
        int quantidade = 32;

        double precoUnidade = valorTotal / quantidade;

        System.out.printf("Valor da unidade: R$ %.2f", precoUnidade);
    }
}

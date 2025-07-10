package exercicios.recomendados.Asintaxe.Dsequenciasbasicas.Nlocadoradecarros;

public class LocadoraDeCarros {
    public static void main(String[] args) {
        double quantKmRodados = 100.0;
        int quantDiasAlugado = 7;
        double valorDiarioCarro = 90.0;
        double valorKmRodados = 0.20;

        double valorEmDias = quantDiasAlugado * valorDiarioCarro;
        double valorEmKms = quantKmRodados * valorKmRodados;

        double valorTotal = valorEmDias + valorEmKms;

        System.out.println("Valor total dos dias: R$ " + valorEmDias);
        System.out.println("Valor total dos quilometros: R$ " + valorEmKms);
        System.out.println("Valor total: R$ " + valorTotal);
    }
}

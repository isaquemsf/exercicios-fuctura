package exercicios.recomendados.Asintaxe.Coperacoesmatematicas.Dcalculartroco;

public class CalcularTroco {
    public static void main(String[] args) {
        double valorItem = 10;
        double valorNota =  50;

        double troco = valorNota - valorItem;

        System.out.printf("Troco da compra: R$ %.2f", troco);
    }
}

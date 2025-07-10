package exercicios.recomendados.Asintaxe.Dsequenciasbasicas.Jcalculararea;

public class CalcularAreaParede {
    public static void main(String[] args) {
        double altura = 2.0;
        double largura = 2.0;
        double area = altura * largura;

        double areaPorLitroTinta = 2.0;
        int quantTinta = (int) (area / areaPorLitroTinta);

        System.out.printf("""
                Área a ser pintada: %.2f
                Quantidade de tinta necessária: %d
                """, area, quantTinta);
    }
}

package exercicios.recomendados.Asintaxe.Dsequenciasbasicas.Gcalcularnumero;

public class DobroTercaParte {
    public static void main(String[] args) {
        double num = 46;
        double dobroNum = num * 2;
        double tercaParte = num / 3;

        System.out.printf("""
                Número: %.1f
                Dobro: %.1f
                Terça parte: %f
                """, num, dobroNum, tercaParte);
    }
}

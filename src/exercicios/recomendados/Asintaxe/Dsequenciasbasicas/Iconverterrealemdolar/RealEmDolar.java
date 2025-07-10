package exercicios.recomendados.Asintaxe.Dsequenciasbasicas.Iconverterrealemdolar;

public class RealEmDolar {
    public static void main(String[] args) {
        double valorEmReal = 350.00;
        double realEmDolar = valorEmReal / 4.95;

        System.out.printf("Você pode comprar US$ %.2f", realEmDolar);
    }
}

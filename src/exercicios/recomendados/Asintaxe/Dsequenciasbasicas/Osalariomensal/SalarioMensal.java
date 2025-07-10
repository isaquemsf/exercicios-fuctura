package exercicios.recomendados.Asintaxe.Dsequenciasbasicas.Osalariomensal;

public class SalarioMensal {
    public static void main(String[] args) {
        int diasTrabalhadosNoMes = 15;
        double horasPorDia = 8;
        double valorPorHora = 25.0;
        double valorPorDia = horasPorDia * valorPorHora;
        double salarioMensal = valorPorDia * diasTrabalhadosNoMes;

        System.out.println("Salário Mensal: R$ " + salarioMensal);
    }
}

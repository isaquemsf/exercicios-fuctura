package exercicios.recomendados.Asintaxe.Dsequenciasbasicas.Maumentosalario;

public class AumentoSalario {
    public static void main(String[] args) {
        double salario = 7000;
        double aumento = 15.0/100.0;
        double valorAumento = salario * aumento;
        double salarioAumentado = salario + valorAumento;

        System.out.printf("""
                Salário: R$ %.2f
                Porcentagem de aumento: %.1f
                Valor do aumento: R$ %.2f
                Salário atualizado: R$ %.2f
                """, salario, (aumento * 100), valorAumento, salarioAumentado
        );
    }
}

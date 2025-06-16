package exercicios.introducao.tematicos.Bmodulo.Edescontoacademia;

import java.util.Scanner;

public class DescontoAcademia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantas vezes por semana você treina:");
        int quantTreinoSem = scanner.nextInt();

        double mensalidade = 70;
        double porcentDesconto = 0.2;
        double valorPorcent = mensalidade * porcentDesconto;
        double mensalidadeDesconto = mensalidade - valorPorcent;

        if (quantTreinoSem > 5) {
            System.out.printf("""
                    Quantidade de treinos por semana: %d
                    Valor da mensalidade: R$ %.2f
                    Valor desconto(R$): R$ %.2f
                    Valor da mensalidade com desconto: R$ %.2f
                    """, quantTreinoSem, mensalidade, valorPorcent, mensalidadeDesconto);
        } else {
            System.out.println("Sem descontos aplicáveis.");
        }
    }
}

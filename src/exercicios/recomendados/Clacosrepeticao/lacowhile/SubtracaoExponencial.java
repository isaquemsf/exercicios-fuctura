package exercicios.recomendados.Clacosrepeticao.lacowhile;

public class SubtracaoExponencial {
    public static void main(String[] args) {
        int num = 500;
        int soma = 0;

        while (num >= 0) {
            if (num > 0) {
                System.out.print(num + " + ");
            } else {
                System.out.print(num);
            }
            soma += num;
            num -= 50;
        }

        System.out.println("\nResultado da soma: " + soma);
    }
}

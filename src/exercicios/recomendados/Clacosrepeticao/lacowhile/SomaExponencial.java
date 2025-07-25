package exercicios.recomendados.Clacosrepeticao.lacowhile;

public class SomaExponencial {
    public static void main(String[] args) {
        int num = 6;
        int soma = 0;

        while (num <= 100) {
            if (num < 100) {
                System.out.print(num + " + ");
            } else {
                System.out.print(num);
            }
            soma += num;
            num += 2;
        }

        System.out.println("\nResultado da soma: " + soma);
    }
}

package exercicios.recomendados.Clacosrepeticao.lacowhile;

import java.util.Scanner;

public class ContagemPersonalizada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor inicial:");
        int valorInicial = scan.nextInt();

        System.out.println("Digite o último valor:");
        int ultimoValor = scan.nextInt();

        System.out.println("Digite o valor do incremento:");
        int incremento = scan.nextInt();

        if (valorInicial > ultimoValor) {
            while (valorInicial >= ultimoValor) {
                System.out.print(valorInicial + " ");
                valorInicial -= incremento;
            }
        } else {
            while (valorInicial <= ultimoValor) {
                System.out.print(valorInicial + " ");
                valorInicial += incremento;
            }
        }

        System.out.println("Acabou!");
    }
}

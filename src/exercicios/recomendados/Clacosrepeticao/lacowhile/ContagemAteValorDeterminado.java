package exercicios.recomendados.Clacosrepeticao.lacowhile;

import java.util.Scanner;

public class ContagemAteValorDeterminado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valor = scan.nextInt();

        int num = 1;

        while (num <= valor) {
            System.out.print(num + " ");
            num ++;
        }

        System.out.println("Acabou!");
    }
}

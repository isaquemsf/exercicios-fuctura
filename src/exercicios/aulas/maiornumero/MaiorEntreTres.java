package exercicios.aulas.maiornumero;

import java.util.Scanner;

public class MaiorEntreTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo valor:");
        int num2 = scanner.nextInt();

        System.out.println("Informe o terceiro valor:");
        int num3 = scanner.nextInt();

        int maior = 0;

        //exemplo 1
        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        System.out.println("Numero maior " + maior);
    }
}

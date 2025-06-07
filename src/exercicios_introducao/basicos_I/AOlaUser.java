package exercicios_introducao.basicos_I;

import java.util.Scanner;

public class AOlaUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String name = scan.nextLine();

        System.out.println("Olá, " + name + "! Bem vindo ao nosso programa!");
    }
}

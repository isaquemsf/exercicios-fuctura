package exercicios.recomendados.Asintaxe.Bvariaveistiposdedados.Fnomecidade;

import java.util.Scanner;

public class NomeCidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome da cidade onde você mora:");
        String cidade = scanner.nextLine();

        System.out.println("Cidade inserida: " + cidade);
    }
}

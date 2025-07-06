package exercicios.introducao.tematicos.Dmodulo.Etopdezfilmes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TopDezFilmes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> meusFilmes = new ArrayList<>();
        int contador = 0;

        while (contador < 10) {
            System.out.println("Digite o nome do " + (contador+1) +"° filme:");
            String filme = scanner.nextLine().toUpperCase();

            meusFilmes.add(contador, filme);
            contador++;
        }

        System.out.println("\nMeu Top 10 filmes:");
        for (String filmee : meusFilmes) {
            System.out.println("- " + filmee);
        }
    }
}

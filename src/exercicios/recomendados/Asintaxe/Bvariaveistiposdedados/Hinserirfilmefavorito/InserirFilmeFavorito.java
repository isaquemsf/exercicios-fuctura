package exercicios.recomendados.Asintaxe.Bvariaveistiposdedados.Hinserirfilmefavorito;

import java.util.Scanner;

public class InserirFilmeFavorito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do seu filme favorito:");
        String filmeFav = scanner.nextLine();

        filmeFav = "Barbie";

        System.out.println("Filme favorito: " + filmeFav);
    }
}

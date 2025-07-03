package exercicios.introducao.tematicos.Dmodulo.Cmusicasfavoritas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicasFavoritasWesley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> playlist = new ArrayList<>();
        int contador = 0;

        System.out.println("""
                        MINHA PLAYLIST
                      1. Adicionar música
                    2. Ver lista de músicas
                       3. Remover música
                    """);
        int opcao = scanner.nextInt();
        scanner.nextLine();

        while (opcao > 0) {
            switch (opcao) {
                case 1 -> {
                    System.out.println("Informe o nome da música para adicionar na playlist:");
                    String musica = scanner.nextLine();
                    playlist.add(contador++, musica);
                }
                case 2 -> {
                    contador = 1;
                    for (String musica : playlist) {
                        System.out.println(contador++ + " - " + musica);
                    }
                }
                case 3 -> {
                    System.out.println("Informe o índice da música na lista para removê-la:");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    playlist.remove((indice - 1));
                }
                default -> {
                    System.out.println("Informe uma opção válida!");
                }
            }

            System.out.println("""
                        
                        MINHA PLAYLIST
                      1. Adicionar música
                    2. Ver lista de músicas
                       3. Remover música
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();
        }
    }
}

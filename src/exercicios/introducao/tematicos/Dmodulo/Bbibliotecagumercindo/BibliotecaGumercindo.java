package exercicios.introducao.tematicos.Dmodulo.Bbibliotecagumercindo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaGumercindo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> meusLivros = new ArrayList<>();

        int contador = 0;

        System.out.println("""
                O que você deseja fazer?
                1. CADASTRAR LIVRO NA LISTA
                2. REMOVER LIVRO DA LISTA
                3. EXIBIR LISTA DE LIVROS
                """);
        int escolha = scanner.nextInt();
        scanner.nextLine();

        while (escolha > 0) {
            switch (escolha) {
                case 1 -> {
                    System.out.println("Informe o nome do livro que deseja adicionar:");
                    String livro = scanner.nextLine();
                    meusLivros.add(contador, livro);
                    contador++;
                }
                case 2 -> {
                    System.out.println("Informe o índice do livro que deseja remover:");
                    int indiceLivro = scanner.nextInt();
                    meusLivros.remove((indiceLivro - 1));
                }
                case 3 -> {
                    System.out.println("Lista de livros:");
                    contador = 1;
                    for (String livro : meusLivros) {
                        System.out.println(contador++ + " - " + livro);
                    }
                }
                default -> {
                    System.out.println("Selecione uma opção válida!");
                }
            }

            System.out.println("""
                
                O que você deseja fazer?
                1. CADASTRAR LIVRO NA LISTA
                2. REMOVER LIVRO DA LISTA
                3. EXIBIR LISTA DE LIVROS
                """);
            escolha = scanner.nextInt();
            scanner.nextLine();
        }
    }
}

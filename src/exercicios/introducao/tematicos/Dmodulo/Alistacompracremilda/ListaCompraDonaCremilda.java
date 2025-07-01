package exercicios.introducao.tematicos.Dmodulo.Alistacompracremilda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompraDonaCremilda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaCompras = new ArrayList<>();
        boolean simNao = true;
        int index = 0;

        System.out.println("Deseja gerenciar sua lista de compras?");
        String resp = scanner.next().toUpperCase().trim();

        if (resp.equalsIgnoreCase("NÃO")) {
            simNao = false;
        }

        while (simNao) {
            System.out.println("""
                    O que você deseja fazer?
                    1 - Adicionar itens
                    2 - Remover itens
                    3 - Verificar lista
                    4 - Sair do sistema""");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> {
                    System.out.println("Informe o nome do item que deseja adicionar:");
                    String nomeItem = scanner.nextLine();
                    listaCompras.add(index, nomeItem);
                    System.out.println("Item adicionado com sucesso!");
                    index++;
                }
                case 2 -> {
                    System.out.println("Informe o nome do item que deseja remover:");
                    String nomeItem = scanner.nextLine().toLowerCase();
                    listaCompras.remove(nomeItem);
                    System.out.println("Item removido com sucesso!");
                }
                case 3 -> {
                    if (!listaCompras.isEmpty()) {
                        System.out.println("Lista de compras:");
                        for (String item : listaCompras) {
                            System.out.println("- " + item);
                        }
                    } else {
                        System.out.println("Lista de compras está vazia!");
                    }
                }
                case 4 -> {
                    System.out.println("Saindo do sistema...");
                    break;
                }
                default -> {
                    System.out.println("Informe uma opção válida!");
                    continue;
                }
            }

            System.out.println("Deseja gerenciar sua lista de compras?");
            resp = scanner.next().toUpperCase().trim();

            if (resp.equalsIgnoreCase("NÃO")) {
                simNao = false;
            }
        }
    }
}

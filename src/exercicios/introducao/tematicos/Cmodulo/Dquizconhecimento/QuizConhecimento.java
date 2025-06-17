package exercicios.introducao.tematicos.Cmodulo.Dquizconhecimento;

import java.util.Scanner;

public class QuizConhecimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantPerguntas = 5;
        int contadorPontos = 0;

        String[] perguntas = {"1°) Em qual continente fica a China?",
                              "2°) Quem é Anderson Silva?",
                              "3°) Qual a 8° letra do alfabeto?",
                              "4°) Quanto é 100 + 150?",
                              "5°) Quanto é 10% de 1.000?"};
        String[] respostas = {"", "", "", "", ""};
        String[] gabarito = {"Ásia", "Lutador", "H", "250", "100"};

        System.out.println("Bem-vindo ao QuizDev! Vamos começar?");
        for (int i = 0; i < quantPerguntas; i++) {
            System.out.println(perguntas[i]);
            respostas[i] = scanner.nextLine();

            if (respostas[i].equalsIgnoreCase(gabarito[i])) {
                contadorPontos++;
            }
        }

        System.out.println("\nQuantidade de acertos: " + contadorPontos);
    }
}

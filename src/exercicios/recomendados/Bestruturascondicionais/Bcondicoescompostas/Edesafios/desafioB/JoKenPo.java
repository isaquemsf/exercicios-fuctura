package exercicios.recomendados.Bestruturascondicionais.Bcondicoescompostas.Edesafios.desafioB;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int decisaoCPU = random.nextInt(1, 4);

        int partidas = 1;
        int pontuacaoCPU = 0;
        int pontuacaoJogador = 0;
        String mensagem = "";

        while (partidas <= 3) {
            System.out.println("""
                    ---------- MENU ----------
                       Selecione a sua jogada:
                             1. PEDRA
                             2. PAPEL
                             3. TESOURA
                    --------------------------
                    """);
            int decisaoJogador = scanner.nextInt();

            switch (decisaoJogador) {
                case 1:
                    if (decisaoCPU == 1) {
                        mensagem = """
                                JOGADOR:   PEDRA
                                CPU:       PEDRA
                                RESULTADO: EMPATE
                                """;
                    } else if (decisaoCPU == 2){
                        pontuacaoCPU++;
                        mensagem = """
                                JOGADOR:   PEDRA
                                CPU:       PAPEL
                                RESULTADO: CPU VENCEU
                                """;
                    } else {
                        pontuacaoJogador++;
                        mensagem = """
                                JOGADOR:   PEDRA
                                CPU:       TESOURA
                                RESULTADO: JOGADOR VENCEU
                                """;
                    }
                    break;
                case 2:
                    if (decisaoCPU == 1) {
                        pontuacaoJogador++;
                        mensagem = """
                                JOGADOR:   PAPEL
                                CPU:       PEDRA
                                RESULTADO: JOGADOR VENCEU
                                """;
                    } else if (decisaoCPU == 2){
                        mensagem = """
                                JOGADOR:   PAPEL
                                CPU:       PAPEL
                                RESULTADO: EMPATE
                                """;
                    } else {
                        pontuacaoCPU++;
                        mensagem = """
                                JOGADOR:   PAPEL
                                CPU:       TESOURA
                                RESULTADO: CPU VENCEU
                                """;
                    }
                    break;
                case 3:
                    if (decisaoCPU == 1) {
                        pontuacaoCPU++;
                        mensagem = """
                                JOGADOR:   TESOURA
                                CPU:       PEDRA
                                RESULTADO: CPU VENCEU
                                """;
                    } else if (decisaoCPU == 2){
                        pontuacaoJogador++;
                        mensagem = """
                                JOGADOR:   TESOURA
                                CPU:       PAPEL
                                RESULTADO: JOGADOR VENCEU
                                """;
                    } else {
                        mensagem = """
                                JOGADOR:   TESOURA
                                CPU:       TESOURA
                                RESULTADO: EMPATE
                                """;
                    }
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
            }
            String limpaTela = """
                    
                    
                    
                    
                    
                    
                    
                    """;
            System.out.println(limpaTela);
            System.out.println(mensagem);
            partidas++;
        }

        System.out.println("RESULTADO:");

        if (pontuacaoCPU > pontuacaoJogador) {
            System.out.println("Pontuação do Jogador: " + pontuacaoJogador);
            System.out.println("Pontuação da CPU: " + pontuacaoCPU);
            System.out.println("CPU venceu resultado geral!");
        } else if (pontuacaoJogador > pontuacaoCPU) {
            System.out.println("Pontuação do Jogador: " + pontuacaoJogador);
            System.out.println("Pontuação da CPU: " + pontuacaoCPU);
            System.out.println("Jogador venceu resultado geral!");
        } else {
            System.out.println("Pontuação do Jogador: " + pontuacaoJogador);
            System.out.println("Pontuação da CPU: " + pontuacaoCPU);
            System.out.println("Empate no resultado geral!");
        }
    }
}

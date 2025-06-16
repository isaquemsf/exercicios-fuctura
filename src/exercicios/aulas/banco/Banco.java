package exercicios.aulas.banco;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 3000;
        double saldoAtualizado = 0;
        double saldoDepositado = 0;
        double saldoSacado= 0;
        double saldoTransferido = 0;

        String mensagem = "";

        System.out.println("""
                
                ------ BEM-VINDO AO BANCO DEV ------
                
                     Selecione a opção desejada:
                
                           1. Depositar
                           2.   Sacar
                           3. Transferir
                           4.   Sair
                
                -------------------------------------
                
                """);
        int opcaoEscolhida = scanner.nextInt();

        while (opcaoEscolhida != 4) {
            switch (opcaoEscolhida) {
                case 1 -> {
                    System.out.println("Opção selecionada: Depositar\n");
                    System.out.println("Informe o valor que deseja depositar:");
                    saldoDepositado = scanner.nextDouble();

                    saldoAtualizado = saldo + saldoDepositado;
                    mensagem = """
                            
                            Depósito efetuado com sucesso.
                            
                            ------------- EXTRATO --------------
                            
                            Saldo anterior: R$%.2f
                            Valor depositado: R$ %.2f
                            Saldo atualizado: R$ %.2f
                            """.formatted(saldo, saldoDepositado, saldoAtualizado);
                    System.out.println(mensagem);
                }
                case 2 -> {
                    System.out.println("Opção selecionada: Sacar\n");
                    System.out.println("Informe o valor que deseja sacar:");
                    saldoSacado = scanner.nextDouble();

                    if (saldoSacado > saldo) {
                        mensagem = "Saldo insuficiente para saque.";
                    } else {
                        saldoAtualizado = saldo - saldoSacado;
                        mensagem = """
                            
                            Saque efetuado com sucesso.
                            
                            ------------- EXTRATO --------------
                            
                            Saldo anterior: R$%.2f
                            Valor sacado: R$ %.2f
                            Saldo atualizado: R$ %.2f
                            """.formatted(saldo, saldoSacado, saldoAtualizado);
                    }
                    System.out.println(mensagem);
                }
                case 3 -> {
                    System.out.println("Opção selecionada: Transferir\n");
                    System.out.println("Informe o valor que deseja transferir:");
                    saldoTransferido = scanner.nextDouble();

                    if (saldoTransferido > saldo) {
                        mensagem = "Saldo insuficiente para transferência.";
                    } else {
                        saldoAtualizado = saldo - saldoTransferido;
                        mensagem = """
                            
                            Transferência efetuada com sucesso.
                            
                            ------------- EXTRATO --------------
                            
                            Saldo anterior: R$%.2f
                            Valor transferido: R$ %.2f
                            Saldo atualizado: R$ %.2f
                            """.formatted(saldo, saldoTransferido, saldoAtualizado);
                    }
                    System.out.println(mensagem);
                }
            }

            saldo = saldoAtualizado;
            System.out.println("""
                
                ------ BEM-VINDO AO BANCO DEV ------
                     Selecione a opção desejada:
                
                           1. Depositar
                           2.   Sacar
                           3. Transferir
                           4.   Sair
                
                ------------------------------------
                
                """);
            opcaoEscolhida = scanner.nextInt();
        }
        System.out.println("\nSaindo do sistema...");
    }
}

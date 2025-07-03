package exercicios.introducao.tematicos.Dmodulo.Dcadastroalunos.test;

import exercicios.introducao.tematicos.Dmodulo.Dcadastroalunos.dominio.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        int contador = 0;
        int indice = 0;
        String nome = "";
        String turma = "";

        Aluno alunoGenerico;

        System.out.println("""
                
                O que você deseja fazer?
                1. CADASTRAR ALUNO
                2. SAIR DO SISTEMA
                """);
        int escolha = scanner.nextInt();
        scanner.nextLine();

        while (escolha == 1) {
            alunoGenerico = new Aluno();
            alunos.add(indice++, alunoGenerico);

            System.out.println("Informe o nome do " + (contador+1) + "° aluno:");
            nome = scanner.nextLine();
            alunoGenerico.setNome(nome);

            System.out.println("Informe a turma do " + (contador+1) + " aluno:");
            turma = scanner.nextLine();
            alunoGenerico.setTurma(turma);

            contador++;

            System.out.println("""
                
                O que você deseja fazer?
                1. CADASTRAR ALUNO
                2. SAIR DO SISTEMA
                """);
            escolha = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Lista de alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + " | " + aluno.getTurma());
        }
        System.out.println("Total de alunos cadastrados: " + alunos.size());
    }
}

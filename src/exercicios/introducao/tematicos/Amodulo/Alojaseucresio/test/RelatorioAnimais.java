package exercicios.introducao.tematicos.Amodulo.Alojaseucresio.test;

import exercicios.introducao.tematicos.Amodulo.Alojaseucresio.dominio.Animal;

import java.util.Scanner;

public class RelatorioAnimais {
    public static void main(String[] args) {

        /* Seu Creso tem uma loja de animais e precisa de um programa que armazene
          o nome de cada animal, sua espécie e idade em anos. Além disso, ele quer saber quanto cada um dos animais
          come em gramas de ração por dia.
          Crie variáveis para armazenar essas informações e exiba tudo de maneira organizada para Seu Creso revisar. */
        Scanner scanner = new Scanner(System.in);

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();

        Animal[] animais = {animal1, animal2, animal3};

        System.out.println("--------------------------------------");
        System.out.println("   BEM-VINDO AO CADASTRO DE ANIMAIS   ");
        System.out.println("--------------------------------------");
        System.out.println();

        for (Animal animal : animais) {
            System.out.println("Informe a espécie do animal:");
            String especieAnimal = scanner.next();
            animal.setEspecie(especieAnimal);

            System.out.println("Informe o nome do animal:");
            String nomeAnimal = scanner.next();
            animal.setNome(nomeAnimal);

            System.out.println("Informe a idade do animal:");
            int idadeAnimal = scanner.nextInt();
            animal.setIdade(idadeAnimal);

            System.out.println("Informe a quantidade (em gramas) de ração que o animal consome diariamente:");
            double gramasRacaoAnimal = scanner.nextDouble();
            animal.setGramasRacao(gramasRacaoAnimal);
            System.out.println();
        }

        System.out.println("--------------------------------------");
        System.out.println("              RELATÓRIO               ");
        System.out.println("--------------------------------------");
        System.out.println();

        animal1.imprimeRelatorio();
        animal2.imprimeRelatorio();
        animal3.imprimeRelatorio();
    }
}

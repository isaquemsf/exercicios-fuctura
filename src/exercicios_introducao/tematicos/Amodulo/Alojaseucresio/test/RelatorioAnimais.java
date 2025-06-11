package exercicios_introducao.tematicos.Amodulo.Alojaseucresio.test;

import exercicios_introducao.tematicos.Amodulo.Alojaseucresio.dominio.Animal;

public class RelatorioAnimais {
    public static void main(String[] args) {

        /* Seu Creso tem uma loja de animais e precisa de um programa que armazene
          o nome de cada animal, sua espécie e idade em anos. Além disso, ele quer saber quanto cada um dos animais
          come em gramas de ração por dia.
          Crie variáveis para armazenar essas informações e exiba tudo de maneira organizada para Seu Creso revisar. */

        Animal animal1 = new Animal("Cachorro");
        Animal animal2 = new Animal("Gato");
        Animal animal3 = new Animal("Papagaio");

        animal1.setNome("Bob");
        animal1.setIdade(1);
        animal1.setGramasRacao(150);

        animal2.setNome("Fred");
        animal2.setIdade(2);
        animal2.setGramasRacao(100);

        animal3.setNome("Blue");
        animal3.setIdade(5);
        animal3.setGramasRacao(50);

        System.out.println("--------------------------------------");
        System.out.println("              RELATÓRIO               ");
        System.out.println("--------------------------------------");
        System.out.println();

        animal1.imprimeRelatorio();
        animal2.imprimeRelatorio();
        animal3.imprimeRelatorio();
    }
}

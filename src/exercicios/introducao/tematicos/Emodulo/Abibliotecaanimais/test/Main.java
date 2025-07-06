package exercicios.introducao.tematicos.Emodulo.Abibliotecaanimais.test;

import exercicios.introducao.tematicos.Emodulo.Abibliotecaanimais.dominio.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");
        cachorro.setEspecie("PitBull");
        cachorro.setIdade(2);

        cachorro.latir();
        cachorro.exibirInfo();
    }
}

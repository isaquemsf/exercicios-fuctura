package exercicios.introducao.tematicos.Emodulo.Cveiculosdafrota.test;

import exercicios.introducao.tematicos.Emodulo.Cveiculosdafrota.dominio.Carro;
import exercicios.introducao.tematicos.Emodulo.Cveiculosdafrota.dominio.Moto;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", 2015);
        Moto moto = new Moto("Honda", 2018);

        carro.abrirMala();
        carro.exibirInfo();

        System.out.println("------------");

        moto.empinar();
        moto.exibirInfo();
    }
}

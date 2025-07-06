package exercicios.introducao.tematicos.Emodulo.Abibliotecaanimais.dominio;

public class Animal {
    private String nome;
    private String especie;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
    }
}

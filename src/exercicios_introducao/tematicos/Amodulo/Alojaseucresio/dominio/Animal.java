package exercicios_introducao.tematicos.Amodulo.Alojaseucresio.dominio;

public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private double gramasRacao;

    public void imprimeRelatorio() {
        System.out.println("ESPÉCIE DO ANIMAL: " + especie);
        System.out.println("NOME DO ANIMAL: " + nome);
        System.out.println("IDADE DO ANIMAL: " + idade);
        System.out.printf("GRAMAS DIÁRIOS DE RAÇÃO CONSUMIDOS: %.2fg%n", gramasRacao);
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getGramasRacao() {
        return gramasRacao;
    }

    public void setGramasRacao(double gramasRacao) {
        this.gramasRacao = gramasRacao;
    }
}

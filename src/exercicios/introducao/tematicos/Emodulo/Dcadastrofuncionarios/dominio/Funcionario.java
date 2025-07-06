package exercicios.introducao.tematicos.Emodulo.Dcadastrofuncionarios.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void exibirInfo() {
        System.out.println("Funcionario: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Salário: R$ %.2f%n", salario);
    }
}

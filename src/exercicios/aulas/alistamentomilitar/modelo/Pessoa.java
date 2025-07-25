package exercicios.aulas.alistamentomilitar.modelo;

import exercicios.aulas.alistamentomilitar.enums.StatusAlistamento;

import java.util.Calendar;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Double altura;
    private Calendar dataNascimento;
    private StatusAlistamento condicao;

    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.dataNascimento = Calendar.getInstance();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public StatusAlistamento getCondicao() {
        return condicao;
    }

    public void setCondicao(StatusAlistamento condicao) {
        this.condicao = condicao;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
        System.out.print("Data de Nascimento: ");
        formatarData(dataNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Status: " + condicao);
        System.out.println("-----------------------------");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(idade, pessoa.idade) && Objects.equals(altura, pessoa.altura) && Objects.equals(dataNascimento, pessoa.dataNascimento) && condicao == pessoa.condicao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, altura, dataNascimento, condicao);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", dataNascimento=" + dataNascimento.getTime() +
                ", condicao=" + condicao +
                '}';
    }

    private void formatarData(Calendar calendar) {
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH);
        int ano = calendar.get(Calendar.YEAR);

        System.out.println(dia + "/" + (mes+1) + "/" + ano);
    }
}

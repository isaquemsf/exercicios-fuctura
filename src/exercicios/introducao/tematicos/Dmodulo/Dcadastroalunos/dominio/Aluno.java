package exercicios.introducao.tematicos.Dmodulo.Dcadastroalunos.dominio;

public class Aluno {
    private String nome;
    private String turma;

    public Aluno() {}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }
}

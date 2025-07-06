package exercicios.introducao.tematicos.Emodulo.Dcadastrofuncionarios.test;

import exercicios.introducao.tematicos.Emodulo.Dcadastrofuncionarios.dominio.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
                "Joel",
                45,
                4000
        );

        funcionario.exibirInfo();
    }
}

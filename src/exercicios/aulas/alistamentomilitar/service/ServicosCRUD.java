package exercicios.aulas.alistamentomilitar.service;

import exercicios.aulas.alistamentomilitar.modelo.Pessoa;

public interface ServicosCRUD {
    void cadastrarCandidato(Pessoa pessoa);

    void listarCandidatosAptos();

    void listarEmOrdemAlfabetica();

    void atualizarNomeCandidato(Pessoa pessoa, String nome);

    void deletarCandidato(Pessoa pessoa);
}

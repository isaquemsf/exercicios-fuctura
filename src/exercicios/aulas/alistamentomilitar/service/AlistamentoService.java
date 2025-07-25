package exercicios.aulas.alistamentomilitar.service;

import exercicios.aulas.alistamentomilitar.enums.StatusAlistamento;
import exercicios.aulas.alistamentomilitar.modelo.Pessoa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AlistamentoService implements ServicosCRUD {
    List<Pessoa> candidatos = new ArrayList<>();

    @Override
    public void cadastrarCandidato(Pessoa candidato) {
        if (!candidatos.contains(candidato)) {
            definirStatus(candidato);
            candidatos.add(candidato);
            System.out.println("Candidato cadastrado com sucesso!");
        } else {
            System.out.println("Este candidato já está cadastrado no sistema.");
        }
    }

    @Override
    public void atualizarNomeCandidato(Pessoa candidato, String nome) {
        for (Pessoa c : candidatos) {
            if (c.equals(candidato)) {
                c.setNome(nome);
                System.out.println("Nome atualizado com sucesso!");
            }
        }
    }

    @Override
    public void listarCandidatosAptos() {
        System.out.println("\nLista de Candidatos Aptos:");
        for (Pessoa candidato : candidatos) {
            if (candidato != null && candidato.getCondicao() == StatusAlistamento.APTO) {
                candidato.exibirInfo();
            }
        }
    }

    @Override
    public void listarEmOrdemAlfabetica() {
        System.out.println("\nLista de Candidatos em Ordem Alfabetica:");

        candidatos.sort((candidato, nextCandidato) -> candidato.getNome()
                .compareToIgnoreCase(nextCandidato.getNome()));

        for (Pessoa candidato : candidatos) {
            candidato.exibirInfo();
        }
    }

    @Override
    public void deletarCandidato(Pessoa candidato) {
        boolean removido = candidatos.removeIf(c -> c.equals(candidato));

        if (removido) {
            System.out.println("Candidato removido com sucesso!");
        } else {
            System.out.println("Candidato não encontrado.");
        }
    }

    private void definirStatus(Pessoa candidato) {
        int idadeCorreta = validarIdade(candidato);

        if (idadeCorreta < 18 || idadeCorreta > 30) {
            candidato.setCondicao(StatusAlistamento.INAPTO);
        } else if (idadeCorreta == 18) {
            candidato.setCondicao(StatusAlistamento.APTO);
        } else {
            candidato.setCondicao(StatusAlistamento.REFRATARIO);
        }
    }

    private Integer validarIdade(Pessoa candidato) {
        Calendar dataAtual = Calendar.getInstance();
        Calendar dataNascimento = candidato.getDataNascimento();

        int anoAtual = dataAtual.get(Calendar.YEAR);
        int anoNascimento = dataNascimento.get(Calendar.YEAR);

        int mesAtual = dataAtual.get(Calendar.MONTH);
        int mesNascimento = dataNascimento.get(Calendar.MONTH);
        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
        int diaNascimento = dataNascimento.get(Calendar.DAY_OF_MONTH);

        int idadeCorreta = anoAtual - anoNascimento;

        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idadeCorreta--;
        }

        if (candidato.getIdade() != idadeCorreta) {
            System.out.println("Candidato [" + candidato.getNome().toUpperCase() + "] sua idade não condiz com a data de nascimento." +
                    "| Idade correta: " + idadeCorreta);
            candidato.setIdade(idadeCorreta);
        }

        return idadeCorreta;
    }
}

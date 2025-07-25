package exercicios.aulas.alistamentomilitar;

import exercicios.aulas.alistamentomilitar.modelo.Pessoa;
import exercicios.aulas.alistamentomilitar.service.AlistamentoService;

import java.time.LocalDate;
import java.util.Calendar;

public class SistemaAlistamento {
    public static void main(String[] args) {
        Pessoa candidato1 = new Pessoa("Julio", 18, 1.80);
        candidato1.getDataNascimento().set(2007, Calendar.SEPTEMBER, 8);

        Pessoa candidato2 = new Pessoa("Joao", 18, 1.70);
        candidato2.getDataNascimento().set(2007, Calendar.JULY, 25);

        Pessoa candidato3 = new Pessoa("Maycon", 25, 1.68);
        candidato3.getDataNascimento().set(2003, Calendar.JANUARY, 31);

        Pessoa candidato4 = new Pessoa("Douglas", 33, 1.77);
        candidato4.getDataNascimento().set(1993, Calendar.DECEMBER, 22);

        AlistamentoService alistamentoService = new AlistamentoService();
        alistamentoService.cadastrarCandidato(candidato1);
        alistamentoService.cadastrarCandidato(candidato2);
        alistamentoService.cadastrarCandidato(candidato3);
        alistamentoService.cadastrarCandidato(candidato4);

        alistamentoService.atualizarNomeCandidato(candidato2, "Celso");
        alistamentoService.deletarCandidato(candidato3);

        alistamentoService.listarEmOrdemAlfabetica();
        alistamentoService.listarCandidatosAptos();

    }
}

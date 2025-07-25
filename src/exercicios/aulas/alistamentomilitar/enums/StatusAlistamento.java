package exercicios.aulas.alistamentomilitar.enums;

public enum StatusAlistamento {
    APTO(1, "Dentro dos conformes - apto para servir."),
    INAPTO(2, "Não corresponde aos requisitos - inapto."),
    REFRATARIO(3, "Alistamento fora do prazo - Refratario");

    private Integer codigoStatus;
    private String descricao;

    StatusAlistamento(Integer codigoStatus, String descricao) {
        this.codigoStatus = codigoStatus;
        this.descricao = descricao;
    }
}

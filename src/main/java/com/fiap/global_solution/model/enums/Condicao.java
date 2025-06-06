package com.fiap.global_solution.model.enums;

public enum Condicao {
    NOVOS(0, "NOVOS"),
    SEMI_NOVOS(1, "SEMI_NOVOS"),
    USADOS(2, "USADOS");

    Condicao(Integer cod, String condicao) {
    }

    private Integer cod;
    private String condicao;
    public String getCondicao(Integer cod) {
        return condicao;
    }
}

package com.fiap.global_solution.model.enums;

public enum TipoDoacao {

    ALIMENTOS(0, "ALIMENTOS"),
    ROUPAS_ADULTO(1, "ROUPAS_ADULTO"),
    ROUPAS_INFANTIL(2,"ROUPAS_INFANTIL"),
    CALCADOS(3,"CALCADOS"),
    COBERTORES_ROUPAS_CAMA(4,"COBERTORES_ROUPAS_CAMA"),
    PRODUTOS_HIGIENE(5,"PRODUTOS_HIGIENE");

    TipoDoacao(Integer cod, String tipoDoacao) {
    }
    private Integer cod;
    private String tipoDoacao;
    String getTipoDoacao(Integer cod) {
        return tipoDoacao;
    }

}

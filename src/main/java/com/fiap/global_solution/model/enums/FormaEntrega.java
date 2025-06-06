package com.fiap.global_solution.model.enums;

public enum FormaEntrega {

    PONTO_DE_COLETA(0, "PONTO_DE_COLETA"),
    MINHA_CASA(1, "MINHA_CASA"),
    AINDA_VOU_DECIDIR(2, "AINDA_VOU_DECIDIR");

    FormaEntrega(Integer cod, String formaEntrega) {

    }
    private Integer cod;
    private String formaEntrega;
    String getFormaEntrega(Integer cod) {
        return formaEntrega;
    }
}

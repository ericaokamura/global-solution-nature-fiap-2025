package com.fiap.global_solution.model.enums;

public enum FormaPagamento {

    PIX(0, "PIX"),
    TRANSFERENCIA_BANCARIA(1, "TRANSFERENCIA_BANCARIA"),
    CARTAO_CREDITO(2, "CARTAO_CREDITO");

    FormaPagamento(Integer cod, String formaPagamento) {
    }
    private Integer cod;
    private String formaPagamento;
    String getFormaPagamento(Integer cod) {
        return formaPagamento;
    }
}

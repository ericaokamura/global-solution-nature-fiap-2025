package com.fiap.global_solution.model.dto;

import com.fiap.global_solution.model.enums.FormaPagamento;

public class ContribuicaoDTO {

    private String nomeCompleto;
    private String telefone;
    private String email;
    private String cidade;
    private String estado;
    private String endereco;
    private Double valor;
    private String formaPagamento;

    public ContribuicaoDTO() {
    }

    public ContribuicaoDTO(String nomeCompleto, String telefone, String email, String cidade, String estado, String endereco, Double valor, String formaPagamento) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.estado = estado;
        this.endereco = endereco;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}

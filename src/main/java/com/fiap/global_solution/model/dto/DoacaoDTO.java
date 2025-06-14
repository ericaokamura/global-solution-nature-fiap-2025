package com.fiap.global_solution.model.dto;

import com.fiap.global_solution.model.ItemDoado;
import com.fiap.global_solution.model.enums.Condicao;
import com.fiap.global_solution.model.enums.FormaEntrega;
import com.fiap.global_solution.model.enums.TipoDoacao;

import java.util.List;
import java.util.Map;

public class DoacaoDTO {

    private String nomeCompleto;
    private String telefone;
    private String email;
    private String cidade;
    private String estado;
    private String endereco;
    private List<ItemDoado> itensDoados;
    private String condicao;
    private String formaEntrega;

    public DoacaoDTO() {
    }

    public DoacaoDTO(String nomeCompleto, String telefone, String email, String cidade, String estado, String endereco, List<ItemDoado> itensDoados, String condicao, String formaEntrega) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.estado = estado;
        this.endereco = endereco;
        this.itensDoados = itensDoados;
        this.condicao = condicao;
        this.formaEntrega = formaEntrega;
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

    public List<ItemDoado> getItensDoados() {
        return itensDoados;
    }

    public void setItensDoados(List<ItemDoado> itensDoados) {
        this.itensDoados = itensDoados;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getFormaEntrega() {
        return formaEntrega;
    }

    public void setFormaEntrega(String formaEntrega) {
        this.formaEntrega = formaEntrega;
    }
}

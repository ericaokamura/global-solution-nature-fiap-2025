package com.fiap.global_solution.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

public class ReportDTO {

    private String tipo;
    private String descricao;
    private Integer severidade;
    private String localizacao;
    private String criadoEm;

    public ReportDTO() {

    }

    public ReportDTO(String tipo, String descricao, Integer severidade, String localizacao, String criadoEm) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.severidade = severidade;
        this.localizacao = localizacao;
        this.criadoEm = criadoEm;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getSeveridade() {
        return severidade;
    }

    public void setSeveridade(Integer severidade) {
        this.severidade = severidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(String criadoEm) {
        this.criadoEm = criadoEm;
    }
}

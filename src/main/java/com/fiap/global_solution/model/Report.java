package com.fiap.global_solution.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String descricao;
    private Integer severidade;
    private String localizacao;
    private LocalDateTime criadoEm;

    public Report() {

    }
    public Report(Long id, String tipo, String descricao, Integer severidade, String localizacao, LocalDateTime criadoEm) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.severidade = severidade;
        this.localizacao = localizacao;
        this.criadoEm = criadoEm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}

package com.fiap.global_solution.model;

import com.fiap.global_solution.model.enums.Condicao;
import com.fiap.global_solution.model.enums.FormaEntrega;
import com.fiap.global_solution.model.enums.TipoDoacao;
import jakarta.persistence.*;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;
import java.util.Map;

@Entity
@Table(name="doacoes")
public class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private String telefone;
    private String email;
    private String cidade;
    private String estado;
    private String endereco;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemDoado> itensDoados;
    @Enumerated(EnumType.STRING)
    private Condicao condicao;
    @Enumerated(EnumType.STRING)
    private FormaEntrega formaEntrega;

    public Doacao() {
    }

    public Doacao(Long id, String nomeCompleto, String telefone, String email, String cidade, String estado, String endereco, List<ItemDoado> itensDoados, Condicao condicao, FormaEntrega formaEntrega) {
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(Condicao condicao) {
        this.condicao = condicao;
    }

    public FormaEntrega getFormaEntrega() {
        return formaEntrega;
    }

    public void setFormaEntrega(FormaEntrega formaEntrega) {
        this.formaEntrega = formaEntrega;
    }
}

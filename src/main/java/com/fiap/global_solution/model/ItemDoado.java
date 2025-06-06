package com.fiap.global_solution.model;

import com.fiap.global_solution.model.enums.TipoDoacao;
import jakarta.persistence.*;

@Entity
@Table(name="itens_doados")
public class ItemDoado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long doacaoId;
    @Enumerated(EnumType.STRING)
    private TipoDoacao tipoDoacao;
    private Long quantidade;

    public Long getDoacaoId() {
        return doacaoId;
    }

    public void setDoacaoId(Long doacaoId) {
        this.doacaoId = doacaoId;
    }

    public TipoDoacao getTipoDoacao() {
        return tipoDoacao;
    }

    public void setTipoDoacao(TipoDoacao tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }
}

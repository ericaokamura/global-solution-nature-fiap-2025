package com.fiap.global_solution.mapper;

import com.fiap.global_solution.model.Contribuicao;
import com.fiap.global_solution.model.Doacao;
import com.fiap.global_solution.model.dto.ContribuicaoDTO;
import com.fiap.global_solution.model.dto.DoacaoDTO;

import java.util.ArrayList;
import java.util.List;

public class ContribuicaoMapper {

    public static ContribuicaoDTO convertModelToDto(Contribuicao model) {
        ContribuicaoDTO dto = new ContribuicaoDTO();
        dto.setNomeCompleto(model.getNomeCompleto());
        dto.setEmail(model.getEmail());
        dto.setTelefone(model.getTelefone());
        dto.setCidade(model.getCidade());
        dto.setEstado(model.getEstado());
        dto.setEndereco(model.getEndereco());
        dto.setValor(model.getValor());
        dto.setFormaPagamento(model.getFormaPagamento());
        return dto;
    }

    public static Contribuicao convertDtoToModel(ContribuicaoDTO dto) {
        Contribuicao model = new Contribuicao();
        model.setNomeCompleto(dto.getNomeCompleto());
        model.setEmail(dto.getEmail());
        model.setTelefone(dto.getTelefone());
        model.setCidade(dto.getCidade());
        model.setEstado(dto.getEstado());
        model.setEndereco(dto.getEndereco());
        model.setValor(dto.getValor());
        model.setFormaPagamento(dto.getFormaPagamento());
        return model;
    }

    public static List<ContribuicaoDTO> convertListModelToListDto(List<Contribuicao> contribuicoes) {
        List<ContribuicaoDTO> dtos = new ArrayList<>();
        for (Contribuicao model : contribuicoes) {
            ContribuicaoDTO dto = new ContribuicaoDTO();
            dto.setNomeCompleto(model.getNomeCompleto());
            dto.setEmail(model.getEmail());
            dto.setTelefone(model.getTelefone());
            dto.setCidade(model.getCidade());
            dto.setEstado(model.getEstado());
            dto.setEndereco(model.getEndereco());
            dto.setValor(model.getValor());
            dto.setFormaPagamento(model.getFormaPagamento());
            dtos.add(dto);
        }
        return dtos;
    }

    public static List<Contribuicao> convertListDtoToListModel(List<ContribuicaoDTO> dtos) {
        List<Contribuicao> contribuicoes = new ArrayList<>();
        for (ContribuicaoDTO dto : dtos) {
            Contribuicao model = new Contribuicao();
            model.setNomeCompleto(dto.getNomeCompleto());
            model.setEmail(dto.getEmail());
            model.setTelefone(dto.getTelefone());
            model.setCidade(dto.getCidade());
            model.setEstado(dto.getEstado());
            model.setEndereco(dto.getEndereco());
            model.setValor(dto.getValor());
            model.setFormaPagamento(dto.getFormaPagamento());
            contribuicoes.add(model);
        }
        return contribuicoes;
    }
}

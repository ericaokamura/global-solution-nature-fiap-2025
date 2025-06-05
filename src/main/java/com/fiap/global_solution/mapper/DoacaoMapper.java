package com.fiap.global_solution.mapper;

import com.fiap.global_solution.model.Report;
import com.fiap.global_solution.model.dto.DoacaoDTO;
import com.fiap.global_solution.model.Doacao;
import com.fiap.global_solution.model.dto.ReportDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DoacaoMapper {

    public static DoacaoDTO convertModelToDto(Doacao model) {
        DoacaoDTO dto = new DoacaoDTO();
        dto.setNomeCompleto(model.getNomeCompleto());
        dto.setEmail(model.getEmail());
        dto.setTelefone(model.getTelefone());
        dto.setCidade(model.getCidade());
        dto.setEstado(model.getEstado());
        dto.setEndereco(model.getEndereco());
        dto.setItensDoados(model.getItensDoados());
        dto.setCondicao(model.getCondicao());
        dto.setFormaEntrega(model.getFormaEntrega());
        return dto;
    }

    public static Doacao convertDtoToModel(DoacaoDTO dto) {
        Doacao model = new Doacao();
        model.setNomeCompleto(dto.getNomeCompleto());
        model.setEmail(dto.getEmail());
        model.setTelefone(dto.getTelefone());
        model.setCidade(dto.getCidade());
        model.setEstado(dto.getEstado());
        model.setEndereco(dto.getEndereco());
        model.setItensDoados(dto.getItensDoados());
        model.setCondicao(dto.getCondicao());
        model.setFormaEntrega(dto.getFormaEntrega());
        return model;
    }

    public static List<DoacaoDTO> convertListModelToListDto(List<Doacao> doacoes) {
        List<DoacaoDTO> dtos = new ArrayList<>();
        for (Doacao model : doacoes) {
            DoacaoDTO dto = new DoacaoDTO();
            dto.setNomeCompleto(model.getNomeCompleto());
            dto.setEmail(model.getEmail());
            dto.setTelefone(model.getTelefone());
            dto.setCidade(model.getCidade());
            dto.setEstado(model.getEstado());
            dto.setEndereco(model.getEndereco());
            dto.setItensDoados(model.getItensDoados());
            dto.setCondicao(model.getCondicao());
            dto.setFormaEntrega(model.getFormaEntrega());
            dtos.add(dto);
        }
        return dtos;
    }

    public static List<Doacao> convertListDtoToListModel(List<DoacaoDTO> dtos) {
        List<Doacao> doacoes = new ArrayList<>();
        for (DoacaoDTO dto : dtos) {
            Doacao model = new Doacao();
            model.setNomeCompleto(dto.getNomeCompleto());
            model.setEmail(dto.getEmail());
            model.setTelefone(dto.getTelefone());
            model.setCidade(dto.getCidade());
            model.setEstado(dto.getEstado());
            model.setEndereco(dto.getEndereco());
            model.setItensDoados(dto.getItensDoados());
            model.setCondicao(dto.getCondicao());
            model.setFormaEntrega(dto.getFormaEntrega());
            doacoes.add(model);
        }
        return doacoes;
    }
}

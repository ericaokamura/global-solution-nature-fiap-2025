package com.fiap.global_solution.service;

import com.fiap.global_solution.mapper.DoacaoMapper;
import com.fiap.global_solution.repository.DoacaoRepository;
import com.fiap.global_solution.model.dto.DoacaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoacaoService {

    @Autowired
    private DoacaoRepository doacaoRepository;

    public List<DoacaoDTO> retornaTodasDoacoes() {
        return DoacaoMapper.convertListModelToListDto(doacaoRepository.findAll());
    }
    public DoacaoDTO salvaDoacao(DoacaoDTO doacaoDTO) {
        return DoacaoMapper.convertModelToDto(doacaoRepository.save(DoacaoMapper.convertDtoToModel(doacaoDTO)));
    }
    public List<DoacaoDTO> retornaTodasDoacoesPorEstado(String estado) {
        return DoacaoMapper.convertListModelToListDto(doacaoRepository.findByEstado(estado));
    }
}

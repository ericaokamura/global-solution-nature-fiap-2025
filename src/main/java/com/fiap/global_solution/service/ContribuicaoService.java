package com.fiap.global_solution.service;

import com.fiap.global_solution.model.dto.ContribuicaoDTO;
import com.fiap.global_solution.repository.ContribuicaoRepository;
import com.fiap.global_solution.mapper.ContribuicaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContribuicaoService {

    @Autowired
    private ContribuicaoRepository contribuicaoRepository;

    public List<ContribuicaoDTO> retornaTodasContribuicoes() {
        return ContribuicaoMapper.convertListModelToListDto(contribuicaoRepository.findAll());
    }
    public ContribuicaoDTO salvaDoacao(ContribuicaoDTO contribuicaoDTO) {
        return ContribuicaoMapper.convertModelToDto(contribuicaoRepository.save(ContribuicaoMapper.convertDtoToModel(contribuicaoDTO)));
    }
    public List<ContribuicaoDTO> retornaTodasDoacoesPorEstado(String estado) {
        return ContribuicaoMapper.convertListModelToListDto(contribuicaoRepository.findByEstado(estado));
    }
}

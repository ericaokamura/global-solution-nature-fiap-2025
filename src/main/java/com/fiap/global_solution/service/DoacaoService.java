package com.fiap.global_solution.service;

import com.fiap.global_solution.mapper.DoacaoMapper;
import com.fiap.global_solution.model.Doacao;
import com.fiap.global_solution.model.ItemDoado;
import com.fiap.global_solution.repository.DoacaoRepository;
import com.fiap.global_solution.model.dto.DoacaoDTO;
import com.fiap.global_solution.repository.ItemDoadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoacaoService {

    @Autowired
    private DoacaoRepository doacaoRepository;
    @Autowired
    private ItemDoadoRepository itemDoadoRepository;

    public List<DoacaoDTO> retornaTodasDoacoes() {
        List<Doacao> doacoes = doacaoRepository.findAll();
        for (Doacao doacao : doacoes) {
            List<ItemDoado> itens = itemDoadoRepository.findByDoacaoId(doacao.getId());
            doacao.setItensDoados(itens);
        }
        return DoacaoMapper.convertListModelToListDto(doacoes);
    }
    public DoacaoDTO salvaDoacao(DoacaoDTO doacaoDTO) {
        Doacao doacao = doacaoRepository.save(DoacaoMapper.convertDtoToModel(doacaoDTO));
        List<ItemDoado> itens = new ArrayList<>();
        for (ItemDoado item : doacaoDTO.getItensDoados()) {
            item.setDoacaoId(doacao.getId());
            itens.add(itemDoadoRepository.save(item));
        }
        doacao.setItensDoados(itens);
        return DoacaoMapper.convertModelToDto(doacao);
    }
    public List<DoacaoDTO> retornaTodasDoacoesPorEstado(String estado) {
        List<Doacao> doacoes = doacaoRepository.findByEstado(estado);
        for (Doacao doacao : doacoes) {
            List<ItemDoado> itens = itemDoadoRepository.findByDoacaoId(doacao.getId());
            doacao.setItensDoados(itens);
        }
        return DoacaoMapper.convertListModelToListDto(doacoes);
    }
}

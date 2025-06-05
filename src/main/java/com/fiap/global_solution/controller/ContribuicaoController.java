package com.fiap.global_solution.controller;


import com.fiap.global_solution.model.dto.ContribuicaoDTO;
import com.fiap.global_solution.model.dto.DoacaoDTO;
import com.fiap.global_solution.service.ContribuicaoService;
import com.fiap.global_solution.service.DoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contribuicoes")
public class ContribuicaoController {

    @Autowired
    private ContribuicaoService contribuicaoService;

    @GetMapping("/")
    public ResponseEntity<List<ContribuicaoDTO>> retornaTodasDoacoes() {
        List<ContribuicaoDTO> doacoes = contribuicaoService.retornaTodasContribuicoes();
        return ResponseEntity.ok(doacoes);
    }

    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<ContribuicaoDTO>> retornaTodasDoacoesPorEstado(@PathVariable("estado") String estado) {
        List<ContribuicaoDTO> doacoes = contribuicaoService.retornaTodasDoacoesPorEstado(estado);
        return ResponseEntity.ok(doacoes);
    }

    @PostMapping("/")
    public ResponseEntity<ContribuicaoDTO> salvaDoacao(@RequestBody ContribuicaoDTO contribuicaoDTO) {
        ContribuicaoDTO doacao = contribuicaoService.salvaDoacao(contribuicaoDTO);
        return ResponseEntity.ok(doacao);
    }
}

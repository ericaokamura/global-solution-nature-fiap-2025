package com.fiap.global_solution.controller;


import com.fiap.global_solution.model.dto.DoacaoDTO;
import com.fiap.global_solution.model.dto.ReportDTO;
import com.fiap.global_solution.service.DoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doacoes")
public class DoacaoController {

    @Autowired
    private DoacaoService doacaoService;

    @GetMapping("/")
    public ResponseEntity<List<DoacaoDTO>> retornaTodasDoacoes() {
        List<DoacaoDTO> doacoes = doacaoService.retornaTodasDoacoes();
        return ResponseEntity.ok(doacoes);
    }

    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<DoacaoDTO>> retornaTodasDoacoesPorEstado(@PathVariable("estado") String estado) {
        List<DoacaoDTO> doacoes = doacaoService.retornaTodasDoacoesPorEstado(estado);
        return ResponseEntity.ok(doacoes);
    }

    @PostMapping("/")
    public ResponseEntity<DoacaoDTO> salvaDoacao(@RequestBody DoacaoDTO doacaoDTO) {
        DoacaoDTO doacao = doacaoService.salvaDoacao(doacaoDTO);
        return ResponseEntity.ok(doacao);
    }


}

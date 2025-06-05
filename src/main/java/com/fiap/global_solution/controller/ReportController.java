package com.fiap.global_solution.controller;

import com.fiap.global_solution.model.dto.ReportDTO;
import com.fiap.global_solution.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/")
    public ResponseEntity<List<ReportDTO>> retornaTodosReports() {
        List<ReportDTO> reports = reportService.retornaTodosReports();
        return ResponseEntity.ok(reports);
    }

    @GetMapping("/filtro/tipo/{tipo}")
    public ResponseEntity<List<ReportDTO>> filtraReportsPorTipo(@PathVariable("tipo") String tipo) {
        List<ReportDTO> reports = reportService.filtraReportsPorTipo(tipo);
        return ResponseEntity.ok(reports);
    }

    @GetMapping("/filtro/dataCriacao/{dataCriacao}")
    public ResponseEntity<List<ReportDTO>> filtraReportsPorDataDeCriacao(@PathVariable("dataCriacao") String dataCriacao) {
        List<ReportDTO> reports = reportService.filtraReportsPorDataDeCriacao(dataCriacao);
        return ResponseEntity.ok(reports);
    }

    @GetMapping("/filtro")
    public ResponseEntity<List<ReportDTO>> filtraReportsPorTipoEDataDeCriacao(@RequestParam("tipo") String tipo,@RequestParam("dataCriacao") String dataCriacao) {
        List<ReportDTO> reports = reportService.filtraReportsPorTipoEDataDeCriacao(tipo, dataCriacao);
        return ResponseEntity.ok(reports);
    }

    @PostMapping("/")
    public ResponseEntity<ReportDTO> salvaReport(@RequestBody ReportDTO reportDTO) {
        ReportDTO report = reportService.salvaReport(reportDTO);
        return ResponseEntity.ok(report);
    }
}

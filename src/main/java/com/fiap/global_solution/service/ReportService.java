package com.fiap.global_solution.service;

import com.fiap.global_solution.model.dto.ReportDTO;
import com.fiap.global_solution.mapper.ReportMapper;
import com.fiap.global_solution.model.Report;
import com.fiap.global_solution.repository.ReportRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRpository;

    public List<ReportDTO> retornaTodosReports() {
        List<Report> reports = reportRpository.findAll();
        return ReportMapper.convertListModelToListDto(reports);
    }

    public List<ReportDTO> filtraReportsPorTipo(String tipo) {
        List<Report> reports = new ArrayList<>();
        reports = reportRpository.findReportsByTipo(tipo);
        return ReportMapper.convertListModelToListDto(reports);
    }

    public List<ReportDTO> filtraReportsPorDataDeCriacao(String dataCriacao) {
        List<Report> reports = new ArrayList<>();
        LocalDate dataReferencia = LocalDate.parse(dataCriacao);
        LocalDateTime dataHoraReferencia = LocalDateTime.of(dataReferencia, LocalTime.now());
        reports = reportRpository.findReportsCriadoEmAfter(dataHoraReferencia);
        return ReportMapper.convertListModelToListDto(reports);
    }

    public List<ReportDTO> filtraReportsPorTipoEDataDeCriacao(String tipo, String dataCriacao) {
        List<Report> reports = new ArrayList<>();
        LocalDate dataReferencia = LocalDate.parse(dataCriacao);
        LocalDateTime dataHoraReferencia = LocalDateTime.of(dataReferencia, LocalTime.now());
        reports = reportRpository.findReportsByTipoAndCriadoEmAfter(tipo, dataHoraReferencia);
        return ReportMapper.convertListModelToListDto(reports);
    }

    public ReportDTO salvaReport(ReportDTO reportDTO) {
        Report report = reportRpository.save(ReportMapper.convertDtoToModel(reportDTO));
        return ReportMapper.convertModelToDto(report);
    }


}

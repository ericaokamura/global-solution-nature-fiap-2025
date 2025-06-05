package com.fiap.global_solution.mapper;

import com.fiap.global_solution.model.dto.ReportDTO;
import com.fiap.global_solution.model.Report;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReportMapper {

    public static ReportDTO convertModelToDto(Report model) {
        ReportDTO dto = new ReportDTO();
        dto.setTipo(model.getTipo());
        dto.setDescricao(model.getDescricao());
        dto.setSeveridade(model.getSeveridade());
        dto.setLocalizacao(model.getLocalizacao());
        dto.setCriadoEm(String.valueOf(model.getCriadoEm()));
        return dto;
    }

    public static Report convertDtoToModel(ReportDTO dto) {
        Report model = new Report();
        model.setTipo(dto.getTipo());
        model.setDescricao(dto.getDescricao());
        model.setSeveridade(dto.getSeveridade());
        model.setLocalizacao(dto.getLocalizacao());
        model.setCriadoEm(LocalDateTime.parse(dto.getCriadoEm()));
        return model;
    }

    public static List<ReportDTO> convertListModelToListDto(List<Report> reports) {
        List<ReportDTO> dtos = new ArrayList<>();
        for (Report report : reports) {
            ReportDTO dto = new ReportDTO();
            dto.setTipo(report.getTipo());
            dto.setDescricao(report.getDescricao());
            dto.setSeveridade(report.getSeveridade());
            dto.setLocalizacao(report.getLocalizacao());
            dto.setCriadoEm(String.valueOf(report.getCriadoEm()));
            dtos.add(dto);
        }
        return dtos;
    }

    public static List<Report> convertListDtoToListModel(List<ReportDTO> dtos) {
        List<Report> reports = new ArrayList<>();
        for (ReportDTO dto : dtos) {
            Report model = new Report();
            model.setTipo(dto.getTipo());
            model.setDescricao(dto.getDescricao());
            model.setSeveridade(dto.getSeveridade());
            model.setLocalizacao(dto.getLocalizacao());
            model.setLocalizacao(dto.getLocalizacao());
            model.setCriadoEm(LocalDateTime.parse(dto.getCriadoEm()));
            reports.add(model);
        }
        return reports;
    }
}

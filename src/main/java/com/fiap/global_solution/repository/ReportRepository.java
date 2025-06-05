package com.fiap.global_solution.repository;

import com.fiap.global_solution.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
    @Query(value = "SELECT * FROM reports WHERE tipo = :tipo AND criado_em > :dataHoraReferencia", nativeQuery = true)
    List<Report> findReportsByTipoAndCriadoEmAfter(@Param("tipo") String tipo, @Param("dataHoraReferencia") LocalDateTime dataHoraReferencia);
    @Query(value = "SELECT * FROM reports WHERE criado_em > :dataHoraReferencia", nativeQuery = true)
    List<Report> findReportsCriadoEmAfter(@Param("dataHoraReferencia") LocalDateTime dataHoraReferencia);
    @Query(value = "SELECT * FROM reports WHERE tipo = :tipo", nativeQuery = true)
    List<Report> findReportsByTipo(@Param("tipo") String tipo);
}

package com.fiap.global_solution.repository;

import com.fiap.global_solution.model.Contribuicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContribuicaoRepository extends JpaRepository<Contribuicao, Long> {

    List<Contribuicao> findByEstado(String estado);
}

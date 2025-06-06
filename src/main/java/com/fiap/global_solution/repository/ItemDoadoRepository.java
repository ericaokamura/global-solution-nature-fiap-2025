package com.fiap.global_solution.repository;

import com.fiap.global_solution.model.ItemDoado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDoadoRepository extends JpaRepository<ItemDoado,Long> {
    List<ItemDoado> findByDoacaoId(Long id);
}

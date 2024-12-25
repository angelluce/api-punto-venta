package com.angellucero.puntoventa.repository;

import com.angellucero.puntoventa.model.Competencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetenciaRepository extends JpaRepository<Competencia, Long> {
    boolean existsByNombre(String competencia);
}

package com.angellucero.puntoventa.service;

import com.angellucero.puntoventa.model.Competencia;
import com.angellucero.puntoventa.repository.CompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompetenciaService {
    @Autowired
    private CompetenciaRepository repository;

    public List<Competencia> findAll() {
        return repository.findAll();
    }

    public Competencia save(Competencia competencia) {
        return repository.save(competencia);
    }

    public Competencia findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public boolean existsByCompetencia(String competencia) {
        return repository.existsByNombre(competencia);
    }
}

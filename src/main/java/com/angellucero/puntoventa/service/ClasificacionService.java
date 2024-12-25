package com.angellucero.puntoventa.service;

import com.angellucero.puntoventa.model.Clasificacion;
import com.angellucero.puntoventa.repository.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasificacionService {
    @Autowired
    private ClasificacionRepository repository;

    public List<Clasificacion> findAll() {
        return repository.findAll();
    }

    public Clasificacion save(Clasificacion clasificacion) {
        return repository.save(clasificacion);
    }

    public Clasificacion findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}

package com.angellucero.puntoventa.service;

import com.angellucero.puntoventa.model.Rol;
import com.angellucero.puntoventa.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RolService {
    @Autowired
    private RolRepository repository;

    public List<Rol> findAll() {
        return repository.findAll();
    }

    public Rol save(Rol producto) {
        return repository.save(producto);
    }

    public Rol findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public boolean existsByRol(String rol) {
        return repository.existsByRol(rol);
    }

    public boolean getEstadoByRol(String rol) {
        return repository.getEstadoByRol(rol);
    }
}

package com.angellucero.puntoventa.service;

import com.angellucero.puntoventa.model.Proveedor;
import com.angellucero.puntoventa.repository.ProveedorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRespository repository;

    public List<Proveedor> findAll() {
        return repository.findAll();
    }

    public Proveedor save(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    public Proveedor findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

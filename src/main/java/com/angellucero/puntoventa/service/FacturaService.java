package com.angellucero.puntoventa.service;

import com.angellucero.puntoventa.model.Factura;
import com.angellucero.puntoventa.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository repository;

    public List<Factura> findAll() {
        return repository.findAll();
    }

    public Factura save(Factura factura) {
        return repository.save(factura);
    }

    public Factura findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

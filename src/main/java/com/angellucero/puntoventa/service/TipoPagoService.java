package com.angellucero.puntoventa.service;

import com.angellucero.puntoventa.model.TipoPago;
import com.angellucero.puntoventa.repository.TipoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPagoService {
    @Autowired
    private TipoPagoRepository repository;

    public List<TipoPago> findAll() {
        return repository.findAll();
    }

    public TipoPago save(TipoPago tipoPago) {
        return repository.save(tipoPago);
    }

    public TipoPago findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}

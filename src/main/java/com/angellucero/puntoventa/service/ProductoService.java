package com.angellucero.puntoventa.service;

import com.angellucero.puntoventa.model.Producto;
import com.angellucero.puntoventa.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    public List<Producto> findAll() {
        return repository.findAll();
    }

    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    public Producto findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

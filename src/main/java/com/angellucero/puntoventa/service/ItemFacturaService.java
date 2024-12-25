package com.angellucero.puntoventa.service;

import com.angellucero.puntoventa.model.ItemFactura;
import com.angellucero.puntoventa.repository.ItemFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemFacturaService {
    @Autowired
    private ItemFacturaRepository repository;

    public List<ItemFactura> findAll() {
        return repository.findAll();
    }

    public ItemFactura save(ItemFactura itemFactura) {
        return repository.save(itemFactura);
    }

    public ItemFactura findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

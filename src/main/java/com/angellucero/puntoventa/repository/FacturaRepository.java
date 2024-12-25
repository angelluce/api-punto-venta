package com.angellucero.puntoventa.repository;

import com.angellucero.puntoventa.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}

package com.angellucero.puntoventa.repository;

import com.angellucero.puntoventa.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
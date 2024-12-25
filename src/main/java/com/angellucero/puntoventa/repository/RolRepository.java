package com.angellucero.puntoventa.repository;

import com.angellucero.puntoventa.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Long> {
    boolean existsByRol(String rol);

    boolean getEstadoByRol(String rol);
}

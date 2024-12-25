package com.angellucero.puntoventa.repository;

import com.angellucero.puntoventa.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository  extends JpaRepository<Persona, Long> {
    Persona findByDni(String dni);
}

package com.angellucero.puntoventa.service;

import com.angellucero.puntoventa.model.Persona;
import com.angellucero.puntoventa.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository repository;

    public List<Persona> findAll() {
        return repository.findAll();
    }

    public Persona save(Persona persona) {
        return repository.save(persona);
    }

    public Persona findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Persona findByDni(String dni) {
        return repository.findByDni(dni);
    }

    public String getNombreCompleto(String dni) {
        Persona persona = this.findByDni(dni);
        if (persona != null) {
            return persona.getNombre() + " " + persona.getApellido();
        }
        return "Persona no encontrada";
    }
}

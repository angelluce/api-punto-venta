package com.angellucero.puntoventa.controller;

import com.angellucero.puntoventa.model.Persona;
import com.angellucero.puntoventa.service.PersonaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/personas")
@Tag(name = "Personas", description = "CRUD para las personas")
public class PersonaController {
    @Autowired
    private PersonaService service;

    @Operation(
            summary = "Obtener todas las personas",
            description = "Devuelve una lista de todas las personas existentes"
    )
    @GetMapping
    public List<Persona> getAllPersonas() {
        return service.findAll();
    }

    @Operation(
            summary = "Obtener persona por id",
            description = "Devuelve una persona existente por id"
    )
    @GetMapping("/{id}")
    public Persona getPersonaById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Operation(
            summary = "Crear persona",
            description = "Permite registrar una nueva persona"
    )
    @PostMapping
    public Persona createPersona(@RequestBody Persona persona) {
        return service.save(persona);
    }

    @Operation(
            summary = "Actualizar persona",
            description = "Permite modificar una persona existente por id"
    )
    @PutMapping("/{id}")
    public Persona updatePersona(@PathVariable Long id, @RequestBody Persona persona) {
        persona.setId_persona(id);
        return service.save(persona);
    }

    @Operation(
            summary = "Eliminar persona",
            description = "Permite borrar una persona existente por id"
    )
    @DeleteMapping("/{id}")
    public void deletePersona(@PathVariable Long id) {
        service.deleteById(id);
    }

    @Operation(
            summary = "Obtener por dni",
            description = "Devuelve una persona existente por dni"
    )
    @GetMapping("/persona/{dni}")
    public Persona getPersonaByDni(@PathVariable String dni) {
        return service.findByDni(dni);
    }

    @Operation(
            summary = "Obtener nombre por dni",
            description = "Devuelve el nombre completo de una persona existente por dni"
    )
    @GetMapping("/nombre/{dni}")
    public String getNombreCompletoByDni(@PathVariable String dni) {
        return service.getNombreCompleto(dni);
    }
}

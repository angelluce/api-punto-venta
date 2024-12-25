package com.angellucero.puntoventa.controller;

import com.angellucero.puntoventa.model.Competencia;
import com.angellucero.puntoventa.service.CompetenciaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/competencias")
@Tag(name = "Competencias", description = "CRUD para las competencias de un rol")
public class CompetenciaController {
    @Autowired
    private CompetenciaService service;

    @Operation(
            summary = "Obtener todas las competencias",
            description = "Devuelve una lista de todas las competencias existentes"
    )
    @GetMapping
    public List<Competencia> getAllCompetencias() {
        return service.findAll();
    }

    @Operation(
            summary = "Obtener competencia por id",
            description = "Devuelve una competencia existente por id"
    )
    @GetMapping("/{id}")
    public Competencia getCompetenciaById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Operation(
            summary = "Crear competencia",
            description = "Permite registrar uns nueva competencia"
    )
    @PostMapping
    public Competencia createCompetencia(@RequestBody Competencia competencia) {
        return service.save(competencia);
    }

    @Operation(
            summary = "Actualizar competencia",
            description = "Permite modificar una competencia existente por id"
    )
    @PutMapping("/{id}")
    public Competencia updateCompetencia(@PathVariable Long id, @RequestBody Competencia competencia) {
        competencia.setId_competencia(id);
        return service.save(competencia);
    }

    @Operation(
            summary = "Eliminar competencia",
            description = "Permite borrar una competencia existente por id"
    )
    @DeleteMapping("/{id}")
    public void deleteCompetencia(@PathVariable Long id) {
        service.deleteById(id);
    }

    @Operation(
            summary = "Existe competencia",
            description = "Verifica si una competencia existe o no"
    )
    @GetMapping("/existe/{competencia}")
    public boolean existeCompetencia(@PathVariable String competencia) {
        return service.existsByCompetencia(competencia);
    }
}

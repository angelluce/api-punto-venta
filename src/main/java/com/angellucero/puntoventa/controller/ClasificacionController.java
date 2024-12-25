package com.angellucero.puntoventa.controller;

import com.angellucero.puntoventa.model.Clasificacion;
import com.angellucero.puntoventa.service.ClasificacionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clasificaciones")
@Tag(name = "Clasificaciones", description = "CRUD para las clasificaciones de productos")
public class ClasificacionController {
    @Autowired
    private ClasificacionService service;

    @Operation(
            summary = "Obtener todas las clasificaciones",
            description = "Devuelve una lista de todas las clasificaciones existentes"
    )
    @GetMapping
    public List<Clasificacion> getAllClasificaciones() {
        return service.findAll();
    }

    @Operation(
            summary = "Obtiener clasificación por id",
            description = "Devuelve una clasificación existente por id"
    )
    @GetMapping("/{id}")
    public Clasificacion getClasificacion(@PathVariable Long id) {
        return service.findById(id);
    }

    @Operation(
            summary = "Crear clasifiación",
            description = "Permite registrar una nueva clasificación"
    )
    @PostMapping
    public Clasificacion createClasificacion(@RequestBody Clasificacion clasificacion) {
        return service.save(clasificacion);
    }

    @Operation(
            summary = "Actualizar clasificación",
            description = "Permite modificar una clasificación existente por id"
    )
    @PutMapping("/{id}")
    public Clasificacion updateClasificacion(@PathVariable Long id, @RequestBody Clasificacion clasificacion) {
        clasificacion.setId_clasificacion(id);
        return service.save(clasificacion);
    }

    @Operation(
            summary = "Eliminar clasificaión",
            description = "Permite borrar una clasificación existente por id"
    )
    @DeleteMapping("/{id}")
    public void deleteClasificacion(@PathVariable Long id) {
        service.deleteById(id);
    }
}

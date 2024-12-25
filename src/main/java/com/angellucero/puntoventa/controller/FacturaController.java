package com.angellucero.puntoventa.controller;

import com.angellucero.puntoventa.model.Factura;
import com.angellucero.puntoventa.service.FacturaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
@Tag(name = "Facturas", description = "CRUD para las facturas")
public class FacturaController {
    @Autowired
    private FacturaService service;

    @Operation(
            summary = "Obtener todas las facturas",
            description = "Devuelve una lista de todas las facturas existentes"
    )
    @GetMapping
    public List<Factura> getAllFacturas() {
        return service.findAll();
    }

    @Operation(
            summary = "Obtener factura por id",
            description = "Devuelve una factura existente por id"
    )
    @GetMapping("/{id}")
    public Factura getFacturaById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Operation(
            summary = "Crear factura",
            description = "Permite registrar una nueva factura"
    )
    @PostMapping
    public Factura createFactura(@RequestBody Factura factura) {
        return service.save(factura);
    }

    @Operation(
            summary = "Actualizar",
            description = "Permite modificar una factura existente por id"
    )
    @PutMapping("/{id}")
    public Factura updateFactura(@PathVariable Long id, @RequestBody Factura factura) {
        factura.setId_factura(id);
        return service.save(factura);
    }

    @Operation(
            summary = "Eliminar factura",
            description = "Permite borrar una factura existente por id"
    )
    @DeleteMapping("/{id}")
    public void deleteFactura(@PathVariable Long id) {
        service.deleteById(id);
    }
}

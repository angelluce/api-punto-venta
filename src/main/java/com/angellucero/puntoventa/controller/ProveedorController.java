package com.angellucero.puntoventa.controller;

import com.angellucero.puntoventa.model.Proveedor;
import com.angellucero.puntoventa.service.ProveedorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
@Tag(name = "Proveedores", description = "CRUD para los proveedores")
public class ProveedorController {
    @Autowired
    private ProveedorService service;

    @Operation(
            summary = "Obtener todos los proveedores",
            description = "Devuelve una lista de todos los proveedores existentes"
    )
    @GetMapping
    public List<Proveedor> getAllProveedores() {
        return service.findAll();
    }

    @Operation(
            summary = "Obtener proveedor por id",
            description = "Devuelve un proveedor existente por id"
    )
    @GetMapping("/{id}")
    public Proveedor getProveedorById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Operation(
            summary = "Crear provedor",
            description = "Permite registrar un nuevo proveedor"
    )
    @PostMapping
    public Proveedor createProveedor(@RequestBody Proveedor proveedor) {
        return service.save(proveedor);
    }

    @Operation(
            summary = "Actualizar proveedor",
            description = "Permite modificar un proveedor existente por id"
    )
    @PutMapping("/{id}")
    public Proveedor updateProveedor(@PathVariable Long id, @RequestBody Proveedor proveedor) {
        proveedor.setId_proveedor(id);
        return service.save(proveedor);
    }

    @Operation(
            summary = "Eliminar proveedor",
            description = "Permite eliminar un proveedor existente por id"
    )
    @DeleteMapping("/{id}")
    public void deleteProveedor(@PathVariable Long id) {
        service.deleteById(id);
    }
}

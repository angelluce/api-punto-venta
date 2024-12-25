package com.angellucero.puntoventa.controller;

import com.angellucero.puntoventa.model.Rol;
import com.angellucero.puntoventa.service.RolService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
@Tag(name = "Roles", description = "CRUD para los roles")
public class RolController {
    @Autowired
    private RolService service;

    @Operation(
            summary = "Obtener todos los roles",
            description = "Devuelve una lista de todos los roles existentes"
    )
    @GetMapping
    public List<Rol> getAllRoles() {
        return service.findAll();
    }

    @Operation(
            summary = "Obtener rol por id",
            description = "Devuelve un rol existente por id"
    )
    @GetMapping("/{id}")
    public Rol getRolById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Operation(
            summary = "Crear rol",
            description = "Permite registrar un nuevo rol"
    )
    @PostMapping
    public Rol createRol(@RequestBody Rol rol) {
        return service.save(rol);
    }

    @Operation(
            summary = "Actualizar rol",
            description = "Permite modificar un rol existente por id"
    )
    @PutMapping("/{id}")
    public Rol updateRol(@PathVariable Long id, @RequestBody Rol rol) {
        rol.setId_rol(id);
        return service.save(rol);
    }

    @Operation(
            summary = "Eliminar rol",
            description = "Permite borrar un rol existente por id"
    )
    @DeleteMapping("/{id}")
    public void deleteRol(@PathVariable Long id) {
        service.deleteById(id);
    }

    @Operation(
            summary = "Existe rol",
            description = "Verifica si un rol existe o no"
    )
    @GetMapping("/existe/{rol}")
    public boolean existeRol(@PathVariable String rol) {
        return service.existsByRol(rol);
    }

    @Operation(
            summary = "Estado rol",
            description = "Devuelve el estado de un rol"
    )
    @GetMapping("/estado/{rol}")
    public boolean estadoRol(@PathVariable String rol) {
        return service.getEstadoByRol(rol);
    }
}

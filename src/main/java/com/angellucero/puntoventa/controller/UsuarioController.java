package com.angellucero.puntoventa.controller;

import com.angellucero.puntoventa.model.Usuario;
import com.angellucero.puntoventa.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@Tag(name = "Usuarios", description = "CRUD para los usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @Operation(
            summary = "Obtener todos los usuarios",
            description = "Devuelve una lista de todos los usuarios existentes"
    )
    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return service.findAll();
    }

    @Operation(
            summary = "Obtener usuario por id",
            description = "Devuelve un usuario existente por id"
    )
    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Operation(
            summary = "Crear usuario",
            description = "Permite registrar un nuevo usuario"
    )
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return service.save(usuario);
    }

    @Operation(
            summary = "Actualizar usuario",
            description = "Permite modificar un usuario existente por id"
    )
    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setId_usuario(id);
        return service.save(usuario);
    }

    @Operation(
            summary = "Eliminar usuario",
            description = "Permite borrar un usuario existente por id"
    )
    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        service.deleteById(id);
    }

    @Operation(
            summary = "Existe usuario",
            description = "Verifica si un usuario existe o no"
    )
    @GetMapping("/existe/{usuario}")
    public boolean existeUsuario(@PathVariable String usuario) {
        return service.existsByUsuario(usuario);
    }
}

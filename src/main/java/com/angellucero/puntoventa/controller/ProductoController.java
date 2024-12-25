package com.angellucero.puntoventa.controller;

import com.angellucero.puntoventa.model.Producto;
import com.angellucero.puntoventa.service.ProductoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
@Tag(name = "Productos", description = "CRUD para los productos")
public class ProductoController {
    @Autowired
    private ProductoService service;

    @Operation(
            summary = "Obtener todos los productos",
            description = "Devuelve una lista de todos los productos existentes"
    )
    @GetMapping
    public List<Producto> getAllProductos() {
        return service.findAll();
    }

    @Operation(
            summary = "Obtener producto por id",
            description = "Devuelve un producto existente por id"
    )
    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Operation(
            summary = "Crear producto",
            description = "Permite registrar un nuevo producto"
    )
    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return service.save(producto);
    }

    @Operation(
            summary = "Actualizar producto",
            description = "Permite modificar un producto existente por id"
    )
    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
        producto.setId_producto(id);
        return service.save(producto);
    }

    @Operation(
            summary = "Eliminar producto",
            description = "Permite borrar un producto existente por id"
    )
    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id) {
        service.deleteById(id);
    }
}

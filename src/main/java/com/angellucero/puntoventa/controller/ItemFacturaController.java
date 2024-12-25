package com.angellucero.puntoventa.controller;

import com.angellucero.puntoventa.model.ItemFactura;
import com.angellucero.puntoventa.service.ItemFacturaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/items_factura")
@Tag(name = "Item factura", description = "CRUD para los items de una factura")
public class ItemFacturaController {
    @Autowired
    private ItemFacturaService service;

    @Operation(
            summary = "Obtener todos los items",
            description = "Devuelve una lista de todos los items de facturas existentes"
    )
    @GetMapping
    public List<ItemFactura> getAllItemFacturas() {
        return service.findAll();
    }

    @Operation(
            summary = "Obtener item por id",
            description = "Devuelve un item de una factura existente por id"
    )
    @GetMapping("/{id}")
    public ItemFactura getItemFacturaById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Operation(
            summary = "Crear item factura",
            description = "Permite registrar un nuevo item de factura"
    )
    @PostMapping
    public ItemFactura createItemFactura(@RequestBody ItemFactura itemFactura) {
        return service.save(itemFactura);
    }

    @Operation(
            summary = "Actualizar item factura",
            description = "Permite modificar un item de factura existente por id"
    )
    @PutMapping("/{id}")
    public ItemFactura updateItemFactura(@PathVariable Long id, @RequestBody ItemFactura itemFactura) {
        itemFactura.setId_item_factura(id);
        return service.save(itemFactura);
    }

    @Operation(
            summary = "Eliminar item factura",
            description = "Permite borrar un item de factura existente por id"
    )
    @DeleteMapping("/{id}")
    public void deleteItemFactura(@PathVariable Long id) {
        service.deleteById(id);
    }
}

package com.angellucero.puntoventa.controller;

import com.angellucero.puntoventa.model.TipoPago;
import com.angellucero.puntoventa.service.TipoPagoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-pago")
@Tag(name = "Tipos de pago", description = "CRUD para los tipos de pago")
public class TipoPagoController {
    @Autowired
    private TipoPagoService service;

    @Operation(
            summary = "Obtener todos los tipos de pago",
            description = "Devuelve una lista con todos los tipos de pago existentes"
    )
    @GetMapping
    public List<TipoPago> getAllTiposPago() {
        return service.findAll();
    }

    @Operation(
            summary = "Obtener tipo de pago por id",
            description = "Devuelve un tipo de pago existente por id"
    )
    @GetMapping("/{id}")
    public TipoPago getTipoPagoById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Operation(
            summary = "Crear tipo de pago",
            description = "Permite registrar un nuevo tipo de pago"
    )
    @PostMapping
    public TipoPago createTipoPago(@RequestBody TipoPago tipoPago) {
        return service.save(tipoPago);
    }

    @Operation(
            summary = "Actualizar tipo de pago",
            description = "Permite modificar un tipo de pago existente por id"
    )
    @PutMapping("/{id}")
    public TipoPago updateTipoPago(@PathVariable Long id, @RequestBody TipoPago tipoPago) {
        tipoPago.setId_tipo_pago(id);
        return service.save(tipoPago);
    }

    @Operation(
            summary = "Eliminar tipo de pago",
            description = "Permite borrar un tipo de pago existente por id"
    )
    @DeleteMapping("/{id}")
    public void deleteTipoPago(@PathVariable Long id) {
        service.deleteById(id);
    }
}

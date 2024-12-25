package com.angellucero.puntoventa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ItemFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_item_factura;

    @ManyToOne
    @JoinColumn(name = "id_factura", nullable = false)
    private Factura id_factura;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto id_producto;

    @NotBlank
    private int cantidad;

    @NotBlank
    private double precio;

    @NotBlank
    private double subtotal;


}

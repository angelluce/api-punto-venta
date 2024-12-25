package com.angellucero.puntoventa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;

    @NotEmpty
    private int stock;

    @NotEmpty
    private Double precio_unitario;

    @NotEmpty
    private String unidad;

    @ManyToOne
    @JoinColumn(name = "id_clasificacion", nullable = false)
    private Clasificacion id_clasificacion;

    @ManyToOne
    @JoinColumn(name = "id_proveedor", nullable = false)
    private Proveedor id_proveedor;

    @NotEmpty
    private boolean iva;

    @OneToMany(mappedBy = "id_producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemFactura> items_producto;

}


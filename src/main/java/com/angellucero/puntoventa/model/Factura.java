package com.angellucero.puntoventa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_factura;

    @NotBlank
    private String ruc;

    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona id_persona;

    @NotBlank
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pago", nullable = false)
    private TipoPago id_tipo_pago;

    @NotBlank
    private double descuento;

    @NotBlank
    private double total;

    @OneToMany(mappedBy = "id_factura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemFactura> items_factura;
}

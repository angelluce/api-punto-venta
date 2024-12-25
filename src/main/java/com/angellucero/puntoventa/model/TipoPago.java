package com.angellucero.puntoventa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_pago;

    @NotBlank
    private String tipo;

    @NotBlank
    private String descrip;

    @OneToMany(mappedBy = "id_tipo_pago", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas;

}

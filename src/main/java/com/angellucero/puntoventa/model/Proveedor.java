package com.angellucero.puntoventa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proveedor;

    @NotBlank
    private String ruc;

    @NotBlank
    private String telefono;

    @NotBlank
    private String pais;

    @NotBlank
    private String correo;

    @NotBlank
    private String moneda;

    @OneToMany(mappedBy = "id_producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> productos;
}

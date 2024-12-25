package com.angellucero.puntoventa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Clasificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_clasificacion;

    @NotBlank
    private String grupo;

    @OneToMany(mappedBy = "id_producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> productos;
}

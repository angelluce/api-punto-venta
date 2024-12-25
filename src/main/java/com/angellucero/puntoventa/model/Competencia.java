package com.angellucero.puntoventa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Competencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_competencia;

    @NotBlank
    private String nombre;

    @NotBlank
    private String descripcion;


    @ManyToMany(mappedBy = "competencias")
    private Set<Rol> roles;
}

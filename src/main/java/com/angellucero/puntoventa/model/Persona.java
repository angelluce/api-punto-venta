package com.angellucero.puntoventa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotBlank
    private String dni;

    @NotBlank
    private String celular;

    @NotBlank
    private String correo;

    @OneToMany(mappedBy = "id_factura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas;

    @OneToMany(mappedBy = "id_usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Usuario> usuarios;
}

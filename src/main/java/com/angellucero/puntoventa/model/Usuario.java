package com.angellucero.puntoventa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona id_persona;

    @NotBlank
    private String usuario;

    @NotBlank
    private String password;

    @ManyToMany(mappedBy = "usuarios")
    private Set<Rol> roles;
}

package com.angellucero.puntoventa.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API de Punto de Venta",
                version = "1.0",
                description = "Documentación de la API para la gestión de punto de venta.",
                contact = @Contact(
                        name = "Angel Lucero",
                        email = "angelluce244@gmail.com",
                        url = "https://angelluce.github.io/cv/"
                )
        )
)
public class SwaggerConfig {
}

# API de Punto de Venta

Proyecto desarrollado para la gestión de punto de venta usando Java 21, Spring 3.4.1 y Maven para el API, junto a una 
configuración a la base de datos con PostgreSQL, además de implementar contenedores con Docker.

## Diagrama de clases el proyecto

![Diagrama de clases](/images/diagrama.png)

## Estructura del proyecto

```
├── src/ 
    └── main/
        ├── java/
            └── com.angellucero.puntoventa/
                ├── controller/
                ├── model/
                ├── repository/
                └── service/
        └── resources/
            ├── aplication.properties
            └── data.sql
├── Dockerfile 
├── docker-compose.yml 
├── pom.xml
├── README.md
└── punto-venta-0.0.1-SNAPSHOT.jar
```

### Archivos principales

- **`Dockerfile`**  
  Contiene las instrucciones para construir la imagen Docker de la aplicación.

- **`docker-compose.yml`**  
  Define los servicios necesarios (aplicación y base de datos) para ejecutar el proyecto en contenedores Docker.

- **`pom.xml`**  
  Archivo de configuración de Maven que incluye las dependencias del proyecto, el plugin para generar el `.jar`, y otros parámetros de construcción.

- **`README.md`**  
  Documentación principal del proyecto.

### Descripción de carpetas principales

- **`src/main/java/`**: Contiene el código fuente principal de la aplicación en Java.
  - **`controller/`**: Clases que manejan las solicitudes HTTP y respuestas de la API REST.
  - **`model/`**: Clases que representan las entidades del proyecto.
  - **`repository/`**: Interfaces que extienden `JpaRepository` para acceder a la base de datos.
  - **`service/`**: Lógica de negocio de la aplicación.

- **`src/main/resources/`**: Archivos de configuración y recursos estáticos.
  - **`application.properties`**: Archivo de configuración de Spring Boot.

## Construir y ejecutar el proyecto

### Requisitos previos para desarrollo

- Java 21
- Maven 3.9.9
- Docker y Docker Compose

### Pasos

1. Construir el `.jar` con el siguiente comando:

```bash
mvn clean package
```

2. Levantar contenedores con Docker mediante Docker Compose:

```bash
docker-compose up --build
```

3. Acceder a la aplicación que estará disponible en http://localhost:9898.




## En ejecución

![API con Swagger](/images/swagger.png)
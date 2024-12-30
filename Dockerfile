# Dockerfile
# Usar una imagen base de Java 21
FROM eclipse-temurin:21-jdk-alpine

# Copiar el JAR de la aplicación al contenedor
COPY target/punto-venta-0.0.1-SNAPSHOT.jar app.jar


# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]

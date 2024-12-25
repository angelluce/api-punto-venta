# Dockerfile
# Usar una imagen base de Java 21
FROM eclipse-temurin:21-jdk-alpine

# Setear el directorio de trabajo
WORKDIR /app

# Copiar el JAR de la aplicación al contenedor
COPY punto-venta-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto donde correrá la app
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]

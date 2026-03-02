# Imagen base con Java 21
FROM eclipse-temurin:21-jdk

# Carpeta de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado
COPY target/inventario-0.0.1-SNAPSHOT.jar app.jar

# Puerto que usa Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java","-jar","app.jar"]

# Estágio 1: Build
FROM maven:3.9.6-eclipse-temurin-25 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
# Compila o projeto e gera o JAR, pulando testes para agilizar
RUN mvn clean package -DskipTests

# Estágio 2: Runtime
FROM eclipse-temurin:25-jre-alpine
WORKDIR /app
# Copia apenas o jar gerado no estágio anterior
COPY --from=build /app/target/*.jar app.jar
EXPOSE 1910
ENTRYPOINT ["java", "-jar", "app.jar"]

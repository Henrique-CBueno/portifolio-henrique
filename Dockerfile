# Estágio de build
FROM eclipse-temurin:25-jdk-alpine AS build
WORKDIR /app

# Copia os arquivos necessários para o Maven (aproveita cache de dependências)
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
# Dá permissão de execução ao wrapper do Maven
RUN chmod +x mvnw
# Baixa as dependências offline
RUN ./mvnw dependency:go-offline

# Copia o código fonte e compila
COPY src ./src
RUN ./mvnw clean package -DskipTests

# Estágio de execução
FROM eclipse-temurin:25-jre-alpine
WORKDIR /app

# Copia o arquivo .jar gerado no primeiro estágio
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta 80 conforme solicitado
EXPOSE 1910

# Configura as variáveis de ambiente base para a JVM rodar na porta 80
ENV SERVER_PORT=1910

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]

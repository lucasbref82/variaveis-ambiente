FROM openjdk:17-slim
WORKDIR /app

# Copia os arquivos essenciais para o Gradle Wrapper funcionar
COPY gradlew .
COPY gradle/wrapper gradle/wrapper
COPY build.gradle .
COPY settings.gradle .
COPY src /app/src

RUN chmod +x gradlew
RUN apt-get update && apt-get install -y findutils

# Constrói a aplicação
RUN ./gradlew --no-daemon clean build --stacktrace

# Copia o JAR gerado
COPY build/libs/*.jar app.jar

EXPOSE 80

ENTRYPOINT ["java", "-jar", "app.jar"]

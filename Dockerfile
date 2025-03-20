FROM openjdk:17-slim
WORKDIR /app

COPY gradlew .
COPY gradle/wrapper gradle/wrapper
COPY build.gradle .
COPY settings.gradle .
COPY src /app/src

RUN chmod +x gradlew
RUN apt-get update && apt-get install -y findutils

RUN ./gradlew --no-daemon clean build --stacktrace

COPY build/libs/*.jar app.jar

EXPOSE 80

ENTRYPOINT ["java", "-jar", "app.jar"]

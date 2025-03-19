FROM openjdk:17-jdk-slim
WORKDIR /app

COPY gradlew .
COPY gradle /gradle
COPY build.gradle .
COPY settings.gradle .

RUN chmod +x gradlew
RUN ./gradlew build --no-daemon

COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
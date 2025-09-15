FROM openjdk:17-jdk-buster

WORKDIR /app

COPY build/libs/temperature-api-0.0.1-SNAPSHOT.jar app.jar

ENV PORT=8081

EXPOSE ${PORT}

CMD ["java", "-Dserver.port=${PORT}", "-jar", "/app/app.jar"]
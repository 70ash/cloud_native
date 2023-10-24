FROM openjdk:8-jdk-slim
LABEL maintainer=70ash

COPY target/*.jar   /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
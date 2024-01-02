FROM openjdk:17-alpine
MAINTAINER NICO
COPY target/api_consecionaria_autos-0.0.1-SNAPSHOT.jar  api_consecionaria_autos-app.jar
ENTRYPOINT ["java","-jar","/api_consecionaria_autos-app.jar"]
EXPOSE 8080
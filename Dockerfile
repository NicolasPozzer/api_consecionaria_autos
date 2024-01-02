FROM alpine:3.17
ARG version=17.0.9.8.1
MAINTAINER NICO
COPY target/api_consecionaria_autos-0.0.1-SNAPSHOT.jar  api_consecionaria_autos-app.jar
ENTRYPOINT ["java","-jar","/api_consecionaria_autos-app.jar"]
EXPOSE 8080
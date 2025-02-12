FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceConfig-0.0.1-SNAPSHOT.jar config.jar
EXPOSE 8888
ENTRYPOINT [ "java","-jar","config.jar" ]
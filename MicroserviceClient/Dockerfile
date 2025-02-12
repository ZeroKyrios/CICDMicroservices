FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceClient-0.0.1-SNAPSHOT.jar client.jar
EXPOSE 8085
ENTRYPOINT [ "java","-jar","client.jar" ]
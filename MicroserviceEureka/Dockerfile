FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceEureka-1.0.0.jar erureka.jar
EXPOSE 9999
ENTRYPOINT [ "java","-jar","erureka.jar" ]
From openjdk:8-jdk-alpine
WORKDIR "spring-boot-app"
COPY /target/File-Service-0.0.1-SNAPSHOT.jar File-Service.jar
EXPOSE 7868
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","File-Service.jar"]
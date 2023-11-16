FROM openjdk:8
ADD target/spring-boot-mongodb-docker-compose.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
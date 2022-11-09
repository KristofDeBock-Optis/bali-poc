# DEFINE A BASE DOCKER IMAGE
FROM openjdk:17
ADD target/firstmicroservice-0.0.1.jar firstmicroservice.jar
ENTRYPOINT ["java", "-jar", "firstmicroservice.jar" ]
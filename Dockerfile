FROM openjdk:8
ADD target/docker-spring.jar docker-spring.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar","docker-spring.jar"]


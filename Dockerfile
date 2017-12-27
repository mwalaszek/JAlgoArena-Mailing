FROM openjdk:8-jdk-alpine
ADD /build/libs/jalgoarena-mailing-0.1.0.jar app.jar
EXPOSE 5666
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=dev","-jar","/app.jar"]
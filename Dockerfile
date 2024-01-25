FROM amazoncorretto:21-alpine-jdk
ARG JAR_FILE=*.jar
ARG PROFILES
ARG ENV
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}", "-jar", "app.jar"]

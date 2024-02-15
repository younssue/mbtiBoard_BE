FROM amazoncorretto:21-alpine-jdk
ARG JAR_FILE=./build/libs/BoardProject-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java",  "-jar","-Dspring.profiles.active=dev" ,"-Duser.timezone=Asia/Seoul", "/app.jar"]

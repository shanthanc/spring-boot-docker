FROM amazoncorretto:18-alpine-jdk
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
COPY build/libs/spring-boot-docker-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]
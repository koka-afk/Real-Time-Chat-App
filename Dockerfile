FROM openjdk:26-oraclelinux9

WORKDIR /app

COPY target/*.jar chat-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "chat-app.jar"]
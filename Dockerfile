FROM mcr.microsoft.com/openjdk/jdk:21-azurelinux
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

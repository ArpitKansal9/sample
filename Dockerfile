FROM openjdk:18
WORKDIR /app
COPY ./target/sample-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "sample-0.0.1-SNAPSHOT.jar"]
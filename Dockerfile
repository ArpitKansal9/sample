# Set the working directory in the container
WORKDIR /app

# Copy the Maven wrapper files (if you're using Maven)
COPY mvnw .
COPY .mvn .mvn

# Copy the project description file(s) and install dependencies
COPY pom.xml .
RUN ./mvnw dependency:go-offline

# Copy the project source code
COPY src src

# Package the application
RUN ./mvnw package -DskipTests

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file from the build stage to the runtime image
COPY --from=build /app/target/*.jar app.jar

# Expose the port that the application runs on
EXPOSE 8080

# Specify the command to run the application
CMD ["java", "-jar", "app.jar"]

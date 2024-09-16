# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file from the host to the container
COPY target/Backend-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port your Spring Boot application runs on
EXPOSE 8081

# Set the environment variable to specify that the application is running in production
ENV SPRING_PROFILES_ACTIVE=prod

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]

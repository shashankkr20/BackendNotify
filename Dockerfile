# Use a base image with Java installed
FROM openjdk:17-jdk-slim

# Create a directory for your application
WORKDIR /app

# Copy your JAR file into the container
COPY target/*.jar /app/app.jar

# Set the command to run your JAR file
CMD ["java", "-jar", "/app/app.jar"]

# Expose the port your app runs on (optional)
EXPOSE 8080

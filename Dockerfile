# Use Maven image to build and run tests
FROM maven:3.9.9-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy everything
COPY . .

# Build and test
RUN mvn clean package

# Use smaller runtime image
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copy the compiled jar from previous stage
COPY --from=build /app/target/numbers-util-1.0-SNAPSHOT.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]

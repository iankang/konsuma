FROM maven:3.9-amazoncorretto-17 AS builder
COPY pom.xml /app/
COPY src /app/src
RUN --mount=type=cache,target=/root/.m2 mvn -f /app/pom.xml clean package -DskipTests

#Run
FROM bellsoft/liberica-openjdk-alpine:17
COPY --from=builder /app/target/konsuma-1.jar app.jar
EXPOSE 1402
#ENV SPRING_PROFILES_ACTIVE=production
ENTRYPOINT ["java", "-jar", "app.jar"]
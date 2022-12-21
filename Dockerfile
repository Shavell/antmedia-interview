# Used multi-section dockerfile
FROM maven:3.6.3-adoptopenjdk-11-openj9 as jdk
RUN mkdir /app
WORKDIR /app
# For pre-cached mvn install operations
COPY pom.xml .
RUN mvn dependency:go-offline

COPY . .
RUN mvn clean package

FROM openjdk:11.0.2-jre-slim as jre
RUN mkdir /app
WORKDIR /app

COPY --from=jdk /app/target/example.jar .
# only for this case
RUN mkdir -p /app/src/main/resources/example/
COPY --from=jdk /app/src/main/resources/example/sample_960x400_ocean_with_audio.flv src/main/resources/example/

# java binary is entrypoint
ENTRYPOINT ["/usr/bin/java"]
CMD ["-Xms256m", "-Xmx256m", "-jar", "example.jar"]
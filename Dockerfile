FROM openjdk:8-jre-alpine
ADD /src/main/resources/application.properties //
ADD /src/main/resources/application.yml //
ADD /src/main/resources/db-config.properties //
ADD /src/main/resources/db-config-k8s.properties //

ADD /target/demo-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "/demo-0.0.1-SNAPSHOT.jar"]

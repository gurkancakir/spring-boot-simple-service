FROM openjdk:11-jre-slim

ENV JAVA_OPTS " -Xms512m -Xmx512m "

WORKDIR application

COPY build/libs/simple-service-0.0.1-SNAPSHOT.jar ./

ENTRYPOINT ["java", "-jar", "simple-service-0.0.1-SNAPSHOT.jar"]
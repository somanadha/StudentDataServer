FROM openjdk:24-slim-bullseye
ADD target/student-data-server.jar student-data-server.jar
ENTRYPOINT ["java", "-jar", "student-data-server.jar"]
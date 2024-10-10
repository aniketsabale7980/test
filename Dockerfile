FROM openjdk:21 as bootcode
WORKDIR .
COPY . .
CMD [ "java", "-jar", "Docker-testing-0.0.1-SNAPSHOT.jar" ]

FROM java:8

EXPOSE 8080

ADD target/docker_v2.jar docker_v2.jar

ENTRYPOINT ["java", "-jar", "docker_v2.jar"]


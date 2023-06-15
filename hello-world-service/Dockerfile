FROM openjdk:8-jdk-alpine
EXPOSE 8081
ADD target/hello-world.jar hello-world.jar
ENTRYPOINT ["sh", "-c", "java -jar /hello-world.jar"]
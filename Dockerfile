FROM openjdk:17
EXPOSE 8181
ADD target/demo2-0.0.1-snapshot.jar demo2-0.0.1-snapshot.jar
ENTRYPOINT ["java","-jar","demo2-0.0.1-snapshot.jar"]
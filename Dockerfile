FROM openjdk:21

ADD target/springpostgresapp.jar springapp.jar

ENTRYPOINT ["java","-jar","springapp.jar"]
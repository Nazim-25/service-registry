FROM openjdk:11 
EXPOSE 8061

ADD target/service-registry.jar service-registry.jar
ENTRYPOINT ["java","-jar", "/service-registry.jar"]

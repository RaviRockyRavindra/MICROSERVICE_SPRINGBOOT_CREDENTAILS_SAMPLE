FROM openjdk:8
EXPOSE 8088
ADD target/Microservice-Buyer-0.0.1-SNAPSHOT.jar .
RUN echo "ls"
ENTRYPOINT ["java","-jar","Microservice-Buyer-0.0.1-SNAPSHOT.jar"]


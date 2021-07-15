FROM openjdk:8

# Add a volume pointing to /home on the host machine
VOLUME /home

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/Final_Event-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} Final_Event-0.0.1-SNAPSHOT.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","Final_Event-0.0.1-SNAPSHOT.jar"]
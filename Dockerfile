# get ubuntu base image to build on
FROM ubuntu:latest

# update packages
RUN apt-get update

# install openJdk 17
RUN apt-get install -y openjdk-17-jdk

# set JAVA_HOME environment variable
ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk-17*/

# copy the jar file
COPY ./target/*.jar /app/
# CMD sed -i 's/\r$//' /app/calculator.sh

ENTRYPOINT ["java", "-jar", "/app/Calculator_Mini_Project-1.0.0-SNAPSHOT.jar"]
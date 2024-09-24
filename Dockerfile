# Method 1: Use ubuntu as base image and then install openjdk over it - not efficient
# # get ubuntu base image to build on
# FROM ubuntu:latest

# # update packages
# RUN apt-get update

# # install openJdk 17
# RUN apt-get install -y openjdk-17-jdk

# # set JAVA_HOME environment variable
# ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk-17*/


# Method 2: Directly use openjdk as base image
FROM openjdk:17-jdk

# copy the jar file
COPY ./target/*.jar /app/
# CMD sed -i 's/\r$//' /app/calculator.sh

ENTRYPOINT ["java", "-jar", "/app/Calculator_Mini_Project-1.0.0-SNAPSHOT.jar"]

# we can directly use image of openjdk, it will be faster. (try later to use it in project)
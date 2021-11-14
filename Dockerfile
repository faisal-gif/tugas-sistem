FROM openjdk:8-jdk-alpine
MAINTAINER Fa
RUN mkdir -p /app
WORKDIR /app

COPY FinalProject.java /app

#compile file java
RUN javac FinalProject.java

#running java
CMD ["java","FinalProject"]

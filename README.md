# Synonyms-finding-REST-API-in-Java

#### REST API to request synonyms of a word

#### Developed in Java using SpringBoot, Maven for web layer dependency management, and JUnit for
#### automated unit testing

## Instructions to run on terminal/command line : 

To build:
  mvn clean package

To run tests and coverage report:
  mvn clean verify

To run checkstyle report:
  mvn checkstyle:checkstyle

To run:
  mvn spring-boot:run

URL format:
    http://localhost:8080/words/<letters>

Example command line usage:
    > curl http://localhost:8080/words/hat


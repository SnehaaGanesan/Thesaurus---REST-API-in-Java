# Thesaurus - A REST API in Java

##### - This is an API to request the synonyms of a word, much like a thesaurus.

##### - It is developed in Java using SpringBoot application framework, Maven for web layer dependency management, and JUnit for automated unit testing

### Instructions to run on terminal/command line : 

To build:
  mvn clean package

To run tests and coverage report:
  mvn clean verify

To run checkstyle report:
  mvn checkstyle:checkstyle

To run:
  mvn spring-boot:run

URL format:
    http://<i></i>localhost:8080/words/come

Example command line usage:
    > curl http://<i></i>localhost:8080/words/come


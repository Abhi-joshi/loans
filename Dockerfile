FROM amazoncorretto:17
MAINTAINER abhishek
COPY target/loans-0.0.1-SNAPSHOT.jar loans-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/loans-0.0.1-SNAPSHOT.jar"]
FROM anapsix/alpine-java:jdk8
WORKDIR /
EXPOSE 8070
# to deploy by jenkins add proper app name below (here is api-0.0.1-SNAPSHOT.jar):
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/apidep/api-0.0.1-SNAPSHOT.jar"] 




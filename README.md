# spring-concepts
Testing concepts related to Spring Boot

------------------------------------------

Docker deployment (for jenkins)

// TODO jenkins job, pipeline, deployment folders, etc.

$ sudo docker-compose up --build

// test spring boot app

http://localhost:7000/balance/9999-999-999

// check container_name

$ sudo docker ps

--------------------------------------------

// to rebuild application:

// update jar in deployment folder (jenkins)

$ sudo docker stop container_name

$ sudo docker start container_name
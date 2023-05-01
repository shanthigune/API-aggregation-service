# API-aggregation-service

# Description
API-aggregation-service for consolidating the interface with these external APIs into a single endpoint that can handle multiple logical requests in one network request

# Technology

-java 17

-gradle

-spring boot

-rest api

# setup guide
1. pull required service image from docker hub - docker pull xyzassessment/backend-services
2. start up docker image in port 8080 - docker run --publish 8081:8081 xyzassessment/backend-services
3. start up API-aggregation-service in port 8081 - gradle boot run
4. test api - curl --location 'http://localhost:8081/aggregation?pricing=NL%2CCN&track=109347263%2C123456891&shipments=109347263%2C123456891'
5. todo - pending to develop task 2 and 3. tried the concept here need more time-ThrottledApiCalls.java
6. test results can be find here - API-aggregation-service/src/test/java/postman-test-results
7. application flow chart - Flowchart.png
 

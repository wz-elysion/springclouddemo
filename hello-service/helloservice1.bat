cd target
java -jar hello-service-1.0-SNAPSHOT.jar --server.port=8081 --eureka.client.service-url.defaultZone=http://peer1:1111/eureka,http://peer2:1112/eureka
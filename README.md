# Kotlin - Spring Boot 2 - Spring Cloud Greenwich - Spring Cloud Stream Fishtown - Kafka Broker 2.1

## Run docker images for Zookeeper & Kafka

```console
./run_containers.sh
```

## Run the application

```console
mvn spring-boot:run
```

## Send a message to Kafka by invoking the REST API

```console
curl http://localhost:8080/process -v
```

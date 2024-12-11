# Yanki Microservice (microservicio05)

## Description

Yanki is a microservice designed to offer a mobile wallet solution, allowing users to send and receive payments quickly and easily, using only their mobile number. This system is designed to integrate with the bank's platforms, offering flexibility and accessibility for both clients and non-clients.

## Pre - requisites

- **Java 20**
- **Maven**
- **Docker** (for Docker execution only)
- Red Docker compartida: `my-network`

## Initial Configuration

### Run Locally

#### Modify the file`bootstrap.yml`

Configure the active profile to use Docker:

```yaml
spring:
  profiles:
    active: local
```

#### Execute the Main Class

```yaml
mvn spring-boot:run
```

Alternatively, if using an IDE (e.g., IntelliJ IDEA, Eclipse), navigate to the Microservicio05Application class and run it directly.

### Run Docker

#### Modify the file`bootstrap.yml`

Configure the active profile to use Docker:

```yaml
spring:
  profiles:
    active: docker
```
#### Compile and generate the Docker container
Build the Docker image with:

```yaml
docker build -t microservicio05:0.0.1-SNAPSHOT .
```

####  Run the microservice Docker container
Start the container with:

```yaml
docker run --name microservicio05 --network my-network -p 8085:8085 microservicio05:0.0.1-SNAPSHOT
```

## Resources:
- **Resource link  - https://github.com/evalladares-t/resource-bootcamp57**
- **Link github  - https://github.com/evalladares-t**

## Notes:
- **If you need to change ports or other settings, edit the corresponding application.yml and Dockerfile files.**
- **To debug errors, check the container logs:**
    ```yaml
    docker logs microservicio05
    ``` 
- **Make sure that the Config Server and Registry Server are running before starting other services.**

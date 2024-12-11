package com.nttdata.bootcamp.microservicio05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
@SpringBootApplication
public class Microservicio05Application {

  public static void main(String[] args) {
    SpringApplication.run(Microservicio05Application.class, args);
  }
}

package com.godeltech.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import validation.ProtoValidationService;

@SpringBootApplication
public class UserServiceApplication {
  @Bean
  public ProtoValidationService validationService() {
    return new ProtoValidationService();
  }

  public static void main(String[] args) {
    SpringApplication.run(UserServiceApplication.class, args);
  }
}

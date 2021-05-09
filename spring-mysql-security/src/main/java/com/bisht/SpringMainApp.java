package com.bisht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringMainApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringMainApp.class, args);
    }
}

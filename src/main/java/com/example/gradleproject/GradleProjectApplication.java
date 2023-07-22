package com.example.gradleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleProjectApplication {

    public static void main(String[] args) {
        System.out.println("Invoking main method");
        SpringApplication.run(GradleProjectApplication.class, args);
    }

}

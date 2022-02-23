package com.example.emall;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EmallApplication extends SpringBootServletInitializer {
        public static void main(String[] args) {
        SpringApplication.run(EmallApplication.class, args);
    }

}

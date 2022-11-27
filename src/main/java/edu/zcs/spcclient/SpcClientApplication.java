package edu.zcs.spcclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("edu.zcs.news")
public class SpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpcClientApplication.class, args);
    }

}

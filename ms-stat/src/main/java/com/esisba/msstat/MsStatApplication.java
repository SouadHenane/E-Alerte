package com.esisba.msstat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsStatApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsStatApplication.class, args);
    }

}

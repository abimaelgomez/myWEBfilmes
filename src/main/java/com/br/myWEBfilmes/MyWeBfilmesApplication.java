package com.br.myWEBfilmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MyWeBfilmesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyWeBfilmesApplication.class, args);
    }

}

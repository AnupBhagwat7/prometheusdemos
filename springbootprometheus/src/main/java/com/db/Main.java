package com.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public String replyRoot(){
        Thread t1 = new Thread(() -> {
            System.out.println("Thread is running");
        });
        t1.start();

        return "Hello There , Root!!!";
    }

    @GetMapping("/hello")
    public String reply(){
        return "Hello There!!!";
    }

}


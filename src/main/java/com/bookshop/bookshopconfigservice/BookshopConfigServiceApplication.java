package com.bookshop.bookshopconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BookshopConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshopConfigServiceApplication.class, args);
    }

}

package com.example.mongotransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class MongoTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoTransactionApplication.class, args);
    }

}

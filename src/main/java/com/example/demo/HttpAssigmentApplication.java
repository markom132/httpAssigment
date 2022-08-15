package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class HttpAssigmentApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(HttpAssigmentApplication.class, args);
        Database database = new Database();
        database.createDatabase();
    }

}

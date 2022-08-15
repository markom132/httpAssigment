package com.example.demo;

import com.example.demo.model.Employee;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Database {
    String url = "jdbc:mysql://localhost:3306/employees";
    String username = "root";
    String password = "root";
    String sql = "CREATE DATABASE IF NOT EXISTS employees";


    public void createDatabase() throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Database() {
    }




}

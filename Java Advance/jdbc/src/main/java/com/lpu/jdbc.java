package com.lpu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbc{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 1;
        Class.forName("org.postgresql.Driver");

        //step2;
        String url = "jdbc:postgresql://localhost:5432/lpu";
        String user = "postgres";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, user, password);

        //step 3;
        Statement statement = connection.createStatement();

        // step 4
        String insertSql = "INSERT INTO student (id, name, course) VALUES (1, 'Harsh','CSE')";
        statement.execute(insertSql);
        System.out.println("Data inserted successfully");

        // step 5
        statement.close();
        connection.close();
    }
}
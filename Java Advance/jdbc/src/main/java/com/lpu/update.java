package com.lpu;

import java.io.InputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class update{
    public static void main(String[] args) throws IOException, SQLException {
        // Load properties
        InputStream stream = update.class.getClassLoader().getResourceAsStream("dbdata.properties");
        Properties properties = new Properties();
        properties.load(stream);

        // Connect using properties
        Connection connection = DriverManager.getConnection(
            properties.getProperty("url"),
            properties.getProperty("user"),
            properties.getProperty("password")
        );

        /* Correct SQL  */
        // for updating name of student with id 1 to HarshKumar
        // String updateSql = "UPDATE student SET name=? WHERE id=?";

        //for updating id
        String updateSql = "UPDATE student SET id=? WHERE id=?";


        /*  Prepare statement 1 for name */
        PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
        preparedStatement.setString(1, "Harsh"); // ? -> 1, sets name as HarshK
        preparedStatement.setInt(2, 1); // ? -> 2 , for id 1

        /* Prepare statement 2 for id */ 
        // PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
        // preparedStatement.setInt(1, 1); // ? -> 1, sets id as 2
        // preparedStatement.setInt(2, 2); // ? -> 2 , for id 1

        // Execute update
        int updatedCount = preparedStatement.executeUpdate();
        System.out.println("Updated rows number is " + updatedCount);

        // Close connection
        connection.close();
    }
}
package com.lpu;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class fetch {
	public static void main(String []args) throws SQLException, IOException{
		FileInputStream fileInputStream=new FileInputStream("dbdata.properities");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		String url=properties.getProperty("url");
		String user=properties.getProperty("user");
		String password=properties.getProperty("password");
		Connection connection=DriverManager.getConnection(url,user,password);
		String fetchSql="SELECT * FROM student";
		PreparedStatement preparedStatement=connection.prepareStatement(fetchSql);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.print("id is :"+resultSet.getInt("id"));
			System.out.print("name is :"+resultSet.getString("name"));
			System.out.print("course is :"+resultSet.getString("course"));
		}
		connection.close();
}
}
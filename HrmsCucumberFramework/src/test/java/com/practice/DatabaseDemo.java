package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class DatabaseDemo {
	String dburl= "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	
	@Test
	public void databaseDemo()throws SQLException {
		System.out.println("next line");
		Connection connection=DriverManager.getConnection(dburl,dbUsername,dbPassword);
		System.out.println("Conn is created");
		System.out.println(connection);
		
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("Select * from hs_hr_employees where emp_number<3700 order by emp_number");
		//System.out.println(resultSet);
		
		resultSet.next();
		String columnData=resultSet.getString("emp_firstname");
		System.out.println(columnData);
		
		resultSet.next();
		columnData=resultSet.getString("emp_firstname");
		System.out.println(columnData);
		
		System.out.println("---Printing values using loop---");
		while(resultSet.next()) {
			columnData=resultSet.getString("emp_firstname");
			System.out.println(columnData);
		}
		resultSet.close();
		statement.close();
		connection.close();
	}

}

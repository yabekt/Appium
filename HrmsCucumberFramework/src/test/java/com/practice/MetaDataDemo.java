package com.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaDataDemo {
	String dburl= "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	
	@Test 
	public void metaData() throws SQLException{
		Connection con=DriverManager.getConnection(dburl, dbUsername, dbPassword);
		//info about Metadata
		DatabaseMetaData dbMetaData=con.getMetaData();
		String dbName=dbMetaData.getDatabaseProductName();
		String dbVersion=dbMetaData.getDatabaseProductVersion();
		System.out.println(dbName + " " + dbVersion);
		
		Statement st= con.createStatement();
		ResultSet rset=st.executeQuery("Select * from Ohrm_job_title");
		//info about Result Table
		ResultSetMetaData rsetData=rset.getMetaData();
		int cols=rsetData.getColumnCount();
		System.out.println(cols);
		
		for(int i=1;i<=cols;i++) {
			String colName=rsetData.getColumnName(i);
			System.out.println(colName);
		}
		rset.close();
		st.close();
		con.close();
	}

}

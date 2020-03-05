package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JobTitleDemo {
	String dburl="jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	
	@Test
	public void JTitleDemo()throws SQLException{
		List<String> jtitles=new ArrayList<>();
		Connection con=DriverManager.getConnection(dburl,dbUsername, dbPassword);
		Statement st=con.createStatement();
		ResultSet rset=st.executeQuery("Select * from ohrm_job_title");
		while(rset.next()) {
			jtitles.add(rset.getString("job_title"));	
		}
		System.out.println(jtitles);
		st.close();
		rset.close();
		con.close();
	}

}

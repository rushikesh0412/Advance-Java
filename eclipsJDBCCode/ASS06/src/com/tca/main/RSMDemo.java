package com.tca.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class RSMDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;
		ResultSetMetaData rsmd = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost/mydb", "root", "Rushi@0412");
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("Select * from student");
			
			rsmd = rs.getMetaData();
			
			int n = rsmd.getColumnCount();
			
			for(int i=1; i<=n; i++)
			{
				System.out.println("Column Name: "+ rsmd.getColumnName(i));
				System.out.println("Column Name: "+ rsmd.getColumnTypeName(i));
				
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

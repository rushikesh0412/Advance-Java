package com.tca.main;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DMDDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;
		ResultSetMetaData rsmd = null;
		DatabaseMetaData dbmd = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost/mydb", "root", "Rushi@0412");
			stmt = con.createStatement();
			dbmd = con.getMetaData();
			
			System.out.println("Database Name	: "+ dbmd.getDatabaseProductName());
			System.out.println("Databse Verion	: "+ dbmd.getDatabaseProductVersion());
			System.out.println("Database Driver	: "+ dbmd.getDriverName());
			System.out.println("User Name		: "+ dbmd.getUserName());
			
			System.out.println("\n\n\n");
			rs = dbmd.getTables(null, null, null, new String[] {"TABLE"});
			
			System.out.println("List of Table: ");
			
			while(rs.next())
			{
				System.out.println(rs.getString("TABLE_NAME"));
				
				String tbname = rs.getString("TABLE_NAME");
				
				String sql = "Select * from "+ tbname;
				
				rs = stmt.executeQuery(sql);
				
				rsmd = rs.getMetaData();
				
				int n = rsmd.getColumnCount();
				
				for(int i=1; i<=n; i++)
				{
					System.out.println("Column Name: "+ rsmd.getColumnName(i));
					System.out.println("Column Name: "+ rsmd.getColumnTypeName(i));
					
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

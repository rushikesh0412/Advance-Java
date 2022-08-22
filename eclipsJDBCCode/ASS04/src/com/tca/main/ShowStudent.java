package com.tca.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//Display Student Data
public class ShowStudent {
	public static void main(String args[])
	{
		
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//Step 1 : Load Driver
            Class.forName("org.postgresql.Driver");

            //Step 2: Forming a Connection
            con = DriverManager.getConnection("jdbc:postgresql://localhost/mydb", "root", "Rushi@0412");
            
            //Step 3: 
            stmt = con.createStatement();
            
            //Step 4: Prepared Statement
            rs = stmt.executeQuery("select * from student");
            
            
            while(rs.next())
            {
            	System.out.println(rs.getInt(1) + "\t" + rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getFloat(4));
            }
            
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

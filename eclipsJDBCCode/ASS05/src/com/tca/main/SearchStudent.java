package com.tca.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Connection con = null;
		        PreparedStatement ps = null;
		        ResultSet rs = null;

		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		        String name;
		       

		        try{
		            //Step 1 : Load Driver
		            Class.forName("org.postgresql.Driver");

		            //Step 2: Forming a Connection
		            con = DriverManager.getConnection("jdbc:postgresql://localhost/mydb", "root", "Rushi@0412");

		            //Step 3: Prepare SQL Statement
		            System.out.print("Enter Name: ");
		            name = br.readLine();

		            
		            //Search by name
		            ps = con.prepareStatement("Select * from Student where name = ?");  
		            ps.setString(1,name);
		            
		            rs = ps.executeQuery();
		            
		            boolean flag = rs.next();
		            
		          //Step 4: Execute SQL Statement
		            if(flag==false)
		            {
		            	System.out.println("No record found for: "+ name);
		            }
		            else
		            {
		            	System.out.println("Record is Found for: "+ name);
		            	System.out.println("Roll No.  : "+ rs.getInt(1));
		            	System.out.println("Name 	  : "+ rs.getString(2));
		            	System.out.println("Phone No. : "+ rs.getString(3));
		            	System.out.println("Persentage: "+ rs.getFloat(4));
		            }
		        }
		        catch(Exception e)
		        {
		            e.printStackTrace();
		        }

	}

}

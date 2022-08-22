package com.tca.main;

//Lecture No. 17


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost/mydb", "root", "Rushi@0412");
			
			
			cst = con.prepareCall("Select msg()");
			//cst = con.prepareCall("Select add(3,7)");
			//cst = con.prepareCall("Select addinfo(107,'Sonal','45896524', 89)");
			rs = cst.executeQuery();
			System.out.println("Record is added succesfully!");
			
			rs.next();
			System.out.println(rs.getString(1));
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

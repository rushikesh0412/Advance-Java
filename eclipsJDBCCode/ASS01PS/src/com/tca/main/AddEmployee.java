/**
 * 
 */
package com.tca.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author Rushi
 *
 */
public class AddEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int emp_ID;
		String emp_name;
		String emp_phno;
		float emp_salary;
		String emp_address;
		String emp_department;
		String emp_email;
		
		try {
			//Step 1: Load Driver
			Class.forName("org.postgresql.Driver");
			
			//Step 2: Forming Connection
			con = DriverManager.getConnection("jdbc:postgresql://localhost/mydb", "root", "Rushi@0412");
			
			//Step 3:   Prepared SQL Statement
			System.out.print("Enter your emp ID: ");
			emp_ID = Integer.parseInt(br.readLine());
			
			System.out.print("Enter Your Name: ");
			emp_name = br.readLine();
			
			System.out.print("Enter your phone number: ");
			emp_phno = br.readLine();
			
			System.out.print("Enter your salary: ");
			emp_salary = Float.parseFloat(br.readLine());
			
			System.out.print("Enter your address: ");
			emp_address = br.readLine();
			
			System.out.println("Enter your Deapartment: ");
			emp_department = br.readLine();
			
			System.out.print("Enter your e-mail: ");
			emp_email = br.readLine();
			
			ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
			ps.setInt(1, emp_ID);
			ps.setString(2, emp_name);
			ps.setString(3, emp_phno);
			ps.setFloat(4, emp_salary);
			ps.setString(5, emp_address);
			ps.setString(6, emp_department);
			ps.setString(7, emp_email);
			
			//Step 4 : Execute SQL Statement
			int i = ps.executeUpdate();
			if(i==0)
			{
				System.out.println("unable to insert!!!");
			}
			else
			{
				System.out.println("Record is saved Succesfully!!!");
			}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

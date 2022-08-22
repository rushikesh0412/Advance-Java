package com.tca.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
        PreparedStatement ps = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int rno;
        String name = null;
        String phno = null;
        float per = 0.0f;

        try{
            //Step 1 : Load Driver
            Class.forName("org.postgresql.Driver");

            //Step 2: Forming a Connection
            con = DriverManager.getConnection("jdbc:postgresql://localhost/mydb", "root", "Rushi@0412");

            //Step 3: Prepare SQL Statement
            System.out.print("Enter Roll number: ");
            rno = Integer.parseInt(br.readLine());
            
            System.out.print("Enter Name: ");
            name = br.readLine();

            System.out.print("Enter Phone Number: ");
            phno = br.readLine();

            System.out.print("Enter Persentage: ");
            per = Float.parseFloat(br.readLine());

            ps = con.prepareStatement("insert into student values(?,?,?,?)");
            ps.setInt(1,rno);
            ps.setString(2, name);
            ps.setString(3, phno);
            ps.setFloat(4, per);


            //Step 4: Execute SQL Statement

            int i = ps.executeUpdate();
            if(i==0)
            {
                System.out.println("Unable to insert!!!");
            }
            else{
                System.out.println("Record is saves Succesfully!!!");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
	}

}

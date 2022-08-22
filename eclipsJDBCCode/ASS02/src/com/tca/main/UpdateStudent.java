package com.tca.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
        PreparedStatement ps = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int rno;
        String phno = null;
       

        try{
            //Step 1 : Load Driver
            Class.forName("org.postgresql.Driver");

            //Step 2: Forming a Connection
            con = DriverManager.getConnection("jdbc:postgresql://localhost/mydb", "root", "Rushi@0412");

            //Step 3: Prepare SQL Statement
            System.out.print("Enter Roll number: ");
            rno = Integer.parseInt(br.readLine());

            System.out.print("Enter New Phone Number: ");
            phno = br.readLine();

            

            ps = con.prepareStatement("update student set phno=? where rno = ?");
            
            ps.setString(1, phno);
            ps.setInt(2,rno);
            


            //Step 4: Execute SQL Statement

            int i = ps.executeUpdate();
            if(i==0)
            {
                System.out.println("Unable to update!!!");
            }
            else{
                System.out.println("Record is updated Succesfully!!!");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
	}

}

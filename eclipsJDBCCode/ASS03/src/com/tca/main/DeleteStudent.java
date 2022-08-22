package com.tca.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
        PreparedStatement ps = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int rno;
       

        try{
            //Step 1 : Load Driver
            Class.forName("org.postgresql.Driver");

            //Step 2: Forming a Connection
            con = DriverManager.getConnection("jdbc:postgresql://localhost/mydb", "root", "Rushi@0412");

            //Step 3: Prepare SQL Statement
            System.out.print("Enter Roll number: ");
            rno = Integer.parseInt(br.readLine());

            

            ps = con.prepareStatement("delete from student where rno=?");  
            ps.setInt(1,rno);
            


            //Step 4: Execute SQL Statement

            int i = ps.executeUpdate();
            if(i==0)
            {
                System.out.println("Unable to delete!!!");
            }
            else{
                System.out.println("Record is deleted Succesfully!!!");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
	}

}

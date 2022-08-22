package com.tca.ass01;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket sob = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		
		try
		{
			sob = new Socket("localhost", 2400);
			
			is = sob.getInputStream();
			os = sob.getOutputStream();
			
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true)
			{
				System.out.print("Type a Message: ");
				String msg = br.readLine();
				dos.writeUTF(msg);
				
				if(msg.equals("END"))
				{
					break;
				}
			}
			sob.close();
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

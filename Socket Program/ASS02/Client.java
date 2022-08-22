
import java.net.Socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Client{
	public static void main(String args[])
	{
		Socket sob = null;
		InputStream is= null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try 
		{
				sob = new Socket("localhost" , 2401);

				is = sob.getInputStream();
				os = sob.getOutputStream();

				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("Find Factorial(Enter 0 for exit): ");
				while(true)
				{

					System.out.print("Enter number: ");
					int num = Integer.parseInt(br.readLine());

					if(num == 0)
						break;
					
					dos.writeUTF(Integer.toString(num));

					System.out.println("Factorial : "+ dis.readUTF());
					
					
				}
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
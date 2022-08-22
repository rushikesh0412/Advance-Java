
import java.net.Socket;
import java.net.ServerSocket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;


public class Server{
	public static void main(String srgd[])
	{
		ServerSocket ssob = null;
		Socket sob = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;


		try
		{
			ssob = new ServerSocket(2401);
			System.out.println("Server Started!!!");

			sob = ssob.accept();
			System.out.println("Client is Connected!!!");

			is = sob.getInputStream();
			os = sob.getOutputStream();

			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

			while(true)
			{
				int num = Integer.parseInt(dis.readUTF());

				if(num == 0)
					break;

				int fact  = 1;
				for(int i = 1; i<=num; i++)
				{
					fact = fact * i;
				}
				dos.writeUTF(Integer.toString(fact));
			}
			





			ssob.close();
			sob.close();

		}
		catch(Exception e)
		{
				e.printStackTrace();
		}
		
	}
}
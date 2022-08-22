import java.net.Socket;
import java.net.ServerSocket;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class Server 
{
	public static void main(String args[])
	{
		SreverSocket ssob = null;
		Socket sob = null;
		InputStream is = null;
		OutputStream os =  null;
		DataInputStream dis = null;
		DataOutputStream dos = null;


		try 
		{
			ssob = new ServerSocket(2402);
			System.out.println("Server is Started!!!");
			sob = ssob.accept();
			System.out.println("Client is Connected!!!");

			is = sob.getInputStream();
			os = sob.getOutputStream();

			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

			String fname = dis.readUTF();

			FileOutputStream fos = new FileOutputStream(fname);

			byte b[] = new byte[1024];

			while(true)
			{
				int no_of_byte = dis.read(b);

				if(no_of_byte == -1)
					break;

				fos.write(b,0, no_of_byte);
			}

			ssob.close();
			sob.close();


		}
		catch(Exception e)
		{
			e.printStackTace();
		}
	}
}
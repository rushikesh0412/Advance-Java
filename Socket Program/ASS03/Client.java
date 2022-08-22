import java.net.Socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Client 
{
	public static void main(String args[])
	{
		Socket sob = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try 
		{
			sob = new Socket("localhost", 2402);

			is = sob.getInputStream();
			os = sob.getOutputStream();

			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the file name:  ");
			String fn = br.readLine();

			dos.writeUTF(fn);

			FileInputStream fis = new FileInputStream(fn);
			byte b[] = new byte[1024];

			while(true)
			{
				int no_of_byte = fis.read();

				if(no_of_byte == -1)
					break;

				dos.write(b, 0, no_of_byte);
			}
			sob.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
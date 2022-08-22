

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ssob = null;
		Socket sob = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try
		{
			ssob = new ServerSocket(2400);
			System.out.println("Serevr Stared!!!");
			sob = ssob.accept();
			System.out.println("Client is Connected!!!");
			
			is = sob.getInputStream();
			os = sob.getOutputStream();
			
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			while(true)
			{
				String msg = dis.readUTF();
				if(msg.equals("END"))
				{
					break;
				}
				System.out.println(msg);
			}
			sob.close();
			ssob.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

import java.io.*;
import java.net.*;

public class Demo1
{
	public static void main(String args[]) throws Exception
	{
		InetAddress ob = InetAddress.getLocalHost();
		//InetAddress ob = InetAddress.getByName("Google.com");
		System.out.println(ob.getHostName());
		System.out.println(ob.getHostAddress());
	}
}
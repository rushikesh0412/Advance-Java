import java.io.*;
import java.net.*;


public class Demo
{
	public static void main(String args[]) throws Exception
	{
		URL url = new URL("http://localhost/a.php");
		URLConnection uc = url.openConnection();

		InputStream is = uc.getInputStream();

		int length = uc.getConnectionLength();

		System.out.println("Size od data : "+ length + " Byte");

		for(int i=1; i<=length; i++)
		{
			System.out.println((char) is.read());
		}
	}
}
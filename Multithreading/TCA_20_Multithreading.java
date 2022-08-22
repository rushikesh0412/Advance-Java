import java.lang.Thread;


class City extends Thread
{
	
	String msg;
	int n;

	City(String msg, int limit)
	{
		this.msg = msg;
		this.n = limit;

	}
	public void run() 
	{
		try{
			for(int i=0; i<n; i++)
			{
				System.out.println(msg);
				sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
public class TCA_20_Multithreading
{
	public static void main(String args[]) throws InterruptedException
	{
		City c1 = new City("Pune", 5);
		City c2 = new City("Mumbai", 5);

		c1.start();
		c2.start();

		for(int i=0; i<5; i++)
		{
			System.out.println("Nashik");
			Thread.sleep(1000);
		}

	}
}

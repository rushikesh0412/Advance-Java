import java.lang.Thread;


class City extends Thread
{
	
	public void run() 
	{
		try{
			for(int i=0; i<5; i++)
			{
				System.out.println("Pune");
				sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
class City1 extends Thread
{
	
	public void run() 
	{
		try{
			for(int i=0; i<5; i++)
			{
				System.out.println("Mumbai");
				sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
public class TCA_20_Multithreading1
{
	public static void main(String args[]) throws InterruptedException
	{
		City c1 = new City();
		c1.start();

		City1 c2 = new City1();
		c2.start();

		for(int i=0; i<5; i++)
		{
			System.out.println("Nashik");
			Thread.sleep(1000);
		}

	}
}

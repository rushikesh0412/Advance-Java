import java.lang.Thread;
import java.lang.Runnable;


class City implements Runnable
{
	
	public void run() 
	{
		try{
			for(int i=0; i<5; i++)
			{
				System.out.println("Pune");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
class City1 implements Runnable
{
	
	public void run() 
	{
		try{
			for(int i=0; i<5; i++)
			{
				System.out.println("Mumbai");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
public class TCA_20_Multithreading2
{
	public static void main(String args[]) throws InterruptedException
	{
		City c1 = new City();
		Thread t1 = new Thread(c1);
		t1.start();

		City1 c2 = new City1();
		Thread t2 = new Thread(c2);
		t2.start();

		for(int i=0; i<5; i++)
		{
			System.out.println("Nashik");
			Thread.sleep(1000);
		}

	}
}

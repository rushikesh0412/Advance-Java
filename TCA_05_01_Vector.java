import java.io.*;
import java.util.*;

      
class MyList<T> extends ArrayList
{
	int c;

	MyList()
	{
		super();
		c=0;
	}
	MyList(int sz)
	{
		super(sz);
		c=sz;
	}

	int capacity()
	{
		return c;
	}
	
	public boolean add(Object o)
	{
		super.add(o);
		c++;
		return true;
	}
}
public class TCA_05_01_Vector
{
	public static void main(String args[]) throws Exception
	{
		
		MyList a = new MyList(2);


		System.out.println(a.size());
		System.out.println(a.capacity());

		a.add("Rushi");
		a.add("Bhivsen");
		a.add("Shinde");

		System.out.println(a);

		System.out.println(a.size());
		System.out.println(a.capacity());





	}
}
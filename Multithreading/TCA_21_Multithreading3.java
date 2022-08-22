import java.io.*;
import java.util.*;

class SumThread extends Thread
{
    int a[];
    int start;
    int end;
    int sum;

    SumThread(int arr[], int s, int e)
    {
        a     = arr;
        start = s;
        end   = e;
        sum   = 0;
    }
    public void run()
    {
        for(int i = start; i<=end; i++)
        {
            sum = sum + a[i];
        }
    }
}
public class TCA_21_Multithreading3
{
    public static void main(String args[]) throws InterruptedException
    {
        Random r  = new Random();
        int arr[] = new int[10];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = r.nextInt()%10;
        }

        System.out.println("Array is: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        SumThread t1 = new SumThread(arr, 0, 4);
        SumThread t2 = new SumThread(arr, 6, 9);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int total = t1.sum + t2.sum;

        System.out.println("THREAD 1 TOTAL: "+ t1.sum);
        System.out.println("THREAD 2 TOTAL: "+ t2.sum);
        System.out.println("TOTAL         : "+ total);
    }
}

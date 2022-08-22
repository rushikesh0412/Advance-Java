import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class TCA_03_ArrayList {
    public static void main(String args[]) throws IOException, NumberFormatException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ar = new ArrayList<Integer>();

        System.out.print("How many number you want to enter: ");
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; )
        {
            System.out.print("Give me the number: ");
            int num = Integer.parseInt(br.readLine());

            Integer iob = new Integer(num);
            boolean status = ar.contains(iob);

            if(status == true)
            {
                System.out.println(num + " is already present");
                
            }
            else{
                ar.add(iob);
                i++;
            }

        }

        System.out.println("Unique Numbers: "+ ar);

        /*
        str.add("Rushi");
        str.add("Bhivsen");
        str.add("Shinde");

        for (String value : str) {
            System.out.println(value + " ");
        }
        System.out.println("After removing values");

        str.remove("Rushi");

        for (String value : str) {
            System.out.println(value + " ");
        }

        str.add(0, "Rushi");
        System.out.println(str);

        Iterator i = str.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        */



    }
}

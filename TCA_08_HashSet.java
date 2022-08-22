import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class TCA_08_HashSet {
    public static void main(String[] args) throws IOException, NumberFormatException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many number you want to Store: ");
        int n = Integer.parseInt(br.readLine());

        TreeSet<Integer> ts = new TreeSet<Integer>();
        for(int i=1; i<=n; )
        {
            System.out.print("Give me the number: ");
            int num = Integer.parseInt(br.readLine());
            Integer iob = new Integer(num);
            boolean status = ts.add(iob);

            if(status == true)
            {
                i++;
            }
            else{
                System.out.println(num + " is already present");
            }

        }
        System.out.println("Unique Numbers: "+ ts);

    }
}

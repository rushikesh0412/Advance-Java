import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.TreeMap;

public class TCA_09_Phone {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("phone.text");
        BufferedReader br = new BufferedReader(fr);

        Hashtable<String, String> ht = new Hashtable<String, String>();
    
        while(true)
        {
            String line = br.readLine();

            if(line == null)
            {
                break;
            }
            String tok[] = line.split(" ");
            if(ht.containsKey(tok[1]))
            {
                System.out.println("Already Exist!!");
            }
            else{
                ht.put(tok[1], tok[0]);
            }
            
        }

        System.out.println("Loaded Hash Table: " + ht);
        
        TreeMap<String, String> tm = new TreeMap<String, String>();
        tm.putAll(ht);
        System.out.println("Sorted Hash Table: "+ tm);
        System.out.println("Descending Sorted Hmap: "+ tm.descendingMap());




        /*
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your Phone number: ");
        String phno = br2.readLine();
        String name = ht.get(phno);

        if(name == null)
        {
            System.out.println("User is not found!");
        }
        else{
            System.out.println("User Found: "+ name);
        }

        */
    }
}

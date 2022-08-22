import java.util.Iterator;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class TCA_07_TreeSet {
    public static void main(String[] args) {


        /*
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(45);
        ts.add(10);
        ts.add(7);
        ts.add(15);
        ts.add(4);

        System.out.println(ts);

        Iterator ir = ts.iterator();

        while(ir.hasNext())
        {
            System.out.println(ir.next());
        }

        */


        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Banglore");
        ts.add("Mumbai");
        ts.add("Baner");
        ts.add("Pune");
        ts.add("Nagar");

        System.out.println("ASC: " + ts);


        /*
        Iterator ir = ts.iterator();
        ts = (TreeSet) ts.descendingSet();
        System.out.println("DES: " + ts);
        */



        /*
        SortedSet ss =(TreeSet) ts.headSet();
        System.out.println(ss);
        */

        /*
        //Using Stack in Decending order
        Stack<String> s = new Stack<String>();
        while(ir.hasNext())
        {
            s.push((String) ir.next());

        }

        
        System.out.println("Decending: ");
        while(! s.isEmpty())
        {
            System.out.println(s.pop());
        }

        */

    }
}

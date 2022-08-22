import java.util.Iterator;
import java.util.Vector;

public class TCA_05_Vector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>(3,2);

        System.out.println("Size: "+ v.size());
        System.out.println("Capacity: "+ v.capacity());

        v.add("Rushi");
        v.add("Bhivsen");
        v.add("Shinde");

        System.out.println("Size: "+ v.size());
        System.out.println("Capacity: "+ v.capacity());

        System.out.println(v);

        Iterator i = v.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }


        v.add("Abhishek");

        System.out.println("Size: "+ v.size());
        System.out.println("Capacity: "+ v.capacity());

        Iterator j = v.iterator();
        while(j.hasNext())
        {
            System.out.println(j.next());
        }
    }
}

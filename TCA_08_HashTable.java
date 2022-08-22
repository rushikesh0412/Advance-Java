import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class TCA_08_HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        ht.put(101, "AAA");
        ht.put(102, "BBB");
        ht.put(103, "CCC");
        ht.put(245, "DDD");

        System.out.println("Hash Table: "+ ht);

        Enumeration ir = ht.keys();

        while(ir.hasMoreElements())
        {
            Integer id = (Integer)ir.nextElement();
            String value = ht.get(id);

            System.out.println(id + "-->"+ value);

        }


    }
}

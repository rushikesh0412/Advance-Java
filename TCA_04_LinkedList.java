import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class TCA_04_LinkedList
{
    public static void main(String args[])
    {
        LinkedList<String> l = new LinkedList<String>();
        l.add("red");
        l.add("blue");
        l.add("yellow");
        l.add("green");

        ListIterator i = l.listIterator();
        System.out.println("\n\nForward Direction: ");

        while(i.hasNext())
        {
            System.out.println(i.next());
        }


        System.out.println("\n\nBackward Direction: ");
        while(i.hasPrevious())
        {
            System.out.println(i.previous());
        }

        LinkedList<String> l2 = new LinkedList<String>();
        l2.add("Black");
        l2.add("White");
        l2.add("Pink");

        int j = l.indexOf("blue");
        System.out.println("\n\nBefore inserting: "+ l);
        l.addAll(j, l2);

        System.out.println("\n\nAfter Inserting: "+ l);

    }
}
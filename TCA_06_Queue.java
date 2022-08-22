import java.util.LinkedList;
import java.util.Queue;

public class TCA_06_Queue {

    public static void main(String[] args) {
        //How to create Queue in java???
        Queue<String> q = new LinkedList<String>();     //Because LinkedList implements Queue

        //Push Method
        q.add("Rushi");
        q.add("Bhivsen");
        q.add("Shinde");

        System.out.println(q);

        //Peek Method
        System.out.println(q.peek());


        //Remove Method
        while(!q.isEmpty())
        {
            System.out.println(q.remove());
        }


        //Use to print Queue
        System.out.println(q);
    }
    
}

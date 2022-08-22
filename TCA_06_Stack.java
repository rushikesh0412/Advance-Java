import java.util.Stack;

public class TCA_06_Stack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();

        s.push("Rushi");
        s.push("Bhivsen");
        s.push("Shinde");

        System.out.println(s.peek());

        System.out.println(s);

        s.pop();
        System.out.println(s);

        System.out.println(s.empty());

        System.out.println(s.search("Rushi"));
    }
    
}

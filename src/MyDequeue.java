import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MyDequeue {
    public static void main(String[] args) {

        ArrayDeque<String> stack = new ArrayDeque<>();


        // Add elements to stack
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("3");

        System.out.println("Removed element: " + stack.removeFirstOccurrence("3"));

        System.out.println("Stack: " + stack);
    }
}

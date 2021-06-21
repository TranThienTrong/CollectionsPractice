import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        animals.pop();

        System.out.println("Stack: " + animals);

        System.out.println("Peak: " + animals.peek());

        System.out.println("Search: " + animals.search("Dog"));

        System.out.println("Empty: " + animals.empty());

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(new ArrayList<>(stack)); // prints 1, 2, 3


        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(new ArrayList<>(deque)); // prints 3, 2, 1

    }
}

import java.util.*;

public class MyQueue {

    class MyLinkedListQueue{
        void method(){
            Queue<Integer> numbers = new LinkedList<>();

            // offer elements to the Queue
            numbers.offer(1);
            numbers.offer(2);
            numbers.offer(3);

            System.out.println("Queue: " + numbers);

            // Access elements of the Queue
            int accessedNumber = numbers.peek();

            System.out.println("peek: " + accessedNumber);
            System.out.println("element: " + numbers.element());

            // Remove elements from the Queue
            int removedNumber = numbers.poll();
            System.out.println("poll: " + removedNumber);

            System.out.println("Queue: " + numbers);

        }
    }

    private static class MyPriorityQueue{
        void method(){
            PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());

            // Using the add() method
            numbers.add(3);
            numbers.add(4);
            numbers.add(2);
            numbers.offer(1);
            System.out.println("PriorityQueue: " + numbers);
        }
    }
    static class CustomComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer number1, Integer number2) {
            return  number1.compareTo(number2);
        }
    }

    public static void main(String[] args) {

        new MyPriorityQueue().method();
    }
}

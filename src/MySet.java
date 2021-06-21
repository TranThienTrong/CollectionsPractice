import java.util.*;

public class MySet {

    static class MyNavigationSet {
        // SortedSet implementation by TreeSet class
        NavigableSet<String> numbers = new TreeSet<>();

        {
            // Creating NavigableSet using the TreeSet
            NavigableSet<Integer> numbers = new TreeSet<>();

            // Insert elements to the set
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            System.out.println("NavigableSet: " + numbers);

            // Access the first element
            int firstElement = numbers.first();
            System.out.println("First Number: " + firstElement);

            // Access the last element
            int lastElement = numbers.last();
            System.out.println("Last Element: " + lastElement);

            // Remove the first element
            int number1 = numbers.pollFirst();
            System.out.println("Removed First Element: " + number1);

            // Remove the last element
            int number2 = numbers.pollLast();
            System.out.println("Removed Last Element: " + number2);

        }
    }

    static class MyTreeSet {
        {

//            String[] arr = new String[]{
//                    "adam","bede","car","dojo","enim","fancy",
//                    "gondo","hentai","itachi","ko","mom","nano",
//                    "lucky","oto"};
//
//           SortedSet<String> set = new TreeSet<>(Arrays.asList(arr));
//
//            for (char ch = 'a'; ch <= 'z'; ) {
//                String from = String.valueOf(ch++);
//                String to = String.valueOf(ch);
//                System.out.println(from + ": " + set.subSet(from, to).size());
//            }


        }

        void method() {
            SortedSet<Integer> set = new TreeSet<>();
            set.add(3);
            set.add(2);
            set.add(1);

            System.out.println(set);

        }
    }

    static class MyLinkedHashSet {
        {
            // Creating an arrayList of even numbers
            LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
            linkedHashSet.add(2);
            linkedHashSet.add(1);
            linkedHashSet.add(3);

            System.out.println("LinkedHashSet: " + linkedHashSet);
        }
    }

    static class MyHashSet {

        {
            HashSet<Integer> evenNumber = new HashSet<>();

            // Using add() method
            evenNumber.add(2);
            evenNumber.add(4);
            evenNumber.add(4);
            evenNumber.add(6);
            System.out.println("HashSet: " + evenNumber);

            HashSet<Integer> newNumber = new HashSet<>();
            newNumber.addAll(evenNumber);
            newNumber.add(1);
            newNumber.add(3);

            System.out.println("HashSet: " + newNumber);

        }

    }

    public static void main(String[] args) {
        new MyNavigationSet();
    }
}

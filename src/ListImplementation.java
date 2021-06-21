import java.util.*;

public class ListImplementation {


    public static void main(String[] args) {

        // create linkedlist
        Queue<String> animals = new LinkedList<>();

        // Add elements to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");


        LinkedList<String> languages = new LinkedList<>();

        // add elements
        languages.add("Python");
        languages.add("Java");
        languages.add("C");

        System.out.println("LinkedList: " + languages);

        // access the first element
        String str1 = languages.getFirst();
        System.out.println("Accessed Element: " + str1);

        // access and remove the first element
        String str2 = languages.removeFirst();
        System.out.println("LinkedList after poll(): " + languages);

        // add element at the end
        languages.addLast("Swift");
        languages.addFirst("Dart");
        System.out.println("LinkedList after offer(): " + languages);

    }


}





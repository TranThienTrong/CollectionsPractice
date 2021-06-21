import java.util.*;

public class Main {

    static void filter(Collection<?> c) {
        for (Iterator<?> it = c.iterator(); it.hasNext(); )
            if (it.hasNext()) {
                if (it.next().equals("Trong")) {
                    it.remove();
                }
            }
    }

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Tran");
        collection.add("Tran");
        collection.add("Thien");
        collection.add("Trong");


        Collection<String> newCollection = new HashSet<>(collection);
        for (String curr : newCollection) {
            System.out.println(curr);
        }

        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();

        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2);

        Set<String> intersection = new HashSet<String>(s1);
        intersection.retainAll(s2);

        Set<String> difference = new HashSet<String>(s1);
        difference.removeAll(s2);



    }
}

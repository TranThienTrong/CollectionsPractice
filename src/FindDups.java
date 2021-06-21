import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDups {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        String[] s = new String[]{"Khong", "tham", "lam", "Khong", "san", "si", "Khong", "ta", "dzam"};
        for (String a : s)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
//        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}

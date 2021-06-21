import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

    public static <E> void swap(List<E> a, int i, int j) {
        E tmp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, tmp);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tran");
        list.add("Thien");
        list.add("Trong");

        for (ListIterator<String> iterator = list.listIterator(list.size()); iterator.hasPrevious(); ) {
            String prevIterator = iterator.previous();
            System.out.println(list.indexOf("Thien"));
        }

    }
}

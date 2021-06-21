import java.util.*;

public class MapTest {
    static <K, V> Map<K, V> newAttributeMap(Map<K, V> defaults, Map<K, V> overrides) {
        Map<K, V> result = new HashMap<K, V>(defaults);
        result.putAll(overrides);
        return result;
    }

    public static void freq() {
        Map<String, Integer> map = new TreeMap<>();

        Map<String, Integer> anotherMap = new HashMap<>(map);

        String[] str = new String[]{"C", "D", "B", "A", "T", "E", "F", "H", "G", "J", "K"};

        for (String s : str) {
            Integer freq = map.get(s);
            int value = (freq == null) ? 1 : freq + 1;
            map.put(s, value);
        }

        for (String key : map.keySet())
            System.out.println(key);


    }

    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//
//        String[] str = new String[]{"A", "B", "C", "D"};
//        int i = 0;
//        for (String s : str) {
//            i++;
//            map.put(s, i);
//        }
//
//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey() + ": " + e.getValue());
//        }

        List<String> list = new LinkedList<>();
        ListIterator<String> iterator = list.listIterator();

        Map<Object, String> map = new HashMap<>();

    }
}

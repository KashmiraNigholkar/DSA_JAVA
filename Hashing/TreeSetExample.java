import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // HashSet - no ordering
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println("HashSet: " + cities);

        // LinkedHashSet - maintains insertion order
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println("LinkedHashSet: " + lhs);

        // TreeSet - stores in sorted order
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println("TreeSet: " + ts);
    }
}

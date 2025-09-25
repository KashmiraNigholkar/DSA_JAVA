 import java.util.*;
import java.util.HashMap;
public class TreeHashMap {
   


    public static void main(String[] args) {
        // LinkedHashMap maintains insertion order
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        // tm.put(key:"Indonesia",value:35);

        // HashMap does not guarantee insertion order
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println("HashMap: " + hm);
        System.out.println("treeMap: " + tm);
    }
}


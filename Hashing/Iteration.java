package Hashing;
import java.util.*;

public class Iteration {
    public static void main(String arg[]){
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // Print all keys
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // Iterate through keys and values
        for(String k : keys){
            System.out.println("key = " + k + ", value = " + hm.get(k));
        }
    }
}

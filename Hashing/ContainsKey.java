package Hashing;
import java.util.HashMap;

public class ContainsKey {
   


    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("indonesia"));
    }
}



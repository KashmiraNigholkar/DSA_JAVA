import java.util.*;
import java.util.HashMap;

public class SortByFrequency {
    
    public static String sortByFrequency(String s) {
        // Step 1: Count frequencies
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put((Character) s.charAt(i), Integer.valueOf(map.getOrDefault(s.charAt(i), 0) + 1));
        }

        // Step 2: Use max-heap based on frequency, then lexicographically
        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>((a, b) -> 
                    a.getValue().equals(b.getValue()) ? ((int)a.getKey() - (int)b.getKey()) : b.getValue() - a.getValue()
                );

        pq.addAll(map.entrySet());

        // Step 3: Build result string
        StringBuilder res = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            Character ch = entry.getKey();
            int count = entry.getValue();
            while (count-- > 0) {
                res.append(ch);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println("Sorted by frequency: " + sortByFrequency(s));
    }
}

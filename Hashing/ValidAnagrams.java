import java.util.*;
import java.util.HashMap;

public class ValidAnagrams {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; // quick check

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters from s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(Character.valueOf(ch), Integer.valueOf(map.getOrDefault(ch, 0) + 1));
        }

        // Decrease counts using t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        System.out.println(isAnagram(s, t)); // true
    }
}

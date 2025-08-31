package Tries;

public class PrefixProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;  // frequency of visits

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 0; // initially 0
        }
    }

    public static Node root = new Node();

    // Insert word into trie
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.freq++;  // increase frequency for each visit
        }
        curr.eow = true;
    }

    // Find prefix of a word
    public static String getPrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            curr = curr.children[idx];
            prefix.append(word.charAt(i));
            if (curr.freq == 1) { // unique point
                break;
            }
        }
        return prefix.toString();
    }

    public static void main(String args[]) {
        String arr[] = { "zebra", "dog", "duck", "dove" };

        // Insert words into trie
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        // Print unique prefixes
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + getPrefix(arr[i]));
        }
    }
}

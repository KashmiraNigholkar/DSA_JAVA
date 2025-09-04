import java.util.*;

public class TieBreakerProblem {
    
    public static String findWinner(String[] arr) {
        // Count votes
        Map<String,Integer> voteCount = new HashMap<>();
        for(String name : arr) {
            voteCount.put(name, voteCount.getOrDefault(name, 0) + 1);
        }

        String winner = "";
        int maxVotes = 0;

        // Find max votes with lexicographic tie-breaking
        for(Map.Entry<String,Integer> entry : voteCount.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();

            if(votes > maxVotes || (votes == maxVotes && candidate.compareTo(winner) < 0)) {
                maxVotes = votes;
                winner = candidate;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        String[] arr1 = {"Turin", "Nick", "Turin", "Nick"};
        System.out.println(findWinner(arr1)); // Nick

        String[] arr2 = {"John", "Shushma", "Rajnath"};
        System.out.println(findWinner(arr2)); // John
    }
}

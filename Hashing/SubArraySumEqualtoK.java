import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualtoK {
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // prefix sum 0 occurs once

        int sum = 0;
        int ans = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            // If (sum - k) exists, it means subarray with sum k found
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            // Store/update current prefix sum count
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Number of subarrays with sum " + k + " = " + ans);
    }
}

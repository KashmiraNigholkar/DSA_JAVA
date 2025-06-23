package Practise;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
    public ArrayList<Integer> findLoneElements(ArrayList<Integer> nums) {
        ArrayList<Integer> list = new ArrayList<>();

        if (nums == null || nums.size() == 0)
            return list;

        Collections.sort(nums);

        int n = nums.size();

        if (n == 1) {
            list.add(nums.get(0));
            return list;
        }

        // Check first element
        if (nums.get(0) + 1 < nums.get(1)) {
            list.add(nums.get(0));
        }

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }

        // Check last element
        if (nums.get(n - 2) + 1 < nums.get(n - 1)) {
            list.add(nums.get(n - 1));
        }

        return list;
    }
}

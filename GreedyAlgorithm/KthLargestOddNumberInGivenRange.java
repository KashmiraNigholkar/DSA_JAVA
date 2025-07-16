import java.util.*;

public class KthLargestOddNumberInGivenRange {
    public static int kthOdd(int[] range, int k) {
        if (k <= 0) {
            return 0;
        }

        int L = range[0];
        int R = range[1];

        // Count of odd numbers in the range
        int count = (R - L) / 2;
        if (L % 2 != 0 || R % 2 != 0) {
            count += 1;
        }

        if (k > count) {
            return 0; // Not enough odd numbers
        }

        // Start from R and go backwards to find kth odd
        int odd = (R % 2 != 0) ? R : R - 1;

        return odd - 2 * (k - 1);
    }

    public static void main(String[] args) {
        int[] p = { -10, 10 };
        int k = 8;
        System.out.println(kthOdd(p, k));
    }
}

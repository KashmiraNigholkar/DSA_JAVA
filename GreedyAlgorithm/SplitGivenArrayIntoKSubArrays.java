public class SplitGivenArrayIntoKSubArrays {
    public static int ans = Integer.MAX_VALUE;

    public static void solve(int a[], int n, int k, int index, int sum, int maxSum) {
        if (k == 1) {
            for (int i = index; i < n; i++) {
                sum += a[i];
            }
            maxSum = Math.max(maxSum, sum);
            ans = Math.min(ans, maxSum);
            return;
        }

        int currentSum = 0;
        for (int i = index; i < n - k + 1; i++) {
            currentSum += a[i];
            solve(a, n, k - 1, i + 1, 0, Math.max(maxSum, currentSum));
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int k = 3;
        int n = arr.length;
        solve(arr, n, k, 0, 0, 0);
        System.out.println("Minimum possible maximum sum after splitting: " + ans);
    }
}

package DivideAndConquer;

public class SortedAndRotatedArray {
    public static int Search(int[] arr, int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        // Check if left half is sorted
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return Search(arr, tar, si, mid - 1);
            } else {
                return Search(arr, tar, mid + 1, ei);
            }
        }

        // Otherwise, right half is sorted
        else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return Search(arr, tar, mid + 1, ei);
            } else {
                return Search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int tarIdx = Search(arr, target, 0, arr.length - 1);
        System.out.println("Target index: " + tarIdx); // Expected: -1 since 3 is not in the array
    }
}

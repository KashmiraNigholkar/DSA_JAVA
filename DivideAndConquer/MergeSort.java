package DivideAndConquer;

public class MergeSort {
    // Merge function to count and merge sorted arrays
    public static int merge(int arr[], int left, int mid, int right) {
        int i = left, j = mid + 1, k = 0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1); // Count inversions
            }
        }

        // Copy remaining elements
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // Copy back to original array
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return invCount;
    }

    // Recursive merge sort
    private static int mergeSort(int arr[], int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            invCount += mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);
            invCount += merge(arr, left, mid, right);
        }
        return invCount;
    }

    // Wrapper method
    public static int getInvCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 4, 6, 7};
        System.out.println("Inversion count = " + getInvCount(arr));
    }
}

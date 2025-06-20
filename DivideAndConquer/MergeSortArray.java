package DivideAndConquer;

public class MergeSortArray {
    public static String[] mergeSort(String[] arr, int lo, int hi) {
        if (lo == hi) {
            String[] A = { arr[lo] };
            return A;
        }

        int mid = lo + (hi - lo) / 2;
        String[] arr1 = mergeSort(arr, lo, mid);
        String[] arr2 = mergeSort(arr, mid + 1, hi);
        return merge(arr1, arr2);
    }

    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];

        int i = 0, j = 0, idx = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[idx++] = arr1[i++];
            } else {
                arr3[idx++] = arr2[j++];
            }
        }

        while (i < m) {
            arr3[idx++] = arr1[i++];
        }

        while (j < n) {
            arr3[idx++] = arr2[j++];
        }

        return arr3;
    }

    static boolean isAlphabeticallySmaller(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        String[] sorted = mergeSort(arr, 0, arr.length - 1);

        for (String s : sorted) {
            System.out.println(s);
        }
    }
}

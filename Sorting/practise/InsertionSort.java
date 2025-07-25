package Sorting.practise;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) { // i should start from 1
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3,2,1,6,2,8,7,4,3,2,5 };
        insertionSort(arr);
        printArr(arr);
    }
}

    


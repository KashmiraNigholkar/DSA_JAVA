package Sorting.practise;

public class CountingSort {
    public static void CountingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);

        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;


            }
        }
        
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
            


        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[]={5,9,6,4,6,8,4};
        CountingSort(arr);
        printArr(arr);
        
    
    }
    
    
}

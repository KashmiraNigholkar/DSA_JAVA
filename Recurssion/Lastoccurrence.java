package Recurssion;

public class Lastoccurrence {
    public static int lastOcurrence(int arr[], int key,int i){
        if(i == arr.length){
            return -1;

        }
        int isFound=lastOcurrence(arr,key, i+1);
        if(isFound ==-1 && arr[i]==key){
            return i;


        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={8,7,9,6,4,5,1,7};
        System.out.println(lastOcurrence(arr, 5, 0));
    }
    
}

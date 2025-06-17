package Recurssion;

public class FirstOccurrance {
    public static int FirstOccurrance (int arr[],int key,int i){
        if(i==arr.length){
            return -1;

        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurrance(arr,key,i);
    }
    public static void main(String[] args) {
        int arr[]={8,3,4,7,6,8,9};
        System.out.println(FirstOccurrance(arr,5,0));
    }
    
}

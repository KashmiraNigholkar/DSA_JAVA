package DivideAndConquer;

public class BubbleSorte {
    public static void BubbleSorte(int arr[]){
        for(int turn =0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,9};
        System.out.println(arr);
    }
    
}

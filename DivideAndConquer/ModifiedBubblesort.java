package DivideAndConquer;

public class ModifiedBubblesort {
    public static void ModifiedBubblesort(int arr[]){
    for(int turn =0;turn<arr.length-1;turn++){
        boolean swapped=false;
        for(int j=0;j<arr.length-1-turn;turn++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;

            }

        }
        if(swapped==false){
            break;

        }
    }
}
public static void main(String[] args) {
    int arr[]={1,2,4,5,6};
    System.out.println();

}

    
}

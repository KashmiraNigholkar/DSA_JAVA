package DivideAndConquer;

public class GetInvCount {
    public static int getInvCount(int arr[]){
        int n=arr.length;
        int invcount=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                invcount++;

            }
        }
        }
        return invcount ;
    }
    public static void main(String[] args) {
        int arr[]={1,20,6,7,8,4,5};
        System.out.println("Inversion count="+getInvCount(arr));
    }
    
}

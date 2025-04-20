package DSA_JAVA.Array;
import java.util.*;

public class Linearsearch {
    public static int Linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;


            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=2;
        int index=Linearsearch(numbers,key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("key is at index:"+index);

        }
    }
    

}



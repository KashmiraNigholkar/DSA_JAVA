import java.util.*;
public class MaximumBalancedStringPartition {
    static int BalancedPartion(String  str,int n){
        if(n==0)
        return 0;
        int r=0, l=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='R'){
                r++;
            }
            else if(str.charAt(i)=='L'){
                l++;
            }
            if(r==l){
                ans++;
            }
        }
        return ans;


        

    }
    public static void main(String[] args) {
        String str="LLRRRLLRRL";
        int n=str.length();
        System.out.println(BalancedPartion(str,n)+"\n");
    }
    
}

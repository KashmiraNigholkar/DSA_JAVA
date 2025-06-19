package Recurssion;

public class FriendsPAiring {
    public static int FriendsPairing(int n){
         if(n==1||n==2){
        return n;

    }
    int fnm1=FriendsPairing(n-1);
    int fnm2=FriendsPairing(n-2);
    int pairWays=(n-1)* fnm2;

    int totalways=fnm1+pairWays;
    return totalways;



    }
    public static void main(String[] args) {
        System.out.println(FriendsPairing(3));
    }
   
    
}

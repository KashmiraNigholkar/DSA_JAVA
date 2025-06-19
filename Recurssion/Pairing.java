package Recurssion;

public class Pairing {
    public static int FriendsPAiring(int n){
        if(n==1||n==2){
            return n;

        }
        return FriendsPAiring(n-1) +(n-1) *FriendsPAiring(n-2);

    }
    public static void main (String args[]){
        System.out.println(FriendsPAiring(3));
    }
    
}

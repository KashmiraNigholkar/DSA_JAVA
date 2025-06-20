package Recurssion;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n,String src, String helper,String dest){
        if(n==1){
            System.out.println("transfer disk"+n+"from "+src +"to"+dest);
            return ;

        }
        towerOfHanoi(n-1, src, helper, dest);
        System.out.println("transfer disk"+n+"from "+src+"to "+helper);
        towerOfHanoi(n-1, helper,src, dest);

    }
    public static void main(String[] args) {
        int n=4;
        towerOfHanoi(n, "A","B","c");
    }
}
    

    


package BitManipulation;

public class isPowerofTwo {
    public static boolean isPowerofTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(15));
    }
    
}

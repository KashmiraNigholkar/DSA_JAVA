package BitManipulation;

public class UpdateIthBit {
     public static int ClearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
     }
    public static int updateIthBit(int n,int i, int newBit){
    n=ClearIthBit(n,i);
    int BitMask=newBit <<i;
    return n|BitMask;
    
}


public static void main(String[] args) {
    System.out.println(updateIthBit(10,2,1));
}

}
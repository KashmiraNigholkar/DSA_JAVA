package BitManipulation;

public class GetIthBit {
    public static int getIthBit(int num,int i){
        return (num >>i);

    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10,2));
    }
    
}


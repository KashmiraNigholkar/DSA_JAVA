package FunctionOverloading.DataType;

public class BinTODec {
    public static void BinTODec(int BinTODecNum){
        int pow=0;
        int decNum=0;
        int original=BinTODecNum;

        while(BinTODecNum>0){
            int lastDigit=BinTODecNum%10;
            decNum=decNum +(lastDigit *(int) Math.pow(2,pow));
            pow++;
           BinTODecNum= BinTODecNum/10;

        }
        System.out.println("decimal of "+original +"="+decNum);
    }
    public static void main(String[] args) {
      BinTODec(1010);
    }
    
}

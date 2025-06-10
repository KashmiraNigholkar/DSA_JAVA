package BitManipulation;

public class UppercaseTOLowercase {
    public static void main(String[] args) {
        for(char ch='A';ch<='z';ch++){
            System.out.println((char)(ch |' '));
        }
    }
    
}

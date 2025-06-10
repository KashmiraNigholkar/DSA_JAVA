package BitManipulation;

public class OddOrEven {
    
    // Method to check if a number is odd or even using bit manipulation
    public static void oddOrEven(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println(n + " is Even Number");
        } else {
            System.out.println(n + " is Odd Number");
        }
    }

    // Main method to test the oddOrEven method
    public static void main(String[] args) {
        oddOrEven(3);   // Output: 3 is Odd Number
        oddOrEven(11);  // Output: 11 is Odd Number
        oddOrEven(14);  // Output: 14 is Even Number
    }
}

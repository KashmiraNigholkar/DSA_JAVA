package Recurssion;

public class PrintNumberFromNToOne {
    
    //  print numbers from n to 1 (Descending Order)
    public static void printDec(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }

    //  print numbers from 1 to n (Ascending Order)
    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        
        System.out.println("Increasing Order:");
        printInc(n);
        
        System.out.println("Decreasing Order:");
        printDec(n);
    }
}

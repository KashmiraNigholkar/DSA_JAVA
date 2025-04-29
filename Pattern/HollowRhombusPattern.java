package Pattern;

public class HollowRhombusPattern {
    public static void HollowRhombusPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print hollow rhombus
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HollowRhombusPattern(9);
    }
}

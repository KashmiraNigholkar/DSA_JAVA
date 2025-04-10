public class InvertedStart {
    public static void main(String[] args) {
        int n=6;
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
    
}

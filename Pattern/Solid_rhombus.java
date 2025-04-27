package Pattern;

public class Solid_rhombus {
    public static void Solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.println(" ");

            }
            for(int j=1;j<=n;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Solid_rhombus(5);
    }
    
}

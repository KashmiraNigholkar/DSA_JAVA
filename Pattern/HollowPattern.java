public class HollowPattern {
    public static void main(String[] args) {
        int rows=6;
        int coloumn=6;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=coloumn;j++){
                if(i==1||i==rows||j==1||j==coloumn){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println( );
        }
    }
    
}

package TwoDArrays;

public class TwoDArray {
    
        public static void main(String[] args) {
            
            int rows = 3;
            int cols = 4;
    
            
            int[][] matrix = new int[rows][cols];
    
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = (i + 1) * (j + 1);  
                }
            }
    
         
            System.out.println("2D Array (Matrix):");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();  
            
        }
    }
    
    
}

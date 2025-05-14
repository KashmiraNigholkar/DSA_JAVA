package TwoDArrays.PractiseSet;

public class PrintCount {
    public static void main (String args[]){
        int [][]array={{4,7,8},{8,8,7}};
        int countOf7=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==7){
                    countOf7++;
                }
            }

        }
        System.out.println("countof7 is:"+countOf7);

    }
    
}

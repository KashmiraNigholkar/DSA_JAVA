import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,25,10,20,50,100,200,500,1000};
        Arrays.sort(coins,Comparator.reverseOrder());

        int countOfCoins=0;
        int amount=510;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount-=coins[i];

                }
            }
        }
        System.out.println("Total Min Coins used ="+countOfCoins);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+"");
        }
        System.out.println();
    }
    
}

package Backtracking;

public class FindSubSet {
    public static void FindSubSet(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return ;

        }
        FindSubSet(str, ans+str.charAt(i),i+1);
        FindSubSet(str,ans,i+1);

    }
    public static void main(String args[]){
        String str="abc";
        FindSubSet(str,"",0);
        
    }
    
}

package Recurssion;

public class RemoveDuplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr,boolean map[] ){
        if(idx==str.length()){
            System.out.println(newStr);
            return ;


        }
        char currChar=str.charAt(idx);
        if(map[Character.toLowerCase(currChar)-'a']){
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[Character.toLowerCase(currChar)-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str="Kashmira";
        boolean [] map=new boolean[26];
        removeDuplicates(str, 0,  new StringBuilder(""),  map);
    }
    
}

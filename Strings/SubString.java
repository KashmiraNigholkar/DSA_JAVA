package Strings;

public class SubString {
    public static String subString1(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr +=str.charAt(i);

        }
        return substr;
    }
    public static void main(String[] args) {
        String str="Helloworld";
        System.out.println(subString1(str,0,7));
    }
    
}

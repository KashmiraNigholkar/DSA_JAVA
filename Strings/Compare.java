package Strings;

public class Compare {
    public static void main(String[] args) {
        String s1="kashmira";
        String s2="kashmira";
        String s3=new String("kashmira");


        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(s1==s3){
            System.out.println("Strings are not equal.");
        }
        else{
            System.out.println("strings are not equal");
        }
    }
    
}

package Strings;

public class CharAt {
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+"");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        String Firstname="kashmira";
        String LastName="NigholKar";


        String fullName=Firstname+" "+LastName;
        printLetter(Firstname);


    }
    
}

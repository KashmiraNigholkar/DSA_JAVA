package OOPS;

public class BankAccount {
    public static void main(String[] args) {
        BankAccountdemo MyAcc=new BankAccountdemo();
        MyAcc.username="kashmira";
        MyAcc.setPassword("abcdefghijk");
        System.out.println(MyAcc.username);
        // System.out.println(MyAcc.setPassword("abcd"));


        
    }
    
}
    class BankAccountdemo{
    public String username;
    private String password;
    public void setPassword (String pwd){
        password =pwd;

    }
}

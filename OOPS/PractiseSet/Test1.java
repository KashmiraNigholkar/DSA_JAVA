class Test{
    static int a=10;
    static int b;
    static void changeB(){
        b=a*3;

    }
}


public class Test1 {
    public static void main(String[] args) {
        Test t=new Test();
        t.changeB();
        System.out.println(Test.a+Test.b);
    }
    
}

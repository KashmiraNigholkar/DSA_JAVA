package OOPS;

public class Basic {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(15);
        System.out.println(p1.tip);
        // p1.setcolor("Yellow");
        // System.out.println(p1.setcolor("yellow"));
        p1.color="yellow";
        System.out.println(p1.color);

    }
    
}

class Pen{
    String color;
    int tip;

    void setcolor (String newColor){
        color =newColor;
    }
    void setTip(int newTip){
        tip =newTip;
    }
}

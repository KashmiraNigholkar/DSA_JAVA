package DSA_JAVA.Array;

public class Argument {
    public static void update(int marks[]) {
        // int[ ] marks=new int[50];
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;

        }
    }
    public static void main(String[] args) {
        int marks[]={98,80,89};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+"");

        }
        System.out.println();
    }

    
}

package ArrayList;

import java.util.ArrayList;

public class Multidimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>MainList=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);list.add(2);

    
        MainList.add(list);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        MainList.add(list2);

        for(int i=0;i<MainList.size();i++){
            ArrayList<Integer>currList=MainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.println(currList.get(j)+"");
            }
            System.out.println();

        }
        System.out.println(MainList);

    }
    
}

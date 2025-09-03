package Hashing;

import java.util.HashMap;

public class ArrayToArrayListConersion {
    static int map(int n, String keys[],int arr[],String s){
        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(keys[i],arr[i]);

        }
        if(map.containsKey(s)){
            return map.get(s);

        }else{
            return -1;
        }
    }
}

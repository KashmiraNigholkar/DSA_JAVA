package Practise;

import java.util.ArrayList;

public class BeautifulArray1 {
    public ArrayList<Integer>beautifulArrayList(int n){
        ArrayList<Integer>res=new ArrayList();
        divideConque(1,1,res,n);
        return res;

    }
    private void divideConque(int start, int increment,ArrayList<Integer>res,int n){
        if(start +increment >n){
            res.add(start);
            return;
        }
        divideConque(start,2* increment, res, n);
        divideConque(start+ increment, 2*increment,res, n);
    }
    
}

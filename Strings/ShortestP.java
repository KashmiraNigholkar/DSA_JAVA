package Strings;

public class ShortestP {
    public static float getShortestPath(String Path){
        int x=0, y=0;
        for(int i=0;i<Path.length();i++);
        char dir=Path.charAt(1);

        if(dir=='S'){
            y--;
        }
        else if(dir=='N'){
            y++;


        }
        else if(dir=='W'){
            x--;
        }
        else{
            x++;

        }
        int X2=x*x;
    int Y2=y*y;
    return (float)(Math.sqrt(X2+Y2));


    }
    public static void main(String[] args) {
        String Path="WNEENESENNN";
        System.out.println(getShortestPath(Path));
    }

    
    
}


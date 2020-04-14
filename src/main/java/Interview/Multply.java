package Interview;

public class Multply {
    //basic
    public int multi1(int x, int y){
        return x*y;
    }

    //using for loop
    public int multi2(int x, int y){
        int res=0;
        for(int i=0;i<x;i++){
            res+=y;
        }
        return res;
    }

    //using recursive
    public int multi(int x, int y){
        if(x==0 | y==0) return 0;
        else
            return (x+multi(x,y-1));
    }

    //
    public int mult3(int x, int y){
        if (x==0 | y==0) return 0;
        if (x<0 | y<0) return -mult3(x,y);
        if (x<0 && y <0) return mult3(x,y);
        return 000;
    }

}

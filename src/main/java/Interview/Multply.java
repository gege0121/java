public class Multply {
    ////basic
//    public int multi(int x, int y){
//        return x*y;
//    }

//    //using for loop
//    public int multi(int x, int y){
//        int res=0;
//        for(int i=0;i<x;i++){
//            res+=y;
//        }
//        return res;
//    }

    //using recursive
    public int multi(int x, int y){
        if(x==0 | y==0) return 0;
        else
            return (x+multi(x,y-1));
    }

}

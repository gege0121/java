package Interview;

public class Swap {

    public void swap1(int x, int y){
        y=x-y;
        x=x-y;
        y=y+x;
        System.out.println("x = "+" "+ x + " "+ "and y is " + y);

    }

    public void swap2(int x, int y){
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x = "+" "+ x + " "+ "and y is " + y);
    }

    public static void main(String[] args){
        Swap swap=new Swap();
        int x=2,y=3;
        swap.swap1(x,y);
//        swap.swap2(1,2);
        System.out.println("x = "+" "+ x + " "+ "and y is " + y);
    }
}

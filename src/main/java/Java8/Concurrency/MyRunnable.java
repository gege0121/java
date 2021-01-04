package Java8.Concurrency;

public class MyRunnable implements Runnable {

    public void run(){
        System.out.println("MyRunnable running");
    }

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable(); // or an anonymous class, or lambda...

        Thread thread = new Thread(runnable);
        thread.start();
    }

    ////Anonymous Implementation of Runnable
//    Runnable myRunnable =
//            new Runnable(){
//                public void run(){
//                    System.out.println("Runnable running");
//                }
//            }

    ////Java Lambda Implementation of Runnable
//    Runnable runnable =
//            () -> { System.out.println("Lambda Runnable running"); };
}

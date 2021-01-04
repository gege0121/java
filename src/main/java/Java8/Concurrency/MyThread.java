package Java8.Concurrency;

public class MyThread extends Thread {

    public void run(){
        System.out.println("MyThread running");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }


    ////anonymous subclass of thread
//    Thread thread = new Thread(){
//        public void run(){
//            System.out.println("Thread Running");
//        }
//    }
//
//  thread.start();

}

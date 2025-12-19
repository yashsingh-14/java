package Multithreading;

class OverRiddingStart extends Thread {
    public void start(){
        // super.start();
        System.out.println("Running Start method");
    }
    public void run(){
        System.out.println("Running Run method");
    }
}
class OverRiddingStartMethod {
public static void main(String[] args) {
    OverRiddingStart t1 = new OverRiddingStart();
    t1.start();
    // t1.run();
    System.out.println("Main thread");
}
    
}

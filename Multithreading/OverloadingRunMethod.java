package Multithreading;

class Overloading extends Thread {
    public void run(){
        System.out.println("Run method without parameter:");

    }
    public void run (int i){
        System.out.println("Run method with parameter:"+i);
    }
    
}
class  OverloadingRunMethod {
    public static void main(String[]args){
Overloading t1 = new Overloading();
t1.start();System.out.println("Main thread");
    }

    
}

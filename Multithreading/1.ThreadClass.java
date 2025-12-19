package Multithreading;

class myThread extends Thread {
    public void run(){
        for(int i=1; 1<=5; i++){
            System.out.println("Thread running:"+i);
        }
    }

    
}
class ThreadClass{
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();

        for(int i=1; i<=5; i++){
            System.out.println("Main thread:"+i);
        }
    }
}
